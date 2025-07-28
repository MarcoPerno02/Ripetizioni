package E08Compito.E02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inizialmente cont vale: " + Contatore.getTotale());

        // Creiamo un'istanzia di Contatore
        Contatore c1 = new Contatore();
        System.out.println("Ora cont vale: " + Contatore.getTotale());
        // Proviamo anche il getter per vedere che sia 1
        System.out.println("Contatore c1: " + c1.getCont());

        // Creiamo un'altra istanza di Contatore
        new Contatore();

        // Proviamo a vedere se c1 vede la modifica di cont a causa della nuova istanzia
        System.out.println("Ora cont dopo la nuova istanzia vede: " + Contatore.getTotale());
        System.out.println("Contatore c1 dopo nuova istanzia: " + c1.getCont());
    }
}

class Contatore {
    private static int cont = 0;

    public int getCont() {
        return cont;
    }

    public Contatore() {
        cont++;
    }

    public static int getTotale() {
        return cont;
    }
}
