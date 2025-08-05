package E13;

public class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, String modello, int anno, int numeroPorte) {
        super(marca, modello, anno);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public String descrizione() {
        return "Auto: " + marca + " " + modello + " (" + anno + "), " + numeroPorte + " porte";
    }

    @Override
    public String tipo() {
        return "Auto";
    }
}
