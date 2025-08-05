package E13;

public class Camion extends Veicolo {
    private int capacitaCarico;

    public Camion(String marca, String modello, int anno, int capacitaCarico) {
        super(marca, modello, anno);
        this.capacitaCarico = capacitaCarico;
    }

    @Override
    public String descrizione() {
        return "Camion: " + marca + " " + modello + " (" + anno + "), " + capacitaCarico + " kg";
    }

    @Override
    public String tipo() {
        return "Camion";
    }
}
