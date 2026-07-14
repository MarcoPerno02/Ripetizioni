package L03;

public class Rettangolo {
    // Attributi
    double base;
    double altezza;

    // Costruttore per impostare le dimensioni alla creazione
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Metodo che calcola e restituisce l'area
    public double calcolaArea() {
        double area = this.base * this.altezza;
        return area; // Restituisce il valore calcolato
    }

    // Metodo che calcola e restituisce il perimetro
    public double calcolaPerimetro() {
        double perimetro = (this.base + this.altezza) * 2;
        return perimetro; // Restituisce il valore calcolato
    }
}
