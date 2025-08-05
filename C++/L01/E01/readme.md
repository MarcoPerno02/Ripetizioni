# 🧮 ESERCIZIO: Calcolatrice Semplice in C++

## DESCRIZIONE  
Crea un **programma in C++** che consenta all’utente di **inserire due numeri** e **scegliere un'operazione matematica** tra somma, sottrazione, moltiplicazione e divisione. Il programma deve poi **mostrare il risultato** a schermo.

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Chiedere all’utente di inserire due numeri (`double`)
- Chiedere all’utente di scegliere un’operazione tra:
  - `+` Somma
  - `-` Sottrazione
  - `*` Moltiplicazione
  - `/` Divisione

---

## 2. STRUTTURA DEL PROGRAMMA
- Uso di `cin` e `cout` per input/output
- Uso di `if...else` oppure `switch` per gestire l’operazione
- Uso degli operatori aritmetici di base (`+`, `-`, `*`, `/`)

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `num1`, `num2` → i due numeri inseriti dall’utente  
- `operazione` → carattere che rappresenta l’operazione scelta  
- `risultato` → risultato finale dell’operazione

### PASSI PRINCIPALI
1. Leggere `num1` e `num2` da tastiera
2. Leggere il carattere `operazione`
3. In base all’operazione, eseguire il calcolo corretto
4. Stampare il risultato a video

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Divisione per zero → mostrare messaggio di errore: `Errore: divisione per zero non consentita`
- Operazione non valida → mostrare messaggio: `Operazione non riconosciuta`

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci il primo numero: 10
Inserisci il secondo numero: 5
Scegli l'operazione (+, -, *, /): *
Risultato: 50
```

---

## ✨ BONUS (FACOLTATIVO)
- Ripetere l’operazione più volte in un ciclo `while` finché l’utente lo desidera
- Supportare numeri interi e decimali
- Migliorare il messaggio di output con descrizione dettagliata (es: "10 * 5 = 50")
