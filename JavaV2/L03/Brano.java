package L03;

public class Brano {
    // Attributi
    String titolo;
    String artista;
    int durataSecondi;

    // Costruttore
    public Brano(String titolo, String artista, int durataSecondi) {
        this.titolo = titolo;
        this.artista = artista;
        this.durataSecondi = durataSecondi;
    }

    // Metodo per stampare le info formattate
    public void stampaDettagli() {
        System.out.println("\"" + this.titolo + "\" - " + this.artista + " (" + this.durataSecondi + " sec)");
    }
}