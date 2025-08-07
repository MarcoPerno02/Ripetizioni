# 🔁 ESERCIZIO: Conteggio, Somma e Numeri Pari/Dispari con Ciclo `while`

## DESCRIZIONE  
Scrivi un **programma in C++** che utilizza un **ciclo `while`** per:

1. Contare da 1 fino a un numero `n` inserito dall’utente.
2. Calcolare la somma di tutti i numeri da 1 a `n`.
3. Contare quanti numeri pari e quanti numeri dispari ci sono tra 1 e `n`.
4. Stampare tutti i numeri pari trovati.

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Chiedere all’utente un numero intero positivo `n`.

### 2. CICLO `while`
- Usare un ciclo `while` per iterare da 1 a `n`.
- Ad ogni iterazione:
  - Aggiornare la somma totale.
  - Verificare se il numero è pari o dispari e aggiornare i rispettivi contatori.
  - Se il numero è pari, memorizzarlo (o stamparlo direttamente).

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `n` → numero inserito dall’utente.
- `i` → contatore del ciclo `while`.
- `somma` → variabile per accumulare la somma dei numeri.
- `pari` → contatore per i numeri pari.
- `dispari` → contatore per i numeri dispari.

### PASSI PRINCIPALI
1. Leggere il valore di `n`.
2. Inizializzare `i` a 1, `somma` a 0, `pari` e `dispari` a 0.
3. Usare un ciclo `while` per iterare da 1 a `n`.
4. Ad ogni iterazione:
   - Aggiungere `i` a `somma`.
   - Controllare se `i` è pari o dispari e aggiornare i contatori.
   - Stampare il numero se è pari.
5. Alla fine, stampare la somma totale, il numero totale di pari e dispari.

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se l’utente inserisce un numero minore di 1 → mostrare messaggio di errore e uscire.

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci un numero: 7

Numeri pari tra 1 e 7:
2
4
6

Somma totale: 28
Numeri pari: 3
Numeri dispari: 4
```

---

## ✨ BONUS (FACOLTATIVO)

- Memorizzare i numeri pari in un array o vettore e stamparli alla fine.
- Permettere all’utente di ripetere il processo più volte (ciclo `do...while`).
- Aggiungere il calcolo della media dei numeri pari e dispari.
