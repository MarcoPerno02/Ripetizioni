package L02;

public class ValidazionePassword {
    public static void main(String[] args) {
        // Definiamo la password da testare (fai dei test cambiandola!)
        String passwordInserita = "Java2026";
        String passwordSistema = "Java2026";

        // 1. Controllo sulla lunghezza della stringa
        if (passwordInserita.length() < 8) {
            System.out.println("Errore: Password troppo corta");
        } 
        // 2. Controllo sul contenuto (Usa sempre .equals() per le stringhe!)
        else if (passwordInserita.equals(passwordSistema)) {
            System.out.println("Accesso consentito");
        } 
        // 3. Se è lunga abbastanza ma il testo non coincide
        else {
            System.out.println("Accesso negato");
        }
    }
}