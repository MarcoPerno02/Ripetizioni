package L03;

public class TesterDistributore {
    public static void main(String[] args) {
        // Inizializziamo il distributore con 2 lattine e 0.0€ in cassa
        Distributore distributore = new Distributore(2, 0.0);

        // Stampiamo lo stato iniziale
        distributore.stampaResoconto();

        // Proviamo a fare 3 acquisti (inserendo 1.50€ ogni volta)
        System.out.println("Tentativo acquisto 1:");
        distributore.inserisciMonetaECompra(1.50);

        System.out.println("\nTentativo acquisto 2:");
        distributore.inserisciMonetaECompra(1.50);

        // Questo terzo tentativo dovrebbe fallire perché le lattine sono finite
        System.out.println("\nTentativo acquisto 3:");
        distributore.inserisciMonetaECompra(1.50);

        // Verifichiamo con il resoconto finale
        System.out.println();
        distributore.stampaResoconto();
    }
}
