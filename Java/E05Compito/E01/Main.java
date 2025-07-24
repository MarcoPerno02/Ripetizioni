package E05Compito.E01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);

        // Leggiamo N, cioè la dimensione del vettore
        do {
            System.out.println("Inserire il numero di numeri da analizzare: ");
            while(scanner.hasNextInt() == false) {
                scanner.nextLine();
                System.out.println("Non hai inserito un numero valido.");
                System.out.println("Inserire il numero di numeri da analizzare: ");
            }
            N = scanner.nextInt();
            if (N < 1) {
                System.out.println("Il vettore non può esser minore di 1");
            }
        } while (N < 1);

        int [] vettore = new int[N];

        // Leggiamo i valori int e li salviamo nel vettore
        for (int i = 0; i < vettore.length; i++) {
            System.out.println("Inserisci numero: ");
            
            // Questo ciclo while ci permette di controllare se un numero insertito è intero.
            // 'scanner.hasNextInt()' rimane in attesa che venga inserito qualcosa (e dato invio)
            // e ritorna 'false' se non è un intero.
            // Se non è un intero, scanner.nextLine() consuma l'input
            // e viene richiestp l'inserimento del numero
            while(scanner.hasNextInt() == false) {
                scanner.nextLine();
                System.out.println("Non hai inserito un numero valido.");
                System.out.println("Inserisci numero: ");
            }

            // Se ha superato il controllo dell'intero allora lo salviamo nel vettore
            vettore[i] = scanner.nextInt();
        }

        // Ora contiamo i numeri pari
        int contatorePari = 0;
        for (int numero : vettore) {
            if(numero % 2 == 0) {
                contatorePari++;
            }
        }

        // Stampiamo quanti numeri pari abbiamo trovato
        System.out.println("Ci sono " + contatorePari + " numeri pari.");


        scanner.close();
    }
}
