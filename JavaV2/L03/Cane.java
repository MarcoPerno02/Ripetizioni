package L03;

public class Cane {
    // Attributi della classe
    String nome;
    String razza;
    int eta;

    // Costruttore per inizializzare l'oggetto più facilmente
    public Cane(String nome, String razza, int eta) {
        this.nome = nome;
        this.razza = razza;
        this.eta = eta;
    }

    // Metodo richiesto dall'esercizio
    public void abbaia() {
        System.out.println("Woof! Mi chiamo " + this.nome);
    }
}