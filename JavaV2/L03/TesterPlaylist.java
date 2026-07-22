package L03;

public class TesterPlaylist {
    public static void main(String[] args) {
        // 1. Dichiaro e creo l'array di 4 brani
        Brano[] mieiBrani = new Brano[4];
        
        // 2. Istanzio i singoli brani dentro le posizioni dell'array
        mieiBrani[0] = new Brano("Shape of You", "Ed Sheeran", 233);
        mieiBrani[1] = new Brano("Perfect", "Ed Sheeran", 263);
        mieiBrani[2] = new Brano("Blinding Lights", "The Weeknd", 200);
        mieiBrani[3] = new Brano("Rolling in the Deep", "Adele", 228);

        // 3. Creo la Playlist passandole l'array appena riempito
        Playlist miaPlaylist = new Playlist(mieiBrani);

        // 4. Testo il calcolo della durata totale
        System.out.println("=== INFO PLAYLIST ===");
        int durata = miaPlaylist.calcolaDurataTotale();
        System.out.println("Durata totale: " + durata + " secondi.");
        System.out.println("=====================\n");

        // 5. Testo il filtro passando l'artista che ha due canzoni
        miaPlaylist.stampaBraniDi("Ed Sheeran");
        
        // Esempio extra: cerco un artista che ha una sola canzone
        System.out.println();
        miaPlaylist.stampaBraniDi("Adele");
    }
}