package L03;

public class Studente {
    // Attributi
    String nome;
    String cognome;
    double mediaVoti;

    // Costruttore per inizializzare lo studente
    public Studente(String nome, String cognome, double mediaVoti) {
        this.nome = nome;
        this.cognome = cognome;
        this.mediaVoti = mediaVoti;
    }

    // Metodo per presentarsi
    public void presentati() {
        System.out.print("Ciao, sono " + this.nome + " " + this.cognome);
        System.out.println(" e ho una media del " + this.mediaVoti);
    }

    // Metodo che restituisce true se la media è >= 6.0, altrimenti false
    public boolean ePromosso() {
        return this.mediaVoti >= 6.0;
    }
}