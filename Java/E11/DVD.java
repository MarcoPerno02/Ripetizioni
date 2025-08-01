package E11;

public class DVD extends Risorsa {
    private String durata;

    public DVD(String titolo, String autore, String durata) {
        super(titolo, autore);
        this.durata = durata;
    }

    public String getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "titolo='" + getTitolo() + '\'' +
                ", autore='" + getAutore() + '\'' +
                ", durata='" + durata + '\'' +
                '}';
    }

    public static DVD daRigaFile(String line) {
        String[] parts = line.split(";");
        if (parts.length == 5) {
            String titolo = parts[2].trim();
            String autore = parts[3].trim();
            String durata = parts[4].trim();
            return new DVD(titolo, autore, durata);
        }
        return null;
    }

    public String aRigaPerFile() {
        return "DVD;" + getIdentificativo() + ";" + getTitolo() + ";" + getAutore() + ";" + durata;
    }
}
