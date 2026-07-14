package L03;

public class ContoCorrente {
    // Attributi
    String titolare;
    double saldo;

    // Costruttore per creare il conto con un saldo iniziale
    public ContoCorrente(String titolare, double saldoIniziale) {
        this.titolare = titolare;
        this.saldo = saldoIniziale;
    }

    // Metodo per aggiungere soldi
    public void versa(double importo) {
        this.saldo += importo;
        System.out.println("Hai versato: " + importo + "€");
    }

    // Metodo per togliere soldi
    public void preleva(double importo) {
        // Per semplicità, qui non controlliamo se ci sono abbastanza soldi,
        // ma in un programma reale sarebbe un controllo fondamentale da aggiungere!
        this.saldo -= importo;
        System.out.println("Hai prelevato: " + importo + "€");
    }

    // Metodo per stampare la situazione attuale
    public void stampaSaldo() {
        System.out.println("Il saldo attuale di " + this.titolare + " è di: " + this.saldo + "€");
        System.out.println("---------------------------");
    }
}
