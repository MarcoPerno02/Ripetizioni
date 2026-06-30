package L02;

public class ControlloreBagagli {
    public static void main(String[] args) {
        // Buona pratica: controlliamo prima se l'utente ha effettivamente passato un argomento
        if (args.length < 1) {
            System.out.println("Errore: Non hai inserito il peso del bagaglio nei Program Arguments.");
            return; // Interrompe l'esecuzione del programma immediatamente
        }

        // Convertiamo la stringa ricevuta in input in un numero intero
        int peso = Integer.parseInt(args[0]);

        // Logica di controllo del peso
        if (peso > 20) {
            System.out.println("Bagaglio in sovrappeso! Pagamento supplemento richiesto.");
        } else {
            System.out.println("Bagaglio accettato.");
        }
    }
}