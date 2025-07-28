package E05Compito.E05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 0;
        Scanner scanner = new Scanner(System.in);

        // Leggiamo dimensione del vettore e verifichiamo che sia valida
        do {
            System.out.println("Inserire lunghezza vettore: ");

            while(scanner.hasNextInt() == false) {
                scanner.nextLine();
                System.out.println("Non hai inserito un numero valido.");
                System.out.println("Inserire lunghezza vettore: ");

            }
            // Leggiamo il numero N che può essere negativo, positivo o uguale a 0
            N = scanner.nextInt();
            if(N < 0) {
                System.out.println("La lunghezza del vettore non può essere negativa. Riprova.");
            } else if (N == 0) {
                System.out.println("La lunghezza del vettore non può essere zero. Riprova.");
            }
        // Con questo while cicliamo finchè N è minore o uguale a 0, quindi non valido
        } while (N <= 0);

        // Creiamo il vettore di dimensione N
        int [] vettore = new int [N];
        // Cicliamo per leggere gli N elementi del vettore
        for(int i = 0; i < N; i++) {
            System.out.println("Inserire elemento " + (i+1) + ": ");

            while(scanner.hasNextInt() == false) {
                scanner.nextLine();
                System.out.println("Non hai inserito un numero valido.");
                System.out.println("Inserire elemento " + (i+1) + ": ");

            }
            vettore[i] = scanner.nextInt();
        }

        // Calcoliamo la somma degli elementi dispari
        int sommaDispari = 0;
        for(int i = 0; i < N; i++) {
            if(vettore[i] % 2 != 0) {
                sommaDispari += vettore[i];
            }
        }

        System.out.println("La somma degli elementi dispari è: " + sommaDispari);

        // Calcoliamo la media per i numeri pari
        int sommaPari = 0;
        int NElementiPari = 0;
        float mediaPari = 0;
        for(int i = 0; i < N; i++) {
            if(vettore[i] % 2 == 0) {
                sommaPari += vettore[i];
                NElementiPari++;
            }
        }

        // La media è data della somma dei numeri pari diviso il numero di elementi pari
        mediaPari = (float) sommaPari / NElementiPari;

        System.out.println("La media degli elementi pari è: " + mediaPari);

        scanner.close();
    }
}
