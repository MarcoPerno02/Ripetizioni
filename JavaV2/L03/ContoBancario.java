package L03;

public class ContoBancario {
    // Attributi
    String titolare;
    double saldo;

    // Costruttore
    public ContoBancario(String titolare, double saldoIniziale) {
        this.titolare = titolare;
        this.saldo = saldoIniziale;
    }

    // Metodo per versare soldi
    public void versa(double importo) {
        this.saldo += importo;
    }

    // Metodo per prelevare soldi (restituisce true se ci riesce, false se fallisce)
    public boolean preleva(double importo) {
        if (this.saldo >= importo) {
            this.saldo -= importo;
            return true; // Prelievo andato a buon fine
        }
        return false; // Saldo insufficiente
    }

    // Metodo per inviare soldi a un altro conto
    public boolean bonifico(ContoBancario destinatario, double importo) {
        // "this" è il conto da cui partono i soldi. 
        // Proviamo a prelevare: se this.preleva(importo) restituisce true, entriamo nell'if.
        if (this.preleva(importo)) {
            // I soldi sono stati scalati, ora li aggiungiamo al destinatario
            destinatario.versa(importo);
            return true; // Bonifico completato
        }
        
        // Se il prelievo ha restituito false, arriviamo qui
        return false; // Bonifico fallito
    }

    // Metodo di supporto per stampare comodamente il saldo
    public void stampaSaldo() {
        System.out.println("Conto di " + this.titolare + " | Saldo: " + this.saldo + "€");
    }
}
