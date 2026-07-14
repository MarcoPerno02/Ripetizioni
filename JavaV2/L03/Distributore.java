package L03;

public class Distributore {
    // Attributi
    int lattineDisponibili;
    double cassa;

    // Costruttore per inizializzare il distributore
    public Distributore(int lattineIniziali, double cassaIniziale) {
        this.lattineDisponibili = lattineIniziali;
        this.cassa = cassaIniziale;
    }

    // Metodo per inserire moneta e comprare una lattina
    public void inserisciMonetaECompra(double moneta) {
        if (this.lattineDisponibili > 0) {
            this.lattineDisponibili--; // Diminuisce le lattine di 1
            this.cassa += moneta;      // Aggiunge i soldi alla cassa
            System.out.println("Lattina erogata con successo!");
        } else {
            System.out.println("Lattine esaurite! Moneta da " + moneta + "€ restituita.");
        }
    }

    // Metodo per stampare il resoconto
    public void stampaResoconto() {
        System.out.println("===== RESOCONTO DISTRIBUTORE =====");
        System.out.println("Lattine rimaste: " + this.lattineDisponibili);
        System.out.println("Soldi in cassa: " + this.cassa + "€");
        System.out.println("==================================");
    }
}
