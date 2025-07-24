/*
 * Creare un programma che legga da input da tastiera due numeri interi e ne stampi la somma.
 * Se l'inout insertito non è intero continuare a chiederlo finchè non è corretto.
 */
import java.util.Scanner;  // 'java' è una liberia.
                           // Una libreria contiene funzioni/metodi e classi già fatte.
                           // In particolare la libreria Scanner contiene quei metodi
                           // per leggere un input da tastiera

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // System.in indica la tastiera come sorgente da passare
                                                   // alla classe Scanner.
                                                   // System.out invece indica il terminale per stampare i risultati.
                                                   // Scanner è la classe.
                                                   // new Scanner(...) si dice che è "l'istanziazione della classe"
                                                   // scanner è l'istanzia o l'pggeto creato a partire da una classe.

        int numero1, numero2, somma;  // int, double, float, booolean ecc... sono dei primitivi.
                                      // A differenza degli oggeti (esempio la variabile scanner) non hanno metodi e proprietà,
                                      // quindi non posso fare tipo numero1.metodo()
        
        System.out.println("Inserisci il primo numero: ");
        while (scanner.hasNextInt() != true) {
            // Qunado scriviamo da tastiera i nostri caratteri finiscono in un buffer.
            // Un buffer è un'area di memoria del pc che contiene dati.
            // Il metodo hasNextInt legge il buffer, ma non toglie il contenuto,
            // quindi il buffer continuerà ad essere pieno se non lo "consumiamo"
            // e quindi si crea un loop infinto perchè hasNextInt continua a vedere che c'è qualcosa e
            // non attende che l'utente inserisca altro.
            // Per "consumare" il valore errato dobbiamo usare scanner.next();
            String valoreErrato = scanner.next();
            System.out.println("Il valore da te inserito '" + valoreErrato + "' non è corretto.");
            System.out.println("Inserisci il primo numero: ");
        }
        numero1 = scanner.nextInt();
        
        System.out.println("Inserisci il secondo numero: ");
        while (scanner.hasNextInt() != true) {
            String valoreErrato = scanner.next();
            System.out.println("Il valore da te inserito '" + valoreErrato + "' non è corretto.");
            System.out.println("Il numero inserito non è un intero!\nInserisci il secondo numero: ");
        }
        numero2 = scanner.nextInt();

        scanner.close();

        somma = numero1 + numero2;

        System.out.println("La somma è: " + Integer.toString(somma));
    }
}