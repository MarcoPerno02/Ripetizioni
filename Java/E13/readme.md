# 🚗 ESERCIZIO: Gestore di Veicoli da File

## DESCRIZIONE  
Crea un **programma Java a oggetti** per gestire una flotta di veicoli.  
I dati dei veicoli saranno letti da un **file di testo** e gestiti tramite:

- **Classi astratte**
- **Classi figlie**
- **Override di metodi**
- **Polimorfismo**
- **File I/O**

---

## 📌 REQUISITI OBBLIGATORI

### 1. STRUTTURA BASE (MODELLO A OGGETTI):
- Una **classe astratta** `Veicolo` con campi comuni:
  - `marca`, `modello`, `anno`
- Tre **classi figlie**:
  - `Auto` → aggiunge `numeroPorte`
  - `Moto` → aggiunge `cilindrata`
  - `Camion` → aggiunge `capacitaCarico`
- Ogni classe **overridea** un metodo `descrizione()` che restituisce informazioni dettagliate
- Un metodo aggiuntivo `tipo()` identifica la categoria del veicolo

---

### 2. FILE DI INPUT (`veicoli.txt`):
Il file contiene un elenco di veicoli nel formato:
```
Auto,Ford,Focus,2012,5
Moto,Yamaha,MT-07,2019,689
Camion,Mercedes,Actros,2020,12000
Auto,Tesla,Model 3,2021,4
```
---

### 3. FUNZIONALITÀ PRINCIPALI:
- Legge i dati dal file riga per riga
- Crea istanze delle classi `Auto`, `Moto` e `Camion` in modo polimorfico
- Aggiunge tutti i veicoli a una `ArrayList<Veicolo>`
- Stampa la descrizione di ciascun veicolo scorrendo la lista

---

## 🔁 STRUTTURA LOGICA DEL PROGRAMMA

### CLASSI:
- `Veicolo` (abstract)
- `Auto`, `Moto`, `Camion` (classi concrete)

### ATTRIBUTI COMUNI:
- `marca`, `modello`, `anno`

### ATTRIBUTI SPECIFICI:
- `Auto`: `numeroPorte`
- `Moto`: `cilindrata`
- `Camion`: `capacitaCarico`

### METODI PRINCIPALI:
- `descrizione()`  
  ↳ Restituisce una stringa con le info dettagliate del veicolo  
- `tipo()`  
  ↳ Restituisce il tipo di veicolo (Auto, Moto, Camion)

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se il file non esiste → mostra messaggio d’errore
- Se una riga è malformata → ignora la riga o avvisa
- Se il tipo di veicolo non è riconosciuto → ignora la riga

---

## ✨ BONUS (FACOLTATIVO)

- Ordinare i veicoli per `anno` o `marca` usando `Comparator`
- Scrivere l’output in un nuovo file `report.txt`
- Aggiungere filtri: ad esempio, stampare solo le `Moto`
- Aggiungere un metodo `costoRevisione()` nella classe `Veicolo`, con implementazioni diverse in ogni sottoclasse

---
