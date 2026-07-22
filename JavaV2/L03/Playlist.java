package L03;

public class Playlist {
    // Attributo: un vettore di oggetti Brano
    Brano[] canzoni;

    // Costruttore: riceve l'array già creato e lo salva nell'attributo
    public Playlist(Brano[] canzoni) {
        this.canzoni = canzoni;
    }

    // Metodo che somma le durate
    public int calcolaDurataTotale() {
        int totale = 0; // Variabile accumulatore
        
        // Scorro tutto l'array
        for (int i = 0; i < this.canzoni.length; i++) {
            // Aggiungo al totale la durata del brano nella posizione i
            totale += this.canzoni[i].durataSecondi;
        }
        
        return totale; 
    }

    // Metodo che filtra in base a una stringa
    public void stampaBraniDi(String artistaCercato) {
        System.out.println("Ricerca brani di: " + artistaCercato);
        
        // Scorro tutto l'array
        for (int i = 0; i < this.canzoni.length; i++) {
            // ATTENZIONE: per confrontare due String si usa .equals(), NON l'operatore ==
            if (this.canzoni[i].artista.equals(artistaCercato)) {
                // Se l'artista corrisponde, faccio stampare i dettagli al brano stesso
                this.canzoni[i].stampaDettagli();
            }
        }
    }
}