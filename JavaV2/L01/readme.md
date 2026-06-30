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

## 6. Operatori
Gli operatori permettono di eseguire operazioni matematiche sui valori contenuti nelle variabili. Di seguito, l'elenco completo degli operatori che utilizzeremo:
* `+`: addizione
* `-`: sottrazione
* `*`: moltiplicazione
* `/`: divisione
* `%`: modulo (resto della divisione)

# 7. Blocco di condizionali if-else
Un blocco di condizionali è un insieme di istruzioni che vengono eseguite solo se una determinata condizione è vera. 
Ad esempio, se vogliamo stampare un messaggio solo se una variabile è maggiore di 10, useremo un blocco di condizionali.

L'istruzione `if` viene usata per controllare se una condizione è vera. 
Se la condizione è vera, il blocco di istruzioni viene eseguito. 
Se la condizione è falsa, il blocco di istruzioni viene saltato.

L'istruzione `else` viene usata per eseguire un blocco di istruzioni se la condizione è falsa.

# 8. Cicli
I cicli sono un insieme di istruzioni che vengono eseguite più volte. Di seguito, l'elenco completo dei cicli che utilizzeremo:
* `for`: ciclo for
* `while`: ciclo while
* `do-while`: ciclo do-while

# 9. Operatori relazionali
Gli operatori relazionali permettono di confrontare i valori contenuti nelle variabili, per poi esser usati all'interno di un blocco condizionale o di un ciclo. Di seguito, l'elenco completo degli operatori relazionali che utilizzeremo:
* `==`: uguale a
* `!=`: diverso da
* `>`: maggiore di
* `<`: minore di
* `>=`: maggiore o uguale a
* `<=`: minore o uguale a

# 10. Operatori logici
Gli operatori logici permettono di combinare più condizioni tra loro, per poi esser usati all'interno di un blocco condizionale o di un ciclo. Di seguito, l'elenco completo degli operatori logici che utilizzeremo:
* `&&`: AND logico
* `||`: OR logico
* `!`: NOT logico

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

### Esercizio 4: Sconto Percentuale
Scrivi un programma che definisce il prezzo di un prodotto (es. 100) e il valore percentuale dello sconto (es. 10). Il programma deve calcolare il prezzo scontato e stampare il risultato a video. 
Usa questa formula per il calcolo:
`prezzoScontato = prezzo - (prezzo * percentuale / 100)`

### Esercizio 5: Pari o Dispari
Scrivi un programma che definisce un numero intero. Il programma deve determinare se il numero è pari o dispari e stampare il risultato a video. 
Suggerimento: usa l'operatore modulo (`%`).

### Esercizio 6: Tipo di triangolo
Scrivi un programma che definisce tre lati di un triangolo (a, b, c). Successivamente, determinare se i tre lati possono formare un triangolo e stampare il risultato. In caso affermativo, indicare di che tipo di triangolo si tratta (equilatero, isoscele o scaleno).

### Esercizio 7: Calcolatrice Semplice
Scrivi un programma che definisce due numeri interi e un operatore (+, -, *, /). Il programma deve eseguire l'operazione richiesta e stampare il risultato a video.

### Esercizio 8: Stampa numeri primi compresi tra due numeri inseriti dall'utente
Scrivi un programma che definisce due numeri interi (il primo minore del secondo) e ne stampa tutti i numeri primi compresi tra i due. 