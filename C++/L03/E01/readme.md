# 🔤 ESERCIZIO: Analisi di una Stringa con Ciclo `while`

## DESCRIZIONE  
Scrivi un **programma in C++** che utilizza un **ciclo `while`** per:

1. Leggere una stringa inserita dall’utente.  
2. Contare il numero totale di caratteri.  
3. Contare quante lettere sono maiuscole e quante minuscole.  
4. Contare quante cifre numeriche ci sono.  
5. Stampare tutte le vocali trovate nella stringa.

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Chiedere all’utente di inserire una **stringa qualsiasi** (può contenere lettere, numeri e simboli).

### 2. CICLO `while`
- Usare un ciclo `while` per scorrere la stringa carattere per carattere.
- Ad ogni iterazione:
  - Incrementare il contatore dei caratteri.
  - Verificare se il carattere è una lettera maiuscola o minuscola e aggiornare i rispettivi contatori.
  - Verificare se il carattere è una cifra numerica e aggiornare il relativo contatore.
  - Se il carattere è una vocale (a, e, i, o, u, sia maiuscola che minuscola) → stamparla.

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `testo` → stringa inserita dall’utente.  
- `i` → indice per scorrere la stringa.  
- `maiuscole` → contatore delle lettere maiuscole.  
- `minuscole` → contatore delle lettere minuscole.  
- `cifre` → contatore delle cifre numeriche.  
- `totaleCaratteri` → contatore dei caratteri totali.  

### PASSI PRINCIPALI
1. Leggere la stringa `testo`.  
2. Inizializzare `i` a 0 e i contatori a 0.  
3. Usare un ciclo `while` fino a raggiungere la fine della stringa (`i < testo.length()`).  
4. Ad ogni iterazione:
   - Incrementare `totaleCaratteri`.  
   - Controllare se `testo[i]` è maiuscola, minuscola o cifra e aggiornare i contatori.  
   - Se è una vocale, stamparla.  
5. Alla fine, stampare:
   - Numero totale di caratteri.
   - Numero di lettere maiuscole.
   - Numero di lettere minuscole.
   - Numero di cifre.

---

## ⚠️ GESTIONE CASI PARTICOLARI
- Se l’utente inserisce una stringa vuota → mostrare messaggio di errore e terminare.

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci una stringa: Ciao Mondo 123!

Vocali trovate:
i
a
o
o

Totale caratteri: 15
Lettere maiuscole: 2
Lettere minuscole: 7
Cifre: 3
```

---

## ✨ BONUS (FACOLTATIVO)
- Memorizzare le vocali in un array o vettore e stamparle tutte alla fine.  
- Contare anche gli spazi e i segni di punteggiatura separatamente.  
- Calcolare la percentuale di vocali rispetto al totale delle lettere.
