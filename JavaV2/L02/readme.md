# Lezione 2: La Classe String e i Vettori (Array)

## 1. La Classe String: Più di una semplice variabile
Fino ad ora abbiamo visto i tipi di dati *primitivi* (`int`, `double`, `float`). La **String** in Java è diversa: è una vera e propria **Classe** (nota la "S" maiuscola). Questo significa che una variabile String non contiene solo un testo, ma mette a disposizione degli strumenti (metodi) per manipolarlo.

### Concatenazione
Possiamo unire due stringhe o una stringa e un numero usando il simbolo `+`.
Esempio: `"Ciao " + "Marco"` diventa `"Ciao Marco"`.

### Lunghezza e Confronto (Attenzione all'esame!)
* **Lunghezza:** Per sapere quanti caratteri ha una stringa, si usa il metodo `.length()`. (Esempio: `int quantiCaratteri = nome.length();`)
* **Confronto:** L'errore più comune all'esame è confrontare due stringhe usando `==`. In Java, per controllare se due stringhe contengono lo stesso testo, si **deve** usare il metodo `.equals()`.
  * Sbagliato: `if (password == "segreta")`
  * Corretto: `if (password.equals("segreta"))`

---

## 2. I Vettori (Array): La "Cassettiera" dei Dati
Spesso nei programmi non basta una sola variabile. Se devi salvare i voti di 20 studenti, non puoi creare 20 variabili diverse (`voto1`, `voto2`, ecc.). 
Il **vettore (array)** risolve questo problema: è come una cassettiera dove ogni cassetto contiene un dato dello stesso tipo.

### Regole d'oro dei Vettori:
1. **Dimensione fissa:** Quando crei la cassettiera, devi decidere quanti cassetti ha. Non può rimpicciolirsi o ingrandirsi.
2. **Indice:** Ogni cassetto è numerato. In Java, **si inizia sempre a contare da 0**. Se un vettore ha 5 spazi, gli indici vanno da `0` a `4`.

### Dichiarazione e Creazione
```java
// Creo un vettore di 5 numeri interi (tutti i cassetti partono con il valore 0)
int[] voti = new int[5];

// Riempio i cassetti specificando l'indice
voti[0] = 7;
voti[1] = 8;
voti[2] = 5;
voti[3] = 9;
voti[4] = 6;

// In alternativa, posso crearlo e riempirlo subito (se conosco già i dati)
int[] numeriFortunati = {4, 8, 15, 16, 23, 42};
```

## 3. Scorrere i Vettori: Il Ciclo For
Per leggere o stampare tutto il contenuto di un vettore, l'uso manuale (voti[0], voti[1]) è inutile per array grandi. Si usa il ciclo for, che ripete un'azione per ogni "cassetto".

Ogni vettore in Java conosce la propria grandezza grazie alla proprietà .length (questa volta senza parentesi!).

```java
int[] array = new int[3];
// Il ciclo parte dall'indice i=0 e si ferma quando i raggiunge la fine dell'array
for (int i = 0; i < array.length; i++) {
    System.out.println("Il valore nel cassetto " + i + " e': " + array[i]);
}
```

