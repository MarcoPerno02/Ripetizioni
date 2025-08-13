# 🔢 ESERCIZIO: Estrazione e Analisi di Numeri da una Stringa

## DESCRIZIONE
Scrivi un **programma in C++** che utilizza un **ciclo `while`** per analizzare una stringa inserita dall’utente e:

1. Estrarre tutti i numeri interi presenti nella stringa (anche con più cifre consecutive).
2. Calcolare la **somma totale** di tutti i numeri trovati.
3. Calcolare il **numero medio** (media aritmetica) dei valori estratti.
4. Contare quanti numeri sono pari e quanti sono dispari.
5. Stampare la **sequenza dei numeri estratti in ordine inverso** rispetto alla loro apparizione.

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Chiedere all’utente di inserire una stringa contenente lettere, spazi e numeri (es: `"abc12x7y300z"`).

### 2. CICLO `while`
- Scorrere la stringa carattere per carattere.
- Riconoscere quando inizia una sequenza di cifre (`isdigit`).
- Convertire le cifre consecutive in un numero intero.
- Salvare il numero in un vettore per elaborazioni successive.

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `testo` → stringa inserita dall’utente.
- `i` → indice per scorrere la stringa.
- `numeroCorrente` → variabile per costruire il numero durante la lettura delle cifre.
- `numeri` → vettore contenente tutti i numeri estratti.
- `somma` → somma di tutti i numeri.
- `pari` → contatore dei numeri pari.
- `dispari` → contatore dei numeri dispari.

---

## PASSI PRINCIPALI
1. Leggere la stringa `testo`.
2. Inizializzare `i` a 0, `somma` a 0, `pari` e `dispari` a 0.
3. Usare un ciclo `while`:
   - Se il carattere è una cifra:
     - Avvia la costruzione del numero leggendo tutte le cifre consecutive.
     - Converti la sequenza di cifre in un intero.
     - Aggiungi il numero al vettore `numeri`.
   - Altrimenti, passa al carattere successivo.
4. Alla fine del ciclo:
   - Calcolare `somma` e media.
   - Contare numeri pari e dispari.
   - Stampare i numeri in ordine inverso.

---

## ⚠️ GESTIONE CASI PARTICOLARI
- Se non vengono trovati numeri → stampare messaggio di avviso.
- Gestire correttamente sequenze di più cifre.
- Gestire stringhe che iniziano o terminano con numeri.

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci una stringa: abc12x7y300z

Numeri trovati: 12 7 300
Somma: 319
Media: 106.333
Pari: 2
Dispari: 1
Numeri in ordine inverso: 300 7 12
```

---

## ✨ BONUS (FACOLTATIVO)
- Gestire anche numeri **negativi** (con segno `-` davanti).
- Permettere la ricerca di numeri anche in formato decimale.
- Stampare anche il numero massimo e il numero minimo trovati.

