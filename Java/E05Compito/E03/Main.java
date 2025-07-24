package E05Compito.E03;

public class Main {
    public static void main(String[] args) {
        String[] nomi = {"Anna", "Alessio", "Marco", "Andrea", "Giorgia"};

        // Versione senza startsWith
        for (String nome : nomi) {
            if(nome.charAt(0) == 'A') {
                System.out.println("Il nome '" + nome + "' inizia con la lettera A.");
            }
        }

        System.out.println("----------------------------------------------");

        // Versione con startsWith
        for (String nome : nomi) {
            if(nome.startsWith("A")) {
                System.out.println("Il nome '" + nome + "' inizia con la lettera A.");
            }
        }
    }
}
