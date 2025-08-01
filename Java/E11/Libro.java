package E11;

public class Libro extends Risorsa {
    private String genere;

    public Libro(String titolo, String autore, String genere) {
        // Chiamo il costruttore della superclasse Risorsa
        // per inizializzare titolo e autore
        // e genero un identificativo unico
        super(titolo, autore);
        this.genere = genere;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + getTitolo() + '\'' +
                ", autore='" + getAutore() + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }

    // Metodo statico per creare un oggetto Libro da una riga di file
    // La riga deve essere nel formato: "Libro;identificativo;titolo;autore;genere"
    // Ad esempio: "Libro;12345;Il Signore degli Anelli;J.R.R. Tolkien;Fantasy"
    public static Libro daRigaFile(String line) {
        String[] parts = line.split(";");
        if (parts.length == 5) {
            String titolo = parts[2].trim();
            String autore = parts[3].trim();
            String genere = parts[4].trim();
            return new Libro(titolo, autore, genere);
        }
        return null;
    }

    // Metodo per restituire una rappresentazione della risorsa
    // in un formato adatto per essere scritto su file
    public String aRigaPerFile() {
        return "Libro;" + getIdentificativo() + ";" + getTitolo() + ";" + getAutore() + ";" + genere;
    }
}
