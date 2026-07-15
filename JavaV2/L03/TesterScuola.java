package L03;

public class TesterScuola {
    public static void main(String[] args) {
        // 1. Dichiaro e inizializzo un vettore capace di contenere 4 oggetti di tipo Studente
        Studente[] classe = new Studente[4];

        // 2. Istanzio i 4 studenti direttamente nelle posizioni del vettore
        classe[0] = new Studente("Mario", "Rossi", 7.5);   // Promosso
        classe[1] = new Studente("Luigi", "Verdi", 5.2);   // Bocciato
        classe[2] = new Studente("Anna", "Bianchi", 8.8);  // Promosso
        classe[3] = new Studente("Sofia", "Neri", 5.8);    // Bocciato

        // 3. Ciclo for per scorrere tutto il vettore
        System.out.println("=== ANALISI DELLA CLASSE ===");
        for (int i = 0; i < classe.length; i++) {
            // Chiamo il metodo presentati() sull'oggetto nella posizione i
            classe[i].presentati();

            // Verifico l'esito usando il metodo ePromosso() dentro l'if
            if (classe[i].ePromosso()) {
                System.out.println("Stato: PROMOSSO \\(^_^)/");
            } else {
                System.out.println("Stato: BOCCIATO (v_v)");
            }
            System.out.println("---------------------------------------------");
        }
    }
}