# Lezione 1: I Fondamenti di Java

## 1. Linguaggio Macchina e Linguaggi di Programmazione
Il computer comprende esclusivamente il **linguaggio macchina**, una sequenza di zeri e uni (0 e 1). Scrivere programmi in questo modo è impossibile per un essere umano. Per questo motivo utilizziamo i linguaggi di programmazione, che usano parole comprensibili (spesso in inglese). 
Esistono linguaggi di "basso livello", complessi e vicini al linguaggio macchina, e linguaggi di "alto livello" come Java, molto più intuitivi.

## 2. Come funziona Java
Java usa un sistema speciale per tradurre il nostro codice in linguaggio macchina. 
Noi scriviamo il file sorgente con estensione `.java`.
Il **Compilatore** controlla il codice e lo traduce in un formato intermedio chiamato **Bytecode** (file `.class`).
La **JVM (Java Virtual Machine)** legge il Bytecode e lo traduce in linguaggio macchina in tempo reale, permettendo al programma di funzionare su qualsiasi sistema operativo (Windows, Mac, Linux).

## 3. La struttura base: il metodo main
Ogni programma Java deve essere contenuto all'interno di una **Classe**. All'interno della classe, il punto di partenza obbligatorio del programma è il metodo `main`. Senza di esso, il codice non parte.

Analizziamo la riga `public static void main(String[] args)`:
* **public**: il metodo è visibile e accessibile dall'esterno.
* **static**: permette al programma di partire subito, senza dover creare oggetti.
* **void**: il metodo esegue delle istruzioni ma non restituisce alcun dato al sistema operativo al termine dell'esecuzione.
* **main**: il nome del metodo, rigorosamente in minuscolo.
* **String[] args**: un vettore utilizzato per ricevere informazioni dall'esterno all'avvio.

## 4. Tipi di dati fondamentali
Una variabile è un contenitore in memoria, definito da un nome e da un tipo di dato. I tre tipi numerici principali che useremo sono:
* **int**: numeri interi senza virgola (esempi: 10, -5, 0).
* **double**: numeri decimali ad alta precisione (esempi: 3.14, 19.99). È il formato standard di Java per i numeri con la virgola.
* **float**: numeri decimali che occupano meno memoria. In Java richiedono obbligatoriamente la lettera `f` alla fine del numero (esempio: 5.5f), altrimenti il programma segnala errore.

## 5. Stampa a video
L'istruzione `System.out.println()` permette di mostrare messaggi sullo schermo.
Il testo va inserito tra virgolette doppie.
Il simbolo `+` viene usato per la **concatenazione**, ovvero per incollare del testo al valore contenuto in una variabile.

---

## Tracce degli Esercizi

### Esercizio 1: Calcolatore Rettangolo (Guidato)
Scrivi un programma che definisce la base e l'altezza di un rettangolo usando variabili intere. Il programma deve calcolare l'area. Successivamente, definisci un coefficiente moltiplicativo usando una variabile decimale e calcola l'area modificata. Stampa tutti i risultati a video.

### Esercizio 2: Convertitore di Temperatura
Scrivi un programma che memorizza una temperatura in gradi Celsius (usando un `double`). Il programma deve convertire la temperatura in gradi Fahrenheit e stampare il risultato.
Usa questa formula per la conversione: 
`F = C * 1.8 + 32`

### Esercizio 3: Calcolo dell'Indice di Massa Corporea (IMC)
Scrivi un programma che definisce il peso di una persona in chilogrammi (es. 75.5) e l'altezza in metri (es. 1.80). Calcola l'Indice di Massa Corporea (IMC) e stampa il risultato a video.
Usa questa formula per il calcolo:
`IMC = peso / (altezza * altezza)`