package L03;

public class TesterContoCorrente {
    public static void main(String[] args) {
        // 1. Creo un nuovo conto corrente intestato a Mario con 1000€ di partenza
        ContoCorrente contoMario = new ContoCorrente("Mario Rossi", 1000.0);

        // Stampo il saldo iniziale
        contoMario.stampaSaldo();

        // 2. Mario versa 500€
        contoMario.versa(500.0);
        
        // Controllo il saldo
        contoMario.stampaSaldo();

        // 3. Mario preleva 200€
        contoMario.preleva(200.0);

        // Controllo il saldo finale
        contoMario.stampaSaldo();
    }
}