package E11;
import java.io.*;
import java.util.*;

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

    // Ora facciamo una funzione che preso in input il
    // nome del file ritorni un vettore di clienti.
    // Attenzione allo static perchè questo metodo
    // deve essere richiamato senza avere ancora istanziato
    // nessun cliente
    public static ArrayList<Cliente> caricaClientiDaFile(String nomeFile) {
        ArrayList<Cliente> clienti = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(nomeFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    // .trim() rimuove gli spazi bianchi all'inizio e alla fine
                    String nome = parts[0].trim();
                    String cognome = parts[1].trim();
                    String codiceFiscale = parts[2].trim();
                    clienti.add(new Cliente(nome, cognome, codiceFiscale));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return clienti;
    }

    public static void salvaClienteSuFile(Cliente cliente, String string) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(string, true))) {
            writer.println(cliente.getNome() + ";" + cliente.getCognome() + ";" + cliente.getCodiceFiscale());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
