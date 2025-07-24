/* 
 * Data in input una stringa dire se è palindroma.
 * Una stringa è palindroma se è solo se letta al contrario è uguale alla stringa originale(entrambe senza spazi,
 * e entambre tutte minuscole, la stringa data in input potrebbe dover essere manipolata prima del controllo finale).
 * 
 * Esempio:
 * La stringa "i topi non aVevano nipOti" è palindroma
*/
package E03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leggiamo tutto il buffer, ovvero tutta la linea.
        System.out.println("Inserisci la stringa da controllare: ");
        String stringaOriginale = scanner.nextLine();

        // Rendiamo la stringa tutta minuscola e sostituiamo gli spazi con "nulla"
        stringaOriginale = stringaOriginale.toLowerCase();
        stringaOriginale = stringaOriginale.replace(" ", "");

        // Invertiamo la stringa tramite la classe StringBuilder che offre diversi metodi per manipolare una String
        // data in input
        String stringaOriginaleAlContrario = new StringBuilder(stringaOriginale).reverse().toString();

        // Verifichiamo se le due stringhe sono uguali
        // Con stringaOriginale == stringaOriginaleAlContrario facciamo un confronto TRA OGGETTI,
        // ciò significa che sono lo stesso oggetto se sono FISICAMENTE la stessa cosa,
        // ma noi vogliamo un confronto LOGICO, cioè tra i contenuti.
        // Quindi per ottenere ciò dobbiamo usare il metodo 'equals' che fa effettivamente il confronto dei
        // due contienuti.
        if(stringaOriginale.equals(stringaOriginaleAlContrario)) {
            System.out.println("Le due stringhe " + stringaOriginale + " e " + stringaOriginaleAlContrario + " SONO palindrome.");
        }
        else {
            System.out.println("Le due stringhe " + stringaOriginale + " e " + stringaOriginaleAlContrario + " NON SONO palindrome.");
        }

        /*
         * Approfondimento, ma importante:
         * In base a quello detto qua sopra se io avessi il seguente codice:
         *  """
         *  int a = 10;
         *  int b = 10;
         *  if(a == b) {
         *   System.out.println("Sono uguali")
         *  }
         *  else {
         *   System.out.println("Sono diversi")
         *  }
         * """
         * dovrebbe ritornare false...
         * Ma se io lo eseguo ottenfo true! Come mai?
         * ATTENZIONE, il discorso fatto sopra vale SOLO per gli oggetti e
         * NON i primitivi come float, int, boolean ecc...
         * Quindi casi non devo preoccuparmi.
         */

        scanner.close();
    }
}
