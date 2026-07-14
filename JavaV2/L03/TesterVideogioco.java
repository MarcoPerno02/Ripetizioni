package L03;

public class TesterVideogioco {
    public static void main(String[] args) {
        // Creiamo il nostro eroe con 100 HP
        Personaggio eroe = new Personaggio("Guerriero", 100);

        // Mostriamo lo stato iniziale
        eroe.stampaStato();

        // Subisce 30 danni
        eroe.riceviDanno(30);

        // Beve una pozione da 15 HP
        eroe.beviPozione(15);

        // Stampiamo lo stato finale per verificare i calcoli (100 - 30 + 15 = 85)
        eroe.stampaStato();
    }
}