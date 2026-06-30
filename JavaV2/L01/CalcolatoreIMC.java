public class CalcolatoreIMC {

    public static void main(String[] args) {
        
        // Dati della persona
        double peso = 75.5;     // in kg
        double altezza = 1.80;  // in metri
        
        // Calcolo dell'IMC
        double altezzaAlQuadrato = altezza * altezza;
        double imc = peso / altezzaAlQuadrato;
        
        // Output del risultato
        System.out.println("Il peso della persona e': " + peso + " kg");
        System.out.println("L'altezza della persona e': " + altezza + " m");
        System.out.println("L'Indice di Massa Corporea (IMC) e': " + imc);
    }
}