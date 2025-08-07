# 🔁 ESERCIZIO: Triangolo Numerico con Cicli Annidati

## DESCRIZIONE  
Scrivi un **programma in C++** che costruisce un **triangolo numerico** utilizzando **cicli annidati**, con un ciclo esterno `while` e un ciclo interno `for`.

L’utente inserisce un numero intero positivo `n`, e il programma stampa un triangolo con `n` righe, dove la riga `i` contiene i numeri da `1` a `i`.

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Chiedere all’utente un numero intero positivo `n`

### 2. CICLO `while`
- Utilizzare un ciclo `while` per iterare sulle righe del triangolo (da `1` a `n`)

### 3. CICLO `for`
- Usare un ciclo `for` annidato per stampare i numeri da `1` fino al numero della riga corrente

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `n` → numero inserito dall’utente
- `i` → contatore per il ciclo `while` (riga corrente)
- `j` → contatore per il ciclo `for` (numeri per riga)

### PASSI PRINCIPALI
1. Leggere il valore di `n`
2. Usare un ciclo `while` da `i = 1` a `n`
   - Per ogni `i`, usare un ciclo `for` da `1` a `i`
   - Stampare i numeri su una riga, separati da spazi
3. Passare alla riga successiva dopo ogni iterazione del ciclo esterno

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se l’utente inserisce un numero minore di 1 → mostrare messaggio di errore e uscire

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci un numero: 5

Triangolo numerico:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

---

## ✨ BONUS (FACOLTATIVO)

- Permettere all’utente di scegliere se il triangolo deve essere **crescente** o **decrescente**
  - Crescente: riga `i` → da `1` a `i`
  - Decrescente: riga `i` → da `1` a `n - i + 1`
- Consentire più esecuzioni tramite un ciclo `do...while`
