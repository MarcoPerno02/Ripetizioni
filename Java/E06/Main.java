/* 
 * Creare un programma sugli animali per bambini.
 * Il programma ha diversi animali sotto forma di classi.
 * Tutte le classi devono implementare il metodo stampaVerso (N.B. non è richiesta creare un'interfaccia per ora)
 * Inoltre per ogni animale sono note alcune informazioni quali:
 *      - nome: String
 *      - numeroDiZampe: int
 *      - terra: boolean
 * Ogni bambino inserirà il nome di un animale, se non esiste richiederlo.
 * Dopo che è stato inserito, verrano visualizzati i dettgali dell'animale
 * e stampato poi attraverso il metodo il verso.
 * Se non viene inserito il nulla il programma deve terminare.
*/

package E06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creiamo 3 animali e passiamo dettagli e anche il verso
        Animale pecora = new Animale("pecora", 4, true, "Bee");
        Animale gallina = new Animale("gallina", 2, true, "Coccode");
        Animale tortora = new Animale("tortora", 2, false, "Cip Cip");

        // Salviamo i nostri animali in un vettore di animali
        Animale [] animaliFattoria = new Animale[3];

        animaliFattoria[0] = pecora;
        animaliFattoria[1] = gallina;
        animaliFattoria[2] = tortora;

        // Leggiamo il nomeAnimale da cercare. Serve do while perchè
        // almeno una iterazione la facciamo.
        // Iteriamo finche nomeAnimale è diverso da stringa vuota ""
        String nomeAnimale = "";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Inserisci il nome dell'animale: ");
            nomeAnimale = scanner.nextLine();

            // Scorriamo sul vettore animali alla ricerca di quel animale con il nome
            // uguale a quello che cercavamo e se lo troviamo stampiamo i dettagli
            for (Animale animale : animaliFattoria) {
                if(animale.nome.equals(nomeAnimale)) {
                    animale.stampaDettagli();
                }
            }
        } while(!nomeAnimale.equals(""));

        scanner.close();
    }
}

class Animale {
    // Queste sono proprietà
    String nome;
    int numeroDiZampe;
    boolean terra;
    String verso;

    // Tutte le classi devono avere un costruttore che crea quell'oggeto.
    // this lo usi quando hai una variabile che è uguale al nome della proprietà della classe
    public Animale(String nome, int numeroDiZampe, boolean terra, String verso) {
        this.nome = nome;
        this.numeroDiZampe = numeroDiZampe;
        this.terra = terra;
        this.verso = verso;
    }

    public void stampaDettagli() {
        System.out.println("Nome: " + nome);
        System.out.println("Numero di zampe: " + numeroDiZampe);
        System.out.println("Terra: " + (terra ? "Sì" : "No"));
        stampaVerso();
    }
    
    public void stampaVerso() {
        System.out.println("Verso: " + verso);
    }
}
