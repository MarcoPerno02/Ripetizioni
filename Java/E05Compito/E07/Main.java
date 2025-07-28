package E05Compito.E07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Inserisci n da calcolare fattoriale (n>=0): ");
            while(scanner.hasNextInt() == false) {
                scanner.nextLine();
                System.out.println("Non hai insetito n valido.");
                System.out.println("Inserisci n da calcolare fattoriale (n>=0): ");
            }
            // Leggiamo il numero N che può essere negativo, positivo o uguale a 0
            n = scanner.nextInt();
            if(n < 0) {
                System.out.println("n non può essere minore di 0");
            }
        // Cicliamo finchè n è minore di 0
        } while (n < 0);

        if(n == 0) {
            System.out.println("Il fattoriale di " + n + " è 1");
        } else {
            long fattoriale = 1;
            for(int i = 1; i <= n; i++) {
                fattoriale *= i;
            }
            System.out.println("Il fattoriale di " + n + " è " + fattoriale);
        }

        scanner.close();
    }
}
