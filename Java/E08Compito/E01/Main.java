package E08Compito.E01;

public class Main {
    public static void main(String[] args) {
        Utente utente = new Utente("Mario", 30);
        utente.stampaInfo();
    }
}

class Utente {
    private String nome;
    private int eta;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public Utente(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void stampaInfo() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }
}