package E14;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Studente> studenti = new ArrayList<>();

        // 1. Lettura studenti
        try (BufferedReader br = new BufferedReader(new FileReader("Java/E14/studenti.txt"))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                String[] dati = riga.split(",");
                if (dati.length != 5) {
                    System.err.println("Riga studenti malformata: " + riga);
                    continue;
                }
                String tipo = dati[0].trim();
                String nome = dati[1].trim();
                String cognome = dati[2].trim();
                int anno;
                try {
                    anno = Integer.parseInt(dati[3].trim());
                } catch (NumberFormatException e) {
                    System.err.println("Anno di nascita non valido: " + riga);
                    continue;
                }
                String extra = dati[4].trim();

                Studente s;
                if (tipo.equalsIgnoreCase("Superiore")) {
                    s = new StudenteSuperiore(nome, cognome, anno, extra);
                } else if (tipo.equalsIgnoreCase("Universitario")) {
                    s = new StudenteUniversitario(nome, cognome, anno, extra);
                } else {
                    System.err.println("Tipo studente sconosciuto: " + tipo);
                    continue;
                }
                studenti.add(s);
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura di studenti.txt: " + e.getMessage());
            return;
        }

        // 2. Lettura voti
        try (BufferedReader br = new BufferedReader(new FileReader("Java/E14/voti.txt"))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                String[] dati = riga.split(",");
                if (dati.length != 4) {
                    System.err.println("Riga voti malformata: " + riga);
                    continue;
                }
                String nome = dati[0].trim();
                String cognome = dati[1].trim();
                String materia = dati[2].trim();
                int voto;
                try {
                    voto = Integer.parseInt(dati[3].trim());
                } catch (NumberFormatException e) {
                    System.err.println("Voto non valido: " + riga);
                    continue;
                }

                // Trova lo studente
                Studente trovato = null;
                for (Studente s : studenti) {
                    if (s.nome.equalsIgnoreCase(nome) && s.cognome.equalsIgnoreCase(cognome)) {
                        trovato = s;
                        break;
                    }
                }
                if (trovato != null) {
                    trovato.aggiungiVoto(new Voto(materia, voto));
                } else {
                    System.err.println("Voto senza studente corrispondente: " + riga);
                }
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura di voti.txt: " + e.getMessage());
        }

        // 3. Ordinamento per cognome
        studenti.sort(Comparator.comparing(s -> s.cognome));

        // 4. Stampa schede
        for (Studente s : studenti) {
            System.out.println(s.scheda());
            System.out.println("----------------------");
        }

        // 5. Salvataggio report
        try (PrintWriter pw = new PrintWriter(new FileWriter("report_studenti.txt"))) {
            for (Studente s : studenti) {
                pw.println(s.scheda());
                pw.println("----------------------");
            }
        } catch (IOException e) {
            System.err.println("Errore nella scrittura del report: " + e.getMessage());
        }
    }
}
