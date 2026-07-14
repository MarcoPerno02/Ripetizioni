package L03;

public class Prodotto {
    // Attributi
    String nome;
    double prezzoOriginale;

    // Costruttore
    public Prodotto(String nome, double prezzoOriginale) {
        this.nome = nome;
        this.prezzoOriginale = prezzoOriginale;
    }

    // Metodo che calcola lo sconto e lo restituisce (senza modificare l'attributo prezzoOriginale)
    public double calcolaPrezzoScontato(double percentualeSconto) {
        double sconto = (this.prezzoOriginale * percentualeSconto) / 100;
        double prezzoScontato = this.prezzoOriginale - sconto;
        return prezzoScontato; 
    }
}
