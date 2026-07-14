package L03;

public class Personaggio {
    // Attributi
    String nome;
    int puntiVita;

    // Costruttore
    public Personaggio(String nome, int puntiVitaIniziali) {
        this.nome = nome;
        this.puntiVita = puntiVitaIniziali;
    }

    // Metodo per ricevere danno
    public void riceviDanno(int danno) {
        this.puntiVita -= danno;
        System.out.println(this.nome + " subisce " + danno + " punti di danno!");
    }

    // Metodo per curarsi
    public void beviPozione(int cura) {
        this.puntiVita += cura;
        System.out.println(this.nome + " beve una pozione e recupera " + cura + " HP!");
    }

    // Metodo per stampare lo stato attuale
    public void stampaStato() {
        System.out.println("--- STATO PERSONAGGIO ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Punti Vita (HP): " + this.puntiVita);
        System.out.println("-------------------------");
    }
}