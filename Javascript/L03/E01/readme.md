# 🧮 ESERCIZIO: Calcolatrice Web Interattiva

## DESCRIZIONE  
Crea una **pagina web funzionante come calcolatrice**, con un’interfaccia semplice e reattiva.  
L’utente può eseguire operazioni aritmetiche di base: **addizione**, **sottrazione**, **moltiplicazione**, **divisione**.

---

## 📌 REQUISITI OBBLIGATORI

### 1. STRUTTURA BASE (HTML):
- Un display (es: `div#display`) per mostrare i numeri e i risultati
- Bottoni numerici da `0` a `9`
- Bottoni per le operazioni: `+`, `-`, `×`, `÷`
- Bottone `=` per calcolare il risultato
- Bottone `C` per cancellare tutto
- Bottone `←` (backspace) per cancellare l’ultimo carattere

---

### 2. FUNZIONALITÀ JAVASCRIPT:
- I bottoni sono gestiti con `querySelectorAll("button")` e `addEventListener("click", ...)`
- Ogni bottone aggiorna il contenuto del display (`innerText`)
- Il bottone `=`:
  * Costruisce un’espressione in stringa usando tre variabili:
    - `lastValue` → primo operando
    - `lastOperator` → operatore
    - `currentInput` → secondo operando
  * Calcola il risultato con `eval()`
  * Mostra il risultato e lo imposta come nuovo `currentInput`
- Il bottone `C` cancella tutto (display e memoria)
- Il bottone `←` rimuove l’ultimo carattere visibile e l’ultimo carattere digitato

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `currentInput` → numeri digitati al momento
- `lastOperator` → operatore premuto più recentemente
- `lastValue` → valore precedente al nuovo numero

### FUNZIONI PRINCIPALI
- `handleInput(value)`  
  ↳ Dirige l'input a seconda del tipo: numero, operatore, comando

- `isOperator(value)`  
  ↳ Restituisce `true` se il valore è `+`, `-`, `*`, `/`

- `handleOperator(op)`  
  ↳ Se esiste un’operazione in corso, la esegue prima di assegnare il nuovo operatore

- `calculateResult()`  
  ↳ Costruisce un’espressione `stringa` come `8 * 4` e usa `eval()` per il calcolo  
  ↳ Mostra il risultato e lo memorizza per operazioni successive

- `clearDisplay()`  
  ↳ Svuota display e tutte le variabili

- `deleteLastCharacter()`  
  ↳ Rimuove l’ultimo carattere sia dal display sia da `currentInput`

- `updateDisplay(value)`  
  ↳ Aggiunge il carattere al display

---

## ⚠️ GESTIONE INPUT NON VALIDI

- Se `currentInput` è vuoto e si preme un operatore → ignora l’input
- Se si tenta di usare `=` con uno degli elementi mancanti (operando o operatore) → ignora
- Divisione per zero → Dare errore

## 💡 ESEMPIO DI STRUTTURA HTML
```
+---------------------+
|            123 + 45 | ← Display
+---------------------+
| 7 | 8 | 9 | ÷ | ← |
| 4 | 5 | 6 | × | C |
| 1 | 2 | 3 | - |   |
| 0 | . | = | + |   |
```
