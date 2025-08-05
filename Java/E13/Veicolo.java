package E13;

public abstract class Veicolo {
    protected String marca;
    protected String modello;
    protected int anno;

    public Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public abstract String descrizione();
    public abstract String tipo();
}
