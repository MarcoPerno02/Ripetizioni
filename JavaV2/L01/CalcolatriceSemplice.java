public class CalcolatriceSemplice {
    public static void main(String[] args) {
        // Definizione dei numeri e dell'operatore
        int num1 = 20;
        int num2 = 5;
        char operatore = '/'; // Può essere '+', '-', '*', '/'

        // Esecuzione dell'operazione
        switch (operatore) {
            case '+':
                System.out.println("Risultato: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Risultato: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Risultato: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Risultato: " + ((double) num1 / num2));
                } else {
                    System.out.println("Errore: Impossibile dividere per zero!");
                }
                break;
            default:
                System.out.println("Errore: Operatore non valido.");
        }
    }
}