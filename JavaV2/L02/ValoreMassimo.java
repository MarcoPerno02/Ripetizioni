package L02;

public class ValoreMassimo {
    public static void main(String[] args) {
        // Creazione del vettore con i valori traccia
        int[] punteggi = {14, 42, 8, 23, 99, 15};

        // Assumiamo inizialmente che il primo elemento sia il massimo
        int massimo = punteggi[0];

        // Scorriamo il vettore partendo dal secondo elemento (indice 1)
        for (int i = 1; i < punteggi.length; i++) {
            // Se troviamo un numero più grande del "massimo attuale", aggiorniamo la variabile
            if (punteggi[i] > massimo) {
                massimo = punteggi[i];
            }
        }

        // Stampa del risultato finale fuori dal ciclo
        System.out.println("Il punteggio massimo trovato è: " + massimo);
    }
}