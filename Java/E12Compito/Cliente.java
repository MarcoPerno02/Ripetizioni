package E12Compito;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Cliente(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }

    public static ArrayList<Cliente> leggiClientiDaFile(String nomeFile) {
        ArrayList<Cliente> clienti = new ArrayList<>();
        
        // Lettura da file con scanner
        try (java.util.Scanner scanner = new java.util.Scanner(new java.io.File(nomeFile))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] parti = linea.split(";");
                if (parti.length == 3) {
                    Cliente cliente = new Cliente(parti[0], parti[1], parti[2]);
                    clienti.add(cliente);
                }
            }
        } catch (java.io.FileNotFoundException e) {
            System.err.println("File non trovato: " + nomeFile);
        }
        return clienti;
    }

    public String aRigaFile() {
        return nome + ";" + cognome + ";" + codiceFiscale;
    }

    public static void salvaClienteSuFile(String nomeFile, Cliente nuovoCliente) {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileWriter(nomeFile, true))) {
            writer.println(nuovoCliente.aRigaFile());
        } catch (java.io.IOException e) {
            System.err.println("Errore durante la scrittura su file: " + e.getMessage());
        }
    }

    public static boolean codiceFiscaleGiaPresente(ArrayList<Cliente> clienti, String codiceFiscale) {
        for (Cliente cliente : clienti) {
            if (codiceFiscale.equals(cliente.getCodiceFiscale())) {
                return true;
            }
        }
        return false;
    }
}
