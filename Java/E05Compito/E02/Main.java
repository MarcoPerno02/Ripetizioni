package E05Compito.E02;

public class Main {
    public static void main(String[] args) {
        String[] parole = {"cane", "gatto", "elefante", "lupo", "tigre"};

        // Versione for
        for (int i = 0; i < parole.length; i++) {
            if(parole[i].length() >= 5) {
                System.out.println("La parola '" + parole[i] + "' ha almeno 5 caratteri.");
            }
        }

        System.out.println("---------------------------------");
        
        // Version foreach
        for (String parola : parole) {
            if(parola.length() >= 5) {
                System.out.println("La parola '" + parola + "' ha almeno 5 caratteri.");
            }
        }
        
    }
}
