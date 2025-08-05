package E13;

public class Moto extends Veicolo {
    private int cilindrata;

    public Moto(String marca, String modello, int anno, int cilindrata) {
        super(marca, modello, anno);
        this.cilindrata = cilindrata;
    }

    @Override
    public String descrizione() {
        return "Moto: " + marca + " " + modello + " (" + anno + "), " + cilindrata + "cc";
    }

    @Override
    public String tipo() {
        return "Moto";
    }
}

