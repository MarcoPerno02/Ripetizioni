package L02;

public class OperazioniStringhe {
    public static void main(String[] args) {
        // 1. Salva nome e cognome in due variabili separate
        String nome = "Mario";
        String cognome = "Rossi";

        // 2. Unione delle stringhe in una terza variabile (con uno spazio in mezzo)
        String nomeCompleto = nome + " " + cognome;

        // 3. Stampa del nome completo
        System.out.println("Nome Completo: " + nomeCompleto);

        // 4. Stampa del numero totale di caratteri (compreso lo spazio!)
        int lunghezza = nomeCompleto.length();
        System.out.println("Il nome completo è composto da " + lunghezza + " caratteri.");
    }
}