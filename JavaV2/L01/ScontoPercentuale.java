public class ScontoPercentuale {
    public static void main(String[] args) {
        // Definizione delle variabili
        double prezzo = 100.0;
        double percentuale = 10.0;

        // Calcolo dello sconto
        double prezzoScontato = prezzo - (prezzo * percentuale / 100);

        // Stampa del risultato
        System.out.println("Prezzo originale: " + prezzo + "€");
        System.out.println("Sconto da applicare: " + percentuale + "%");
        System.out.println("Il prezzo scontato è: " + prezzoScontato + "€");
    }
}