# 🔢 ESERCIZIO: Verifica se un Numero è Pari o Dispari

## DESCRIZIONE  
Scrivi un **programma in C++** che chieda all’utente di inserire un numero intero e verifichi se è **pari** oppure **dispari**, mostrando il risultato a schermo.

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Chiedere all’utente di inserire un numero intero (`int`)

### 2. LOGICA
- Utilizzare l’operatore modulo `%` per determinare se il numero è divisibile per 2

### 3. OUTPUT
- Stampare `"Il numero è pari"` oppure `"Il numero è dispari"` a seconda del risultato

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `numero` → il numero inserito dall’utente

### PASSI PRINCIPALI
1. Leggere `numero` da tastiera
2. Calcolare `numero % 2`
3. Se il resto è 0 → numero pari  
   Se il resto è 1 o -1 → numero dispari
4. Stampare il risultato

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Gestire numeri negativi (es: `-3` è comunque dispari)
- Gestire lo zero (considerato pari)

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci un numero intero: 7
Il numero è dispari
```

```
Inserisci un numero intero: 42
Il numero è pari
```

---

## ✨ BONUS (FACOLTATIVO)
- Consentire all’utente di ripetere più volte l’operazione (loop `while`)
- Evidenziare se il numero è anche multiplo di 10
- Usare una funzione `bool isPari(int n)` per modularizzare il codice
---