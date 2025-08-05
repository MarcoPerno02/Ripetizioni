# 🧑‍💻 ESERCIZIO: Controllo Età per Accesso

## DESCRIZIONE  
Scrivi un **programma in C++** che chieda all’utente la sua **età** e determini se può accedere a un servizio in base alle seguenti regole:

- Minorenni (<18): accesso negato
- Tra 18 e 65 anni: accesso consentito
- Over 65: accesso consentito ma con messaggio aggiuntivo

---

## 📌 REQUISITI OBBLIGATORI

### 1. INPUT UTENTE
- L’utente deve inserire la propria età (numero intero)

### 2. LOGICA
- Se età < 18 → `Accesso negato: sei minorenne.`
- Se età >= 18 e <= 65 → `Accesso consentito.`
- Se età > 65 → `Accesso consentito. Attenzione: servizio disponibile con supporto.`

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `eta` → età dell’utente

### PASSI PRINCIPALI
1. Leggere `eta` da tastiera
2. Usare costrutti `if`, `else if`, `else` per valutare i range
3. Stampare il messaggio corrispondente

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se l’età inserita è negativa o non realistica (>120), mostrare messaggio: `Valore non valido`

---

## 💡 ESEMPIO DI ESECUZIONE
```
Inserisci la tua età: 16
Accesso negato: sei minorenne.
```

```
Inserisci la tua età: 34
Accesso consentito.
```

```
Inserisci la tua età: 72
Accesso consentito. Attenzione: servizio disponibile con supporto.
```

```
Inserisci la tua età: -5
Valore non valido
```

---

## ✨ BONUS (FACOLTATIVO)

- Continuare a chiedere l’età finché l’utente non inserisce un valore valido
- Ripetere la verifica per più utenti (con ciclo `while`)
- Creare una funzione `string verificaAccesso(int eta)`
