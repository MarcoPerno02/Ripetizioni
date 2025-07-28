package E09;

public class Main {
    public static void main(String[] args) {
        Animale animale = new Animale(0); // Creazione di un oggetto Animale
        animale.stampaVerso();

        Cane cane = new Cane(4);
        cane.stampaVerso();

        Gatto gatto = new Gatto(4);
        gatto.stampaVerso();

        PesceSenzaVersionePropriaDiStampaVerso pesce = new PesceSenzaVersionePropriaDiStampaVerso();
        pesce.stampaVerso();
    }
}

// Classe padre che contiene il metodo stampaVerso comune a tutti gli animali
class Animale {
    protected int numeroZampe = 0;  // permette l'accesso alle classi figlie
    public void stampaVerso() {
        System.out.println("Verso animale, questa è la versione di default");
    }

    // Costuttore di animale
    public Animale(int numeroZampe) {
        this.numeroZampe = numeroZampe;
    }
}

// Classi figlie che ereditano Animale perchè hanno il verso
class Cane extends Animale {
    // Potremmo non definire di nuovo stampVerso perchè ereditando Animale esiste già per Cane essende sup figlio,
    // ma possiamo definire meglio cosa stampa
    @Override
    public void stampaVerso() {
        System.out.println("Bau!");
    }

    public Cane(int numeroZampe) {
        // Ma alla fine noi faremmo una copia del costruttore del padre...
        // quindi che senso ha che scriviamo del codice che esiste già?
        // Non sarebbe meglio richiamare il costruttore del padre che ha lo stesso
        // codice che vogliamo?
        // Con super accedo al costruttore del padre
        super(numeroZampe);
    }

    public void stampaZampe() {
        System.out.println("Numero zampe: " + numeroZampe);
    }
}

class Gatto extends Animale {
    @Override
    public void stampaVerso() {
        System.out.println("Miao!");
    }

    public Gatto(int numeroZampe) {
        super(numeroZampe);
    }
}

class PesceSenzaVersionePropriaDiStampaVerso extends Animale {
    public PesceSenzaVersionePropriaDiStampaVerso() {
        super(0); // I pesci hanno 0 zampe perché nuotano
    }

    // Non ridefinisco stampaVerso, quindi utilizzerà quella di Animale
    // che stampa "Verso animale, questa è la versione di default"
}