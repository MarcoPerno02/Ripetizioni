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

---