package L03;

public class TesterNegozio {
    public static void main(String[] args) {
        // Creiamo il prodotto "Cuffie Bluetooth" a 50.0€
        Prodotto cuffie = new Prodotto("Cuffie Bluetooth", 50.0);

        // Calcoliamo lo sconto del 20% e salviamo il risultato in una variabile
        double prezzoFinale = cuffie.calcolaPrezzoScontato(20.0);

        // Stampiamo a video i dettagli
        System.out.println("Prodotto: " + cuffie.nome);
        System.out.println("Prezzo Originale: " + cuffie.prezzoOriginale + "€");
        System.out.println("Prezzo Scontato (20%): " + prezzoFinale + "€");
    }
}