## 4. Il Mistero di String[] args
Ora puoi capire cos'è `String[] args` dentro il metodo main.
`args` non è altro che un vettore di Stringhe. Serve a ricevere dati "dall'esterno" nel momento in cui il programma viene avviato (da riga di comando o dalle configurazioni dell'ambiente di sviluppo come Eclipse/IntelliJ). Se l'utente avvia il programma scrivendo due parole, queste finiranno in `args[0]` e `args[1]`.

## Tracce degli Esercizi
### Esercizio 1: Operazioni con le Stringhe
Crea un programma che salva in due variabili separate il tuo nome e il tuo cognome.
Uniscili in una terza variabile chiamata nomeCompleto.
Stampa a video il nome completo, e poi stampa il numero totale di caratteri che compongono il nome completo.

### Esercizio 2: Vettore e Matematica (Classico da Esame)
Crea un vettore di tipo double capace di contenere 4 prezzi (es. 12.50, 4.20, 19.99, 1.00).
Usa un ciclo for per scorrere l'intero vettore e calcolare la somma totale di tutti i prezzi. Infine, calcola e stampa la media dei prezzi.

### Esercizio 3: Lettura da args (Riga di comando)
Scrivi un programma che utilizzi il vettore args del main. Il programma deve presumere che gli vengano passati due parametri (es. Nome e Età). Stampa a video una frase come: "Benvenuto [Nome], hai [Età] anni!".
Nota: ricordati di configurare gli argomenti del programma nel tuo IDE prima di eseguire il codice (Run Configurations > Program arguments).

### Esercizio 4: Validazione Password (Stringhe)
Scrivi un programma che definisce una variabile String chiamata `passwordInserita`. Il programma deve verificare due criteri di sicurezza:
1. La password deve essere lunga **almeno 8 caratteri**.
2. La password deve essere uguale alla password di sistema (es. "Java2026").

Il programma deve stampare "Errore: Password troppo corta" se non supera il primo controllo, "Accesso negato" se è della lunghezza giusta ma errata, e "Accesso consentito" se supera entrambi i controlli.
*⚠️ Nota da Esame:* Ricorda di usare il metodo corretto per il confronto tra stringhe!

### Esercizio 5: Caccia al Tesoro: Il Valore Massimo (Array)
Crea un vettore di numeri interi (`int[] punteggi`) contenente 6 valori a tua scelta (es. `14, 42, 8, 23, 99, 15`). 
Usa un ciclo `for` per esaminare l'intero vettore e trovare il valore più alto (il massimo) memorizzato al suo interno. Al termine del ciclo, stampa a video il punteggio massimo trovato.
*Suggerimento:* Crea una variabile d'appoggio `int massimo = punteggi[0];` prima del ciclo e aggiornala ogni volta che trovi un numero più grande durante lo scorrimento.

### Esercizio 6: Il Conta-Numeri Pari (Array e Condizionali)
Definisci un array di 8 numeri interi con valori positivi e negativi a tua scelta. Utilizzando un ciclo `for`, scorri l'intero array e conta quanti dei numeri presenti sono **pari**. Al termine del programma, stampa a video il conteggio totale (es. "Nel vettore ci sono 4 numeri pari").
*Suggerimento:* Ti servirà una variabile contatore (es. `int conteggio = 0;`) che si incrementa di 1 solo se la condizione del modulo (`% 2 == 0`) è vera.

### Esercizio 7: Appello della Classe (Array di Stringhe)
I vettori non contengono solo numeri! Crea un vettore di Stringhe chiamato `registro` contenente i nomi di 5 studenti (es. "Anna", "Marco", "Sofia", "Luigi", "Paola").
Usa un ciclo `for` per scorrere l'array e stampare l'appello in questo formato ordinato:
`Studente 1: Anna`
`Studente 2: Marco`
...
*⚠️ Attenzione all'indice:* Gli array in Java partono da `0`, ma l'output per l'utente deve mostrare "Studente 1". Come puoi modificare la stampa all'interno del ciclo?

### Esercizio 8: Il Controllore dei Bagagli (Uso avanzato di args)
Scrivi un programma che utilizzi il vettore `args` del main per simulare il controllo del peso dei bagagli all'aeroporto. Il programma deve accettare un parametro da riga di comando che rappresenta il peso in kg del bagaglio (es. "23").
Se il peso supera i 20 kg, stampa "Bagaglio in sovrappeso! Pagamento supplemento richiesto". Altrimenti stampa "Bagaglio accettato".
*Suggerimento:* Gli elementi dentro `args` sono stringhe. Per trasformare una stringa in un numero intero e poter fare i confronti matematici, usa questo comando:
`int peso = Integer.parseInt(args[0]);`