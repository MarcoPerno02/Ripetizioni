package L02;

public class VettoreMatematica {
    public static void main(String[] args) {
        // 1. Creazione del vettore di tipo double con i 4 prezzi richiesti
        double[] prezzi = {12.50, 4.20, 19.99, 1.00};
        
        // Variabile di appoggio per accumulare la somma, inizializzata a 0
        double somma = 0;

        // 2. Ciclo for per scorrere l'intero vettore
        for (int i = 0; i < prezzi.length; i++) {
            somma = somma + prezzi[i]; // Oppure: somma += prezzi[i];
        }

        // 3. Calcolo della media delle due cifre
        double media = somma / prezzi.length;

        // 4. Stampa dei risultati
        System.out.println("La somma totale dei prezzi è: " + somma + "€");
        System.out.println("La media dei prezzi è: " + media + "€");
    }
}