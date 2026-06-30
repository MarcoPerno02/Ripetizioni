package L02;

public class ContaNumeriPari {
    public static void main(String[] args) {
        // Definizione di un array di 8 numeri misti (positivi e negativi)
        int[] numeri = {12, -5, 7, 0, 14, -22, 9, 18};
        
        // Variabile contatore obbligatoriamente inizializzata a zero
        int conteggio = 0;

        // Ciclo classico per scorrere l'intero array
        for (int i = 0; i < numeri.length; i++) {
            // Se il resto della divisione per 2 è zero, il numero è pari
            if (numeri[i] % 2 == 0) {
                conteggio++; // Incrementiamo il contatore di 1
            }
        }

        System.out.println("Nel vettore ci sono " + conteggio + " numeri pari.");
    }
}