public class CalcolatoreRettangolo {

    public static void main(String[] args) {
        
        // Dichiarazione variabili
        int base = 15;
        int altezza = 8;
        
        // Calcolo area standard
        int area = base * altezza;
        
        // Uso dei numeri decimali
        double coefficiente = 1.5;
        double areaModificata = area * coefficiente;
        
        // Output dei dati
        System.out.println("La base del rettangolo e': " + base);
        System.out.println("L'altezza del rettangolo e': " + altezza);
        System.out.println("L'area calcolata e': " + area);
        System.out.println("L'area maggiorata e': " + areaModificata);
    }
}