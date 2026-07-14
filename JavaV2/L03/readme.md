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

---