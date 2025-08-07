# 🔁 ESERCIZIO: Calcolo della Somma e del Fattoriale con Cicli `for`

## DESCRIZIONE  
Scrivi un **programma in C++** che utilizza **solo cicli `for`** per calcolare:

1. La **somma** dei numeri da `1` a `n`
2. Il **fattoriale** del numero `n` (cioè `n!`)

L’utente inserisce un numero intero positivo `n` e il programma mostra entrambi i risultati.

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Chiedere all’utente un numero intero positivo `n`

### 2. CICLI `for`
- Usare un ciclo `for` per sommare i numeri da `1` a `n`
- Usare un secondo ciclo `for` per calcolare il fattoriale (`1 * 2 * ... * n`)

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `n` → numero inserito dall’utente
- `i` → contatore nei cicli `for`
- `somma` → accumulatore per la somma
- `fattoriale` → accumulatore per il prodotto

### PASSI PRINCIPALI
1. Leggere il valore di `n`
2. Usare un ciclo `for` per calcolare la somma da `1` a `n`
3. Usare un ciclo `for` per calcolare il fattoriale di `n`
4. Stampare i risultati

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se l’utente inserisce un numero minore di 1 → mostrare messaggio di errore e uscire

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci un numero: 5

Somma da 1 a 5 = 15
Fattoriale di 5 = 120
```

---

## ✨ BONUS (FACOLTATIVO)

- **Bonus 1:** Stampare anche la **formula dettagliata** dei calcoli, ad esempio:
```
Somma: 1 + 2 + 3 + 4 + 5 = 15
Fattoriale: 1 * 2 * 3 * 4 * 5 = 120
```
- **Bonus 2:** Permettere all’utente di ripetere il processo per più numeri (`do...while`)
- **Bonus 3:** Calcolare anche la **media** dei numeri da `1` a `n` (come `somma / n`)

---

## 🔧 SUGGERIMENTI

- Per stampare la **formula della somma o del fattoriale**, puoi usare un ciclo che stampa i numeri uno per uno, separandoli con `+` o `*`
- Evita l’ultimo simbolo `+` o `*` alla fine (usa un `if` o stampa separatamente)

---

