package E12Compito;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clienti = Cliente.leggiClientiDaFile("Java/E12Compito/clienti.txt");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserisci un nuovo cliente");
            System.out.println("2. Stampa tutti i clienti");
            System.out.println("3. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            if (scelta == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Cognome: ");
                String cognome = scanner.nextLine();
                System.out.print("Email: ");
                String codiceFiscale = scanner.nextLine();
                Cliente nuovoCliente = new Cliente(nome, cognome, codiceFiscale);

                if(Cliente.codiceFiscaleGiaPresente(clienti, nuovoCliente.getCodiceFiscale())) {
                    System.out.println("Codice fiscale già presente. Cliente non aggiunto.");
                    // Continue ti rimanda all'inzio del while
                    // ed inzia una nuova iterazione del ciclo
                    continue;
                }

                clienti.add(nuovoCliente);
                // Scrittura su file
                Cliente.salvaClienteSuFile("Java/E12Compito/clienti.txt", nuovoCliente);
                System.out.println("Cliente aggiunto.");
            } else if (scelta == 2) {
                for (Cliente cliente : clienti) {
                    System.out.println(cliente);
                }
            } else if (scelta == 3) {
                System.out.println("Uscita dal programma.");
                break;
            } else {
                System.out.println("Opzione non valida.");
            }
        }
        scanner.close();
    }
}