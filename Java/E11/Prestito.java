package E11;

import java.util.ArrayList;

public class Prestito {
    // Contatore statico per gli identificativi dei prestiti
    // Supponiamo che tutti gli identificativi
    // siano maggiori di 0 e soprattutto incrementali di 1
    // (quindo 0, 1, 2, 3, ...)
    private static int contatore = 0;

    private int identificativo;
    private String clienteCodiceFiscale;
    private String risorsaTitolo;
    private boolean aperto;

    public void setAperto(boolean aperto) {
        this.aperto = aperto;
    }

    public Prestito(String clienteCodiceFiscale, String risorsaTitolo) {
        this.clienteCodiceFiscale = clienteCodiceFiscale;
        this.risorsaTitolo = risorsaTitolo;
        this.identificativo = contatore;
        contatore++;
        aperto = true; // Il prestito è aperto al momento della creazione
    }

    public static int getContatore() {
        return contatore;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public String getClienteCodiceFiscale() {
        return clienteCodiceFiscale;
    }

    public String getRisorsaTitolo() {
        return risorsaTitolo;
    }

    public boolean isAperto() {
        return aperto;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "identificativo=" + identificativo +
                ", clienteCodiceFiscale='" + clienteCodiceFiscale + '\'' +
                ", risorsaTitolo='" + risorsaTitolo + '\'' +
                ", aperto=" + aperto +
                '}';
    }

    private static Prestito daRigaFile(String line) {
        String[] parts = line.split(";");
        if (parts.length == 4) {
            int identificativo = Integer.parseInt(parts[0].trim());
            String clienteCodiceFiscale = parts[1].trim();
            String risorsaTitolo = parts[2].trim();
            boolean aperto = Boolean.parseBoolean(parts[3].trim());
            Prestito prestito = new Prestito(clienteCodiceFiscale, risorsaTitolo);
            prestito.identificativo = identificativo;
            prestito.aperto = aperto;
            return prestito;
        }
        return null;
    }

    public String aRigaPerFile() {
        return identificativo + ";" + clienteCodiceFiscale + ";" + risorsaTitolo + ";" + aperto;
    }

    public static ArrayList<Prestito> leggiDaFile(String nomeFile) {
        ArrayList<Prestito> prestiti = new ArrayList<>();
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(nomeFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Prestito p = daRigaFile(line);
                if (p != null) {
                    prestiti.add(p);
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // Aggiorna il contatore statico per gli identificativi
        // Assumiamo che gli identificativi siano unici e incrementali
        // Se non facessimo così rischiamo di avere identificativi duplicati
        int maxId = -1;
        for (Prestito p : prestiti) {
            if (p.getIdentificativo() > maxId) {
                maxId = p.getIdentificativo();
            }
        }
        contatore = maxId + 1;
        return prestiti;
    }

    public static void salvaPrestitoSuFile(Prestito nuovoPrestito, String nomeFile) {
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(nomeFile, true))) {
            writer.write(nuovoPrestito.aRigaPerFile());
            writer.newLine();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public static void aggiornaPrestitiSuFile(Prestito prestito, String nomeFile) {
        ArrayList<Prestito> prestiti = leggiDaFile(nomeFile);
        for (int i = 0; i < prestiti.size(); i++) {
            if (prestiti.get(i).getIdentificativo() == prestito.getIdentificativo()) {
                prestiti.set(i, prestito);
                break;
            }
        }
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(nomeFile))) {
            for (Prestito p : prestiti) {
                writer.write(p.aRigaPerFile());
                writer.newLine();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
