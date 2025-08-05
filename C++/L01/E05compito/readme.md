# 🔁 ESERCIZIO: Stampa di Numeri e Tabelle con Cicli `while` e `for`

## DESCRIZIONE  
Scrivi un **programma in C++** che utilizza **sia un ciclo `while` sia un ciclo `for`** per stampare:

1. Tutti i numeri da 1 a `n` (inclusi), dove `n` è un numero inserito dall’utente, usando un ciclo `while`.
2. La **tabellina del numero `n`**, da `1 x n` fino a `10 x n`, usando un ciclo `for`.

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Chiedere all’utente un numero intero positivo `n`

### 2. CICLO `while`
- Stampare tutti i numeri da `1` a `n`, uno per riga

### 3. CICLO `for`
- Stampare la **tabellina del `n`**, nel formato:
  ```
  1 x n = ...
  2 x n = ...
  ...
  10 x n = ...
  ```

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `n` → numero inserito dall’utente
- `i` → contatore per il ciclo `while`
- `j` → contatore per il ciclo `for`

### PASSI PRINCIPALI
1. Leggere il valore di `n`
2. Usare un ciclo `while` per stampare da `1` a `n`
3. Usare un ciclo `for` per stampare la tabellina del `n`

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se l’utente inserisce un numero minore di 1 → mostrare messaggio di errore e uscire

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci un numero: 5

Numeri da 1 a 5:
1
2
3
4
5

Tabellina del 5:
1 x 5 = 5
2 x 5 = 10
3 x 5 = 15
4 x 5 = 20
5 x 5 = 25
6 x 5 = 30
7 x 5 = 35
8 x 5 = 40
9 x 5 = 45
10 x 5 = 50
```

---

## ✨ BONUS (FACOLTATIVO)

- Ripetere il processo per più numeri finché l’utente lo desidera (con ciclo `do...while`)
- Aggiungere un'opzione per invertire l’ordine della stampa (es: da `n` a `1` nel `while`)
