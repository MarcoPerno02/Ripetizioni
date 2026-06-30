package L02;

public class AppelloClasse {
    public static void main(String[] args) {
        // Vettore contenente i nomi degli studenti
        String[] registro = {"Anna", "Marco", "Sofia", "Luigi", "Paola"};

        // Scorriamo il registro
        for (int i = 0; i < registro.length; i++) {
            /* * Trucco d'esame: per l'utente gli studenti vanno da 1 a 5, 
             * ma gli indici Java vanno da 0 a 4. Usiamo (i + 1) racchiuso 
             * tra parentesi per fare l'operazione matematica prima della stampa.
             */
            System.out.println("Studente " + (i + 1) + ": " + registro[i]);
        }
    }
}