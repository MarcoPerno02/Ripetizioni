# Lezione 3: Il Paradigma a Oggetti (Classi e Istanze)

## 1. La Grande Rivoluzione: Cos'è un Oggetto?
Fino ad ora abbiamo scritto tutto dentro il metodo `main`. Ma nel mondo reale, i programmi complessi (come i videogiochi o i software bancari) non sono fatti da una sola lunga lista di istruzioni. Sono composti da **Oggetti** che interagiscono tra loro.

Per capire l'OOP (Object-Oriented Programming), usa questa regola d'oro:
* **La Classe** è lo stampino per i biscotti (o il progetto architettonico di una casa). È un concetto astratto, non esiste fisicamente nel programma, ma definisce come saranno fatti i biscotti.
* **L'Oggetto (o Istanza)** è il singolo biscotto creato con quello stampino (o la casa vera e propria costruita con quei mattoni). È fisico, esiste nella memoria del computer e ce ne possono essere infiniti, tutti simili ma indipendenti.

*Termine da esame:* Quando creiamo un oggetto a partire da una classe, diciamo che abbiamo **"istanziato"** la classe. L'oggetto è una sua **istanza**.

## 2. Attributi e Metodi: L'Anatomia di una Classe
Una Classe è composta da due elementi fondamentali:
1. **Gli Attributi (Variabili di istanza):** Sono le *caratteristiche* o gli *aggettivi*. (Es. In un'auto sono il colore, la marca, la targa).
2. **I Metodi:** Sono le *azioni* o i *verbi*. (Es. In un'auto sono accelera, frena, accendi il motore).

### Esempio visivo:
```java
// Il file si chiama Auto.java (NON ha il metodo main qui dentro!)
public class Auto {
    // 1. Attributi
    String marca;
    String colore;
    int velocita;

    // 2. Metodi
    void accelera() {
        velocita = velocita + 10;
    }
}
```

## 3. Metodi void e Metodi con ritorno
I metodi sono come delle piccole fabbriche: prendono ordini ed eseguono azioni.
* **Metodi void (vuoti):** Fanno qualcosa, ma non restituiscono nessuna risposta a chi li ha chiamati. Esempio: `System.out.println` o il metodo `accelera()` qui sopra. Si accontentano di modificare lo stato o stampare a video.
* **Metodi con tipo di ritorno:** Usano la parola chiave `return` per restituire un risultato. Se chiedo all'auto di calcolare quanto carburante le serve per 100 km, mi aspetto un numero (un `double`) in risposta, non il vuoto (`void`).

## 4. Dare vita agli oggetti: La parola chiave new
Per usare la nostra classe `Auto`, abbiamo di nuovo bisogno di un "Tester", ovvero un'altra classe che contenga il famoso `main`.
Per creare un oggetto si usa **sempre** la parola chiave `new`. Per accedere ai suoi attributi e metodi, si usa il **punto (`.`)**.

```java
public class MainTester {
    public static void main(String[] args) {
        // Creo l'istanza usando "new"
        Auto laMiaPanda = new Auto();
        
        // Uso il punto per assegnare i valori agli attributi
        laMiaPanda.marca = "Fiat";
        laMiaPanda.colore = "Rossa";
        laMiaPanda.velocita = 0;
        
        // Uso il punto per chiamare un metodo
        laMiaPanda.accelera();
    }
}
```

---

## Tracce degli Esercizi

*Nota per lo studente: Per ogni esercizio dovrai creare DUE file. Uno per la Classe dell'oggetto, e uno per il Main (il tester).*

### Esercizio 1: Il Migliore Amico dell'Uomo
Crea una classe `Cane`.
* **Attributi:** `nome` (String), `razza` (String), `eta` (int).
* **Metodi:** Crea un metodo `void abbaia()` che stampa a video "Woof! Mi chiamo [nome del cane]".

Crea una classe `TesterCane` con il `main`. Istanzia due cani diversi, dai loro dei nomi e falli abbaiare entrambi.

### Esercizio 2: Il Conto Corrente (Metodi Void)
Crea una classe `ContoCorrente`.
* **Attributi:** `titolare` (String), `saldo` (double).
* **Metodi:** * Un metodo `void versa(double importo)` che aggiunge soldi al saldo.
  * Un metodo `void preleva(double importo)` che toglie soldi dal saldo.
  * Un metodo `void stampaSaldo()` che stampa la situazione attuale.

Crea il tester, istanzia il tuo conto, versa 100 euro, prelevane 30 e stampa il saldo.

### Esercizio 3: Il Rettangolo (Metodi con Ritorno)
Crea una classe `Rettangolo`.
* **Attributi:** `base` (double), `altezza` (double).
* **Metodi:**
  * Un metodo `double calcolaArea()` che non è `void`, ma calcola l'area e la restituisce tramite `return`.
  * Un metodo `double calcolaPerimetro()` che restituisce il perimetro.

Crea il tester, istanzia un rettangolo di dimensioni 5x10. Salva i risultati dei metodi in due variabili dentro il `main` e stampale a video.

### Esercizio 4: Il Personaggio del Videogioco (Gestione dello Stato)
Crea una classe `Personaggio` per simulare l'eroe di un videogioco.
* **Attributi:** `nome` (String), `puntiVita` (int).
* **Metodi:**
  * Un metodo `void riceviDanno(int danno)` che sottrae il danno ricevuto ai punti vita attuali.
  * Un metodo `void beviPozione(int cura)` che aggiunge punti vita.
  * Un metodo `void stampaStato()` che stampa il nome del personaggio e i suoi punti vita rimanenti.

Crea la classe `TesterVideogioco` con il `main`. Istanzia un personaggio (es. "Guerriero" con 100 punti vita). Fagli ricevere 30 danni, poi fagli bere una pozione da 15, e infine stampa il suo stato.

### Esercizio 5: Il Prodotto in Negozio (Parametri e Return)
Crea una classe `Prodotto` per simulare un e-commerce.
* **Attributi:** `nome` (String), `prezzoOriginale` (double).
* **Metodi:**
  * Un metodo `double calcolaPrezzoScontato(double percentualeSconto)`. Questo metodo non deve modificare il prezzo originale, ma calcolare il prezzo scontato e restituirlo usando `return`.

Crea la classe `TesterNegozio`. Istanzia un prodotto (es. "Cuffie Bluetooth" a 50.0 euro). Usa il metodo per calcolare il prezzo con il 20% di sconto, salva il risultato in una variabile nel `main` e stampa sia il prezzo originale che quello scontato.

### Esercizio 6: Il Distributore di Bibite (Logica e Metodi)
Crea una classe `Distributore`.
* **Attributi:** `lattineDisponibili` (int), `cassa` (double - i soldi incassati).
* **Metodi:**
  * Un metodo `void inserisciMonetaECompra(double moneta)`. Al suo interno usa un `if`: se ci sono lattine disponibili (maggiore di 0), diminuisci le lattine di 1, aggiungi la moneta alla cassa e stampa "Lattina erogata". Altrimenti, stampa "Lattine esaurite, moneta restituita".
  * Un metodo `void stampaResoconto()` che mostra quante lattine restano e quanti soldi ci sono in cassa.

Crea un `TesterDistributore`. Inizializza un distributore con 2 lattine e 0.0 in cassa. Prova a comprare 3 lattine e stampa il resoconto finale per verificare che l'`if` abbia funzionato.

### Esercizio 7: Il Registro degli Studenti (Creazione e Scansione)
Crea una classe `Studente`.
* **Attributi:** `nome` (String), `cognome` (String), `mediaVoti` (double).
* **Metodi:**
  * Un metodo `void presentati()` che stampa a video: "Ciao, sono [nome] [cognome] e ho una media del [mediaVoti]".
  * Un metodo `boolean ePromosso()` che restituisce `true` se la media è maggiore o uguale a 6.0, altrimenti `false`.

Crea una classe `TesterScuola` con il `main`. Dichiara un vettore di tipo `Studente` di 4 elementi. Istanzia 4 studenti diversi (alcuni con media sufficiente e altri no) e inseriscili nel vettore. Usa un ciclo `for` per scorrere l'array: fai presentare ogni studente e, usando il metodo `ePromosso()`, stampa a video se è stato promosso o bocciato.

---

### Esercizio 8: Il Carrello dell'E-Commerce (Calcoli su un Vettore)
Crea una classe `Articolo`.
* **Attributi:** `descrizione` (String), `prezzo` (double).
* **Metodi:**
  * Un metodo `double getPrezzo()` che restituisce il prezzo dell'articolo.
  * Un metodo `void stampaDettagli()` che stampa descrizione e prezzo.

Crea una classe `TesterCarrello` con il `main`. Istanzia un array di 4 articoli con prezzi a tua scelta. Usa un ciclo per scorrere l'array, calcolare la somma totale dei prezzi e stamparla. Trova inoltre l'articolo con il prezzo più alto e stampa a video la sua descrizione e il suo prezzo.

---

### Esercizio 9: Il Garage (Una Classe che contiene un Vettore)
*Nota per lo studente: Per questo esercizio dovrai creare TRE file distinti: `Auto.java`, `Garage.java` e `TesterGarage.java`.*

Crea una classe `Auto`.
* **Attributi:** `targa` (String), `marca` (String), `modello` (String).
* **Metodi:** Un metodo `void stampaInfo()` che mostra targa, marca e modello dell'auto.

Crea una classe `Garage`.
* **Attributi:** `posti` (un array di oggetti `Auto`), `autoPresenti` (int - un contatore per le auto effettivamente caricate).
* **Costruttore:** Un costruttore `Garage(int capienzaMax)` che inizializza l'array `posti` con la dimensione massima passata come parametro e imposta `autoPresenti` a 0.
* **Metodi:**
  * Un metodo `void parcheggia(Auto nuovaAuto)`: se c'è ancora spazio disponibile nel garage, inserisce l'auto nell'array alla posizione `autoPresenti`, incrementa il contatore e stampa un messaggio di successo. Altrimenti, stampa "Garage pieno!".
  * Un metodo `void stampaParcoAuto()`: usa un ciclo `for` per scorrere solo le auto effettivamente presenti nel garage e richiama il loro metodo `stampaInfo()`.

Crea la classe `TesterGarage`. Inizializza un garage con una capienza di 2 posti. Crea 3 auto differenti. Prova a parcheggiare tutte e tre le auto per verificare che il limite di capienza funzioni e, infine, stampa a video l'elenco delle auto riuscite a entrare.

---

### Esercizio 10: La Squadra di Eroi (Ricerca e Modifica dello Stato)
*Nota per lo studente: Per questo esercizio riutilizza la classe `Personaggio` creata nell'Esercizio 4.*

Crea una classe `TesterSquadra` con il `main`.
* Dichiara un array `Personaggio[] party = new Personaggio[3];` e inserisci tre eroi: "Guerriero" (100 HP), "Mago" (60 HP) e "Arciere" (80 HP).
* Fai subire 20 punti di danno a tutti i personaggi del gruppo usando un ciclo `for`.
* Usa un secondo ciclo `for` per cercare l'eroe di nome "Mago" (utilizza il metodo `.equals()` per il confronto tra stringhe). Se lo trovi, fagli recuperare 30 HP facendogli bere una pozione.
* Stampa lo stato finale di tutti i membri della squadra per verificare l'esito della battaglia e delle cure.

---

### Esercizio 11: Il Bonifico Bancario (Interazione tra Oggetti)
*Obiettivo: Imparare a passare un oggetto come parametro a un metodo di un altro oggetto della stessa classe.*

Crea una classe `ContoBancario`.
* **Attributi:** `titolare` (String), `saldo` (double).
* **Metodi:**
  * `void versa(double importo)`
  * `boolean preleva(double importo)`: se il saldo è sufficiente (>= importo), sottrae i soldi e restituisce `true`. Altrimenti, non fa nulla e restituisce `false`.
  * `boolean bonifico(ContoBancario destinatario, double importo)`: Questo è il cuore dell'esercizio! Il metodo deve provare a prelevare l'importo dal conto attuale (`this`). Se il prelievo ha successo (restituisce `true`), deve versare i soldi sul conto `destinatario` e restituire `true`. Altrimenti restituisce `false`.

Crea una classe `TesterBonifico` con il `main`. Istanzia due conti (es. "Alice" con 500€ e "Bob" con 100€). 
Fai fare ad Alice un bonifico di 200€ a Bob. Stampa i saldi per verificare. 
Poi prova a farle fare un bonifico di 1000€ (dovrebbe fallire) e stampa nuovamente i saldi, che dovranno essere rimasti invariati.

---

### Esercizio 12: La Playlist Musicale (Filtri e Accumulatori)
*Nota per lo studente: Questo esercizio richiede 3 file (`Brano.java`, `Playlist.java`, `TesterPlaylist.java`).*
*Obiettivo: Filtrare un array di oggetti in base a una stringa e calcolare somme complesse.*

Crea una classe `Brano`.
* **Attributi:** `titolo` (String), `artista` (String), `durataSecondi` (int).
* **Metodi:** `void stampaDettagli()` che stampa ad esempio: *"Shape of You" - Ed Sheeran (233 sec)*.

Crea una classe `Playlist`.
* **Attributi:** `canzoni` (array di `Brano`).
* **Costruttore:** Inizializza l'array passando i brani direttamente (es. `public Playlist(Brano[] canzoni) { this.canzoni = canzoni; }`).
* **Metodi:**
  * `int calcolaDurataTotale()`: Scorre l'array, somma tutte le durate in secondi e restituisce il totale.
  * `void stampaBraniDi(String artistaCercato)`: Scorre l'array e stampa i dettagli **solo** dei brani in cui l'attributo `artista` è uguale ad `artistaCercato` (ricordati di usare `.equals()`).

Crea una classe `TesterPlaylist` con il `main`. Istanzia 4 o 5 brani (assicurati che almeno 2 siano dello stesso artista). Inseriscili in un array e passali al costruttore della `Playlist`. 
Stampa la durata totale di tutta la playlist. Poi testa il filtro: stampa solo le canzoni dell'artista che ne ha scritte 2.

---

### Esercizio 13: Il Cinema (Ricerca del Primo Posto Libero)
*Nota per lo studente: Questo esercizio richiede 3 file (`Posto.java`, `Sala.java`, `TesterCinema.java`).*
*Obiettivo: Interrompere la scansione di un array non appena si trova ciò che si cerca (utilizzando `return`).*

Crea una classe `Posto`.
* **Attributi:** `numero` (int), `occupato` (boolean - di default a `false`).
* **Metodi:**
  * `boolean prenota()`: Se il posto è libero (`occupato == false`), lo imposta a `true` e restituisce `true` (successo). Se era già occupato, restituisce `false`.

Crea una classe `Sala`.
* **Attributi:** `posti` (array di `Posto`).
* **Costruttore:** Prende in input la capienza (es. `int nPosti`), inizializza l'array e usa un ciclo `for` per istanziare ogni singolo `Posto` assegnandogli un numero da 1 a `nPosti`.
* **Metodi:**
  * `int prenotaPrimoLibero()`: Scorre l'array dall'inizio alla fine. Non appena trova un posto libero (ovvero il cui metodo `prenota()` restituisce `true`), **ritorna immediatamente il numero del posto** interrompendo il ciclo (basta fare `return posti[i].numero;`). Se il ciclo finisce e non ci sono posti liberi, restituisce `-1`.

Crea una classe `TesterCinema` con il `main`. Istanzia una Sala molto piccola (es. 3 posti). 
Chiama il metodo `prenotaPrimoLibero()` 4 volte. Stampa ogni volta il risultato: le prime tre volte dovrebbe stampare i numeri dei posti (1, 2, 3), la quarta volta dovrebbe stampare "Sala piena!" (perché il metodo ha restituito -1).

---