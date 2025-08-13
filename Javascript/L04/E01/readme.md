# 🏁 ESERCIZIO: Gioco del Labirinto Interattivo

## DESCRIZIONE
Crea una **pagina web con un gioco del labirinto**, dove l’utente controlla un personaggio usando la tastiera e deve raggiungere l’uscita evitando ostacoli.

---

## 📌 REQUISITI OBBLIGATORI

### 1. STRUTTURA BASE (HTML)
- Un contenitore `div#maze` che rappresenta la griglia del labirinto
- Ogni cella è un `div` con classe che indica il tipo di elemento:
  - `cell-wall` (muro)
  - `cell-path` (percorso libero)
  - `cell-player` (giocatore)
  - `cell-exit` (uscita)
- Un’area `div#status` che mostra il numero di mosse e lo stato ("In corso", "Hai vinto!")

---

## 2. FUNZIONALITÀ JAVASCRIPT
- Rappresentazione del labirinto con una **matrice bidimensionale** (array di array di numeri o stringhe)
- Posizione iniziale del giocatore definita nella matrice
- Ascolto dei tasti freccia per muovere il giocatore
- Controllo collisioni: il giocatore può muoversi solo su celle libere
- Incremento del contatore mosse ad ogni spostamento valido
- Se il giocatore raggiunge la cella uscita → mostra messaggio di vittoria

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI
- `maze` → matrice che rappresenta il labirinto (es. `0` = muro, `1` = libero, `P` = player, `E` = exit)
- `playerRow` → riga attuale del giocatore
- `playerCol` → colonna attuale del giocatore
- `moves` → numero di mosse effettuate

### FUNZIONI PRINCIPALI
- `renderMaze()`  
  ↳ Crea l’HTML del labirinto basandosi sulla matrice
- `movePlayer(direction)`  
  ↳ Calcola la nuova posizione e verifica se è valida
- `checkWin()`  
  ↳ Controlla se il giocatore è sulla cella uscita
- `resetGame()`  
  ↳ Reimposta il labirinto e il contatore mosse

---

## ⚠️ GESTIONE CASI PARTICOLARI
- Se il giocatore tenta di andare contro un muro → mossa ignorata
- Limiti di bordo: impedire movimenti fuori dalla matrice
- Possibilità di rigenerare il labirinto premendo un tasto speciale (bonus)

---

## 💡 ESEMPIO DI STRUTTURA HTML
```
[ Labirinto ]
🟥🟩⬜⬜⬜
⬜⬜🟥⬜🟥
⬜🟥🟥⬜⬜
⬜⬜⬜⬜🟥
⬜🟥⬜🟩⬜

🟥 = muro
⬜ = percorso libero
🟩 = giocatore
🟩(uscita) = vittoria
```

---
## CONSIGLIO
- Per ascoltare i tasti, utilizza l'evento `keydown` e gestisci le frecce direzionali.
```
// Ascolta quando un tasto viene premuto
document.addEventListener("keydown", function(event) {
    // Mostra il nome del tasto
    document.getElementById("output").textContent =
    "Hai premuto: " + event.key;
});
```
---

## ✨ BONUS (FACOLTATIVO)
- Timer per completare il labirinto
- Generazione casuale del labirinto all’avvio
- Traccia del percorso già fatto (celle colorate diversamente)
- Modalità “fantasma” dove i muri si spostano
