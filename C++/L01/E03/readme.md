# 🔤 ESERCIZIO: Verifica se una Lettera è una Vocale

## DESCRIZIONE  
Scrivi un **programma in C++** che chieda all’utente di **inserire una singola lettera** e verifichi se si tratta di una **vocale** (`a`, `e`, `i`, `o`, `u`, sia maiuscola che minuscola).

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- Richiedere una **singola lettera** (`char`)
- L’input può essere sia maiuscolo che minuscolo

### 2. LOGICA
- Verificare se la lettera fa parte del gruppo delle vocali
- Considerare sia maiuscole che minuscole (`A, E, I, O, U`)

### 3. OUTPUT
- Stampare `"È una vocale"` oppure `"Non è una vocale"`

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `lettera` → il carattere inserito dall’utente

### PASSI PRINCIPALI
1. Leggere il carattere da tastiera
2. Verificare se appartiene all’insieme `{a, e, i, o, u, A, E, I, O, U}`
3. Stampare il messaggio corrispondente

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se l’utente inserisce un numero o simbolo → mostrare messaggio: `"Input non valido"`
- Accettare solo un singolo carattere (non stringhe)

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci una lettera: e
È una vocale
```

```
Inserisci una lettera: G
Non è una vocale
```

```
Inserisci una lettera: 5
Input non valido
```

---

## ✨ BONUS (FACOLTATIVO)
- Verifica se l’input è davvero una lettera (`isalpha`)
- Ripetere il controllo finché l’utente lo desidera
- Mostrare se la vocale è **maiuscola** o **minuscola**
- Creare una funzione `bool isVocale(char c)` per modularizzare la logica
