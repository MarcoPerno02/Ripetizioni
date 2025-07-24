package E05Compito.E04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] parole = {"rosso", "verde", "blu", "giallo", "blu"};
        
        Scanner scanner = new Scanner(System.in);

        // Il do while cicla fino a quando la parola da cercare è uguale a stringa vuota ("")
        // e con .trim() java ci toglie in automatica gli spazi superflui
        String parolaDaCercare = "";
        do {
            System.out.print("Inserisci una parola da cercare: ");
            parolaDaCercare = scanner.nextLine().trim();
        } while (parolaDaCercare.equals(""));

        // Questo foreach itera su ogni parola e attraverso il metod equals a cui passiamo la 
        // parola da cercare controlla se la parola è quella cercata.
        // Errore comune è fare parola == parolaDaCerca, ricoda che parole e parolaDaCercare sono String e
        // sono oggetti, quindi con == non faccio il confronto del contenuto, ma della loro posizione in memoria.
        // Due variabili possono avere stesso contentuo, ma saranna memorizzate in posti diversi
        int contatoreParolaDaCercare = 0;
        for (String parola : parole) {
            if(parola.equals(parolaDaCercare)) {
                contatoreParolaDaCercare++;
            }
        }

        // Se il contatore è diventato maggiore di 0 stampiamo un risultato positivo
        if(contatoreParolaDaCercare > 0) {
            System.out.println("La parola " + parolaDaCercare + " è stata trovata " + contatoreParolaDaCercare + " volte.");
        }
        else {
            System.out.println("La parola " + parolaDaCercare + " non è stata trovata.");
        }

        scanner.close();
    }
}
