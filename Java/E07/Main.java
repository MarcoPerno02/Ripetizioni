/* 
 * Crera un sistema che tenga traccia di informazioni sensibili di un utente.
 * Il sistema dovrà essere usato per l'assegnazione di bnous statali.
 * Il sistema memorizza per ogni persona che fa domanda alcune informazioni quali:
 *      - id: int
 *      - nome String
 *      - cognome String
 *      - dataDiNascita (sotto forma di stringa)
 *      - ISEE int
 *      - IBAN String
 * ISEE e IBAN sono due dati molto sensibili e non deve esserci modo che dal main vi si possa accedere.
 * id è un indice numerio incrementale che parte da 0 e identifica univocamente ogni persona.
 * id viene assegnato dal sistema in automatico e bisogna suppore che più istanzie del Main
 * siano aperte, ma gli id generati deveno essere univoci anche tra più istanzie del Main.
 * L'utente è idoeneo solo se ISEE < 250
*/
package E07;

public class Main {
    public static void main(String[] args) {
        User.dimmiChiSono();
        System.out.println("All'avvio del programma, e senza classi User instaziate, id generatore vale: " + User.prossimoIdGeneratore());

        // Creiamo un vettore di User
        User utenti [] = new User[100];
        int NUtenti = 0;

        utenti[0] = new User("Marco", "Perno", "01/01/2000", 100, "AA00BB");
        NUtenti++;
        utenti[0].stampaIdoneitaUser();

        System.out.println("Ora se richiamo prossimo id genaratore dovrò vedere 1 e vedo " + User.prossimoIdGeneratore());

        // Ora se creo un altro utente avrà id 1, senza static non avrebbe potuto sapere
        // che era già stato creato un id e avrebbe creato il nuovo user con id 0
        utenti[1] = new User("Luca", "Rossi", "01/02/2000", 1000, "AA00CC");
        NUtenti++;
        utenti[1].stampaIdoneitaUser();

    }
}
