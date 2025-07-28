package E08Compito.E03;

public class Main {
    public static void main(String[] args) {
        Rettangolo.descrizione();
        Rettangolo rettangolo = new Rettangolo(40, 2.5);
        double area = rettangolo.calcolaAreaRettangolo();
        System.out.println("L'area del rettangolo è: " + area);
    }
}

class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double calcolaAreaRettangolo() {
        return base * altezza;
    }

    public static void descrizione() {
        System.out.println("Questa classe rappresenta un rettangolo");
    }
}