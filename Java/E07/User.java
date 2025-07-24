package E07;

// Per la classi abbiamo in java diverse keyword quali:
//      - public -> Rende un metodo o una prorietà pubblica e visibile esternamente dalla classe
//      - private -> Rende un metodo o una proprietà privata e non visibile esternamente dalla classe
// Oltra questi citiamo anche static.
// Static può essere usando in combinazione con public e private.
// Static permmette di usare una proprietà o un metodo senza dover per forza istanziare la classe
// ed inoltre permette di condivdere quella proprietà o quel metodo tra più classi
// (è come se fosse definito una sola volta per tutti).
// Se una classe aggiorna una proprietà static tutte le altri classi e anche quelle nuove vedrano
// il valore nuovo

public class User {
    static int idGeneratore = 0;  // Vedere in 'prossimoIdGeneratore()' il motivo di static
    public int id;
    public String nome;
    public String cognome;
    public String dataDiNascita;
    private int ISEE;
    private String IBAN;

    public static void dimmiChiSono() {
        System.out.println("Sono la classe User. Posso contenere informazioni di un utente");
    }

    public static int prossimoIdGeneratore() {
        // Questa fuzione permette di sapere quale sarà il prossimo id.
        // id deve essere static perchè se la classe non è istanziata id non esiste,
        // ed essendo qeusto metodo static e quindi richiamabile prima dell'istanziano della
        // classe ciò risulterebbe in un errore
        return idGeneratore;
    }

    public int restuisciProssimoIdGeneratoreEIncremenatalo() {
        // Leggiamo il valore id da restiuire e poi incrementiamo id.
        // Un metodo non-static può usare qualcosa di static, ma non il viceversa
        int precedenteId = idGeneratore;
        idGeneratore++;
        return precedenteId;
    }

    public User(String nome, String cognome, String dataDiNascita, int ISEE, String IBAN) {
        this.id = restuisciProssimoIdGeneratoreEIncremenatalo();
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.ISEE = ISEE;
        this.IBAN = IBAN;
    }

    public void stampaUser() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Data di nascita: " + dataDiNascita);
        System.out.println("ISEE: " + ISEE);
        System.out.println("IBAN: " + IBAN);
    }

    public void stampaIdoneitaUser() {
        stampaUser();
        if (ISEE < 250) {
            System.out.println("L'utente è idoneo.");
        } else {
            System.out.println("L'utente non è idoneo.");
        }
        System.out.println("----------------------");
    }
}
