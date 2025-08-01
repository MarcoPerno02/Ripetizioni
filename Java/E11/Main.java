package E11;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // è come Cliente [], ma qua non ho limiti di lunghezza
        ArrayList<Cliente> clienti = Cliente.caricaClientiDaFile("Java/E11/clienti.txt");
        /* for (Cliente c : clienti) {
            System.out.println(c);
        } */

        ArrayList<Risorsa> risorse = Risorsa.caricaRisorseDaFile("Java/E11/risorse.txt");
        /* for (Risorsa r : risorse) {
            System.out.println(r);
        } */
        ArrayList<Prestito> prestiti = Prestito.leggiDaFile("Java/E11/prestiti.txt");

        while (true) {
            System.out.println("Inserisci 0 per aggiunta prestito o 1 per termina prestito:");
            Scanner scanner = new Scanner(System.in);
            int scelta = scanner.nextInt();
            if (scelta == 0) {
                System.out.print("Inserisci il codice fiscale: ");
                scanner.nextLine(); // consuma il newline rimasto
                String codiceFiscale = scanner.nextLine();

                Cliente cliente = null;
                for (Cliente c : clienti) {
                    if (c.getCodiceFiscale().equalsIgnoreCase(codiceFiscale)) {
                        cliente = c;
                        break;
                    }
                }

                if (cliente == null) {
                    System.out.println("Utente non trovato. Inserisci i dati per creare un nuovo utente.");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Cognome: ");
                    String cognome = scanner.nextLine();
                    // Puoi aggiungere altri campi se necessario

                    cliente = new Cliente(nome, cognome, codiceFiscale);
                    clienti.add(cliente);
                    Cliente.salvaClienteSuFile(cliente, "Java/E11/clienti.txt");
                    System.out.println("Nuovo utente creato e salvato.");
                } else {
                    System.out.println("Utente trovato: " + cliente);
                }

                System.out.print("Inserisci il titolo della risorsa: ");
                String titoloRisorsa = scanner.nextLine();

                Risorsa risorsaTrovata = null;
                for (Risorsa r : risorse) {
                    if (r.getTitolo().equalsIgnoreCase(titoloRisorsa)) {
                        risorsaTrovata = r;
                        break;
                    }
                }

                if (risorsaTrovata == null) {
                    System.out.println("Risorsa non trovata.");
                } else {
                    System.out.println("Risorsa trovata: " + risorsaTrovata);
                    boolean giaInPrestito = false;
                    for (Prestito p : prestiti) {
                        if (p.getRisorsaTitolo().equals(titoloRisorsa) && p.isAperto() == true) {
                            giaInPrestito = true;
                            break;
                        }
                    }
                    if (giaInPrestito == true) {
                        System.out.println("La risorsa è già in prestito.");
                    } else {
                        // qui puoi aggiungere il codice per creare un nuovo prestito
                        System.out.println("Puoi procedere con il prestito.");

                        Prestito nuovoPrestito = new Prestito(codiceFiscale, titoloRisorsa);
                        prestiti.add(nuovoPrestito);
                        Prestito.salvaPrestitoSuFile(nuovoPrestito, "Java/E11/prestiti.txt");
                        System.out.println("Prestito creato e salvato.");
                    }
                }

            } else if (scelta == 1) {
                // codice per termina prestito
                System.out.print("Inserisci il titolo della risorsa da restituire: ");
                scanner.nextLine(); // consuma il newline rimasto
                String titoloRisorsa = scanner.nextLine();

                Risorsa risorsaTrovata = null;
                for (Risorsa r : risorse) {
                    if (r.getTitolo().equalsIgnoreCase(titoloRisorsa)) {
                        risorsaTrovata = r;
                        break;
                    }
                }

                if (risorsaTrovata == null) {
                    System.out.println("Risorsa non trovata.");
                } else {
                    Prestito prestitoDaChiudere = null;
                    for (Prestito p : prestiti) {
                        if (p.getRisorsaTitolo().equalsIgnoreCase(titoloRisorsa) && p.isAperto()) {
                            prestitoDaChiudere = p;
                            break;
                        }
                    }
                    if (prestitoDaChiudere == null) {
                        System.out.println("Nessun prestito aperto trovato per questa risorsa.");
                    } else {
                        prestitoDaChiudere.setAperto(false);
                        Prestito.aggiornaPrestitiSuFile(prestitoDaChiudere, "Java/E11/prestiti.txt");
                        System.out.println("Prestito terminato e aggiornato su file.");
                    }
                }
            } else {
                System.out.println("Scelta non valida.");
            }
        }
    }
}
