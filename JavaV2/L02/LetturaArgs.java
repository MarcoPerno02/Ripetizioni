package L02;

public class LetturaArgs {
    public static void main(String[] args) {
        /* * ⚠️ Nota di Sicurezza: controlliamo sempre se l'utente ha inserito 
         * entrambi i parametri richiesti (Nome e Età) per evitare l'errore
         * ArrayIndexOutOfBoundsException.
         */
        if (args.length < 2) {
            System.out.println("Errore: Devi passare due parametri (Nome e Età) nei Program Arguments.");
            return; // Blocca il programma se mancano i dati
        }

        // Recuperiamo i dati passati dall'esterno
        String nome = args[0]; // Il primo argomento inserito
        String eta = args[1];  // Il secondo argomento inserito

        // Stampa della frase formattata
        System.out.println("Benvenuto " + nome + ", hai " + eta + " anni!");
    }
}