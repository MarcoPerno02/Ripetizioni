public class ConvertitoreTemperatura {

    public static void main(String[] args) {
        
        // Temperatura in gradi Celsius
        double celsius = 25.0;
        
        // Formula di conversione
        double fahrenheit = celsius * 1.8 + 32;
        
        // Stampa del risultato
        System.out.println("La temperatura in gradi Celsius e': " + celsius);
        System.out.println("La temperatura convertita in Fahrenheit e': " + fahrenheit);
    }
}