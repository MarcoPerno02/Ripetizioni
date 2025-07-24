/* 
 * Leggere da input e salvare N numeri float.
 * N viene chiesto in input all'inizio;
 * Calcolare massimo, minimo e media e mediana.
 * La mediana è quel valore inserito al passo N/2 + 1 dove N è il numero di numeri insetriti.
 * Esempio
 * [10, 20, 30, 40] -> N = 4 -> N/2 = 2 -> 30
 * [10, 20, 30, 40, 50] -> N = 5 -> N/2 = 2 -> 30
*/
package E04;
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
        

        // Leggiamo i valori float e li salviamo nel vettore
        float [] vettore = new float[N];
        for (int i = 0; i < vettore.length; i++) {
            System.out.println("Inserire il " + i +"-esimo numero: ");
            while(scanner.hasNextFloat() == false) {
                scanner.nextLine();
                System.out.println("Non hai inserito un numero valido.");
                System.out.println("Inserire il " + i +"-esimo numero: ");
            }
            vettore[i] = scanner.nextFloat();
        }

        float max_v1 = Float.MIN_VALUE;
        float max_v2 = Float.MIN_VALUE;

        // due modi EQUIVALENTI.
        // La prima è la più brutta! Perchè?
        // A livello di velocità e pressochè uguale alle altre,
        // ma possono esserci possibili BUG!!!
        // Sto usando i, se i fosse fuori dalla dimesione del vettore
        // il programma si pianta! Dovrei mettere sempre un try cath...
        // altre righe di codice da scrivere...
        for (int i = 0; i < vettore.length; i++) {
            if(vettore[i] > max_v1) {
                max_v1 = vettore[i];
            }
        }

        // Secondo metodo usare il foreach.
        // Ad ogni passo f contiene il valore corrispondente al passo i-esimo.
        // Con il for each non è possibile accedere ad i però...
        // Non avrò bug a livello di indici, ma non so i.
        for (float f : vettore) {
            if(f > max_v2) {
                max_v2 = f;
            }
        }

        System.out.println("MAX_V1: " + max_v1 + ", MAX_V2: " + max_v2);

        // Per il minimo fallo di compito usando for e foreach
        float min_v1 = Float.MAX_VALUE;
        float min_v2 = Float.MAX_VALUE;

        // Prima versione
        for (int i = 0; i < vettore.length; i++) {
            if(vettore[i] < min_v1) {
                min_v1 = vettore[i];
            }
        }

        // Seconda versione
        for (float f : vettore) {
            if(f < min_v2) {
                min_v2 = f;
            }
        }

        System.out.println("MIN_V1: " + min_v1 + ", MIN_V2: " + min_v2);

        // Per la media fallo di compito
        float somma = 0;
        for (float f : vettore) {
            somma += f;
        }
        float media = somma / N; // Oppure al posto di N vettore.lenght
        System.out.println("La media è: " + media);

        // Calcolo della mediana
        int indiceMediana = N / 2;  // Se N / 2 è tipo 2.5, java, in assenza di altre istruzione di conversione
                                    // arrotonda all'intero più piccolo cioè 2.
        System.out.println("Il valore della mediana si trova in posizione " + indiceMediana + " e vale: " + vettore[indiceMediana]);

        scanner.close();
    }
    
}
