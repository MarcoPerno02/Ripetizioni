package E14;

public class Voto {
    private String materia;
    private int voto;

    public Voto(String materia, int voto) {
        this.materia = materia;
        this.voto = voto;
    }

    public String getMateria() {
        return materia;
    }

    public int getVoto() {
        return voto;
    }

    @Override
    public String toString() {
        return materia + ": " + voto;
    }
}
