package E14;

import java.util.ArrayList;
import java.util.List;

public abstract class Studente {
    protected String nome;
    protected String cognome;
    protected int annoNascita;
    protected List<Voto> voti;

    public Studente(String nome, String cognome, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
        this.voti = new ArrayList<>();
    }

    public void aggiungiVoto(Voto v) {
        voti.add(v);
    }

    public double mediaVoti() {
        if (voti.isEmpty()) return 0;
        double somma = 0;
        for (Voto v : voti) {
            somma += v.getVoto();
        }
        return somma / voti.size();
    }

    public abstract String tipo();
    public abstract String scheda();

    @Override
    public String toString() {
        return scheda();
    }
}
