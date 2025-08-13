# 🔍 ESERCIZIO: Analisi di Pattern in una Stringa con Ciclo `while`

## DESCRIZIONE  
Scrivi un **programma in C++** che utilizza un **ciclo `while`** per cercare e analizzare **pattern specifici** all’interno di una stringa inserita dall’utente.  

Il programma deve:
1. Contare quante volte compare la sottostringa `"ab"`.
2. Contare quante volte compare la sottostringa `"123"`.
3. Trovare la prima posizione in cui compare `"xyz"` (se presente).
4. Sostituire tutte le occorrenze di `"ciao"` con `"hello"`.
5. Stampare la stringa risultante dopo le sostituzioni.

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Chiedere all’utente di inserire una stringa di testo.

### 2. CICLO `while`
- Scorrere la stringa con un ciclo `while` utilizzando un indice `i`.
- Controllare, ad ogni posizione, se i caratteri successivi formano i pattern richiesti (`"ab"`, `"123"`, `"xyz"`, `"ciao"`).
- Aggiornare i contatori e memorizzare le posizioni quando necessario.

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `testo` → stringa inserita dall’utente.  
- `i` → indice del ciclo `while`.  
- `countAB` → quante volte appare `"ab"`.  
- `count123` → quante volte appare `"123"`.  
- `posXYZ` → indice della prima occorrenza di `"xyz"` (o `-1` se non presente).  
- `risultato` → stringa modificata dopo le sostituzioni di `"ciao"` con `"hello"`.  

---

## PASSI PRINCIPALI
1. Leggere la stringa `testo`.  
2. Inizializzare tutti i contatori e `posXYZ` a `-1`.  
3. Usare un ciclo `while` per scorrere la stringa:
   - Controllare se nei caratteri successivi compare `"ab"` → incrementare `countAB`.
   - Controllare se compare `"123"` → incrementare `count123`.
   - Se compare `"xyz"` e `posXYZ` è ancora `-1`, salvare la posizione.
4. Creare una nuova stringa `risultato` sostituendo `"ciao"` con `"hello"`.
5. Stampare:
   - Conteggio `"ab"`.
   - Conteggio `"123"`.
   - Posizione prima `"xyz"` (o messaggio “non trovato”).
   - Stringa finale.

---

## ⚠️ GESTIONE CASI PARTICOLARI
- Se la stringa è vuota → mostrare messaggio di errore e terminare.
- Gestire casi in cui i pattern non compaiono mai.

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci una stringa: ciao123abcabxyzciao

Risultati:

- 'ab' trovato 2 volte

- '123' trovato 1 volta

- 'xyz' trovato alla posizione 12

Stringa modificata: hello123abchello
```

---

## ✨ BONUS (FACOLTATIVO)
- Rendere la ricerca **case-insensitive** (ignora maiuscole/minuscole).
- Permettere di inserire i pattern da cercare direttamente da tastiera.
- Memorizzare le posizioni di tutte le occorrenze trovate in un array/vettore e stamparle.
