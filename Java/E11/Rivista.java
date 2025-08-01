package E11;

public class Rivista extends Risorsa {
    private String periodicita;

    public Rivista(String titolo, String autore, String periodicita) {
        super(titolo, autore);
        this.periodicita = periodicita;
    }

    public String getPeriodicita() {
        return periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "titolo='" + getTitolo() + '\'' +
                ", autore='" + getAutore() + '\'' +
                ", periodicita='" + periodicita + '\'' +
                '}';
    }

    public static Rivista daRigaFile(String line) {
        String[] parts = line.split(";");
        if (parts.length == 5) {
            String titolo = parts[2].trim();
            String autore = parts[3].trim();
            String periodicita = parts[4].trim();
            return new Rivista(titolo, autore, periodicita);
        }
        return null;
    }

    // Metodo per restituire una rappresentazione della risorsa
    // in un formato adatto per essere scritto su file
    public String aRigaPerFile() {
        return "Rivista;" + getIdentificativo() + ";" + getTitolo() + ";" + getAutore() + ";" + periodicita;
    }
}
