package L03;

public class TesterRettangolo {
    public static void main(String[] args) {
        // Istanzio un rettangolo con base 5.0 e altezza 10.0
        Rettangolo mioRettangolo = new Rettangolo(5.0, 10.0);

        // Chiamo i metodi e salvo i risultati in due variabili
        double risultatoArea = mioRettangolo.calcolaArea();
        double risultatoPerimetro = mioRettangolo.calcolaPerimetro();

        // Stampo a video i risultati salvati nelle variabili
        System.out.println("L'area del rettangolo è: " + risultatoArea);
        System.out.println("Il perimetro del rettangolo è: " + risultatoPerimetro);
    }
}