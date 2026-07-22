package L03;

public class TesterBonifico {
    public static void main(String[] args) {
        // Creiamo i due conti
        ContoBancario contoAlice = new ContoBancario("Alice", 500.0);
        ContoBancario contoBob = new ContoBancario("Bob", 100.0);

        System.out.println("--- SALDI INIZIALI ---");
        contoAlice.stampaSaldo();
        contoBob.stampaSaldo();

        // SCENARIO 1: Bonifico valido
        System.out.println("\n--- TENTATIVO 1: Alice invia 200€ a Bob ---");
        
        // Chiamiamo il metodo e salviamo l'esito (true/false) in una variabile
        boolean esito1 = contoAlice.bonifico(contoBob, 200.0);
        
        if (esito1) {
            System.out.println("Esito: Bonifico completato con successo!");
        } else {
            System.out.println("Esito: Bonifico fallito (saldo insufficiente).");
        }

        contoAlice.stampaSaldo();
        contoBob.stampaSaldo();

        // SCENARIO 2: Bonifico oltre il limite del saldo
        System.out.println("\n--- TENTATIVO 2: Alice invia 1000€ a Bob ---");
        
        boolean esito2 = contoAlice.bonifico(contoBob, 1000.0);
        
        if (esito2) {
            System.out.println("Esito: Bonifico completato con successo!");
        } else {
            System.out.println("Esito: Bonifico fallito (saldo insufficiente).");
        }

        // I saldi devono essere rimasti invariati rispetto allo Scenario 1
        contoAlice.stampaSaldo();
        contoBob.stampaSaldo();
    }
}