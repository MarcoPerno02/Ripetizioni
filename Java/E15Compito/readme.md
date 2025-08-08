# 🏫 ESERCIZIO: Gestore Dipendenti e Stipendi da File

## DESCRIZIONE
Crea un **programma Java a oggetti** per gestire una lista di dipendenti e i loro stipendi.  
I dati saranno letti da **due file di testo** e gestiti tramite:

- **Classi astratte**
- **Classi figlie**
- **Override di metodi**
- **Polimorfismo**
- **File I/O**

---

## 📌 REQUISITI OBBLIGATORI

### 1. STRUTTURA BASE (MODELLO A OGGETTI):
- Una **classe astratta** `Dipendente` con campi comuni:
    - `nome`, `cognome`, `annoAssunzione`
- Due **classi figlie**:
    - `DipendenteTempoIndeterminato` → aggiunge `livello`
    - `DipendenteTempoDeterminato` → aggiunge `scadenzaContratto`
- Ogni classe **overridea** un metodo `scheda()` che restituisce informazioni dettagliate
- Un metodo aggiuntivo `tipo()` identifica la categoria del dipendente

---

### 2. FILE DI INPUT

#### `dipendenti.txt`:
```
Indeterminato,Marco,Rossi,2015,Quadro
Determinato,Anna,Bianchi,2022,2024-12-31
Indeterminato,Luca,Verdi,2010,Impiegato
Determinato,Giulia,Neri,2023,2025-06-30
```

#### `stipendi.txt`:
```
Marco,Rossi,Gennaio,1800
Anna,Bianchi,Gennaio,1400
Luca,Verdi,Gennaio,2000
Giulia,Neri,Gennaio,1300
```

---

### 3. FUNZIONALITÀ PRINCIPALI:
- Legge i dati dei dipendenti dal file `dipendenti.txt`
- Legge gli stipendi dal file `stipendi.txt` e li associa ai dipendenti
- Crea istanze delle classi `DipendenteTempoIndeterminato` e `DipendenteTempoDeterminato` in modo polimorfico
- Aggiunge tutti i dipendenti a una `ArrayList<Dipendente>`
- Stampa la scheda di ciascun dipendente con gli stipendi associati

---

## 🔁 STRUTTURA LOGICA DEL PROGRAMMA

### CLASSI:
- `Dipendente` (abstract)
- `DipendenteTempoIndeterminato`, `DipendenteTempoDeterminato` (classi concrete)
- `Stipendio` (classe semplice con mese e importo)

### ATTRIBUTI COMUNI:
- `nome`, `cognome`, `annoAssunzione`

### ATTRIBUTI SPECIFICI:
- `DipendenteTempoIndeterminato`: `livello`
- `DipendenteTempoDeterminato`: `scadenzaContratto`

### METODI PRINCIPALI:
- `scheda()`  
    ↳ Restituisce una stringa con le info dettagliate del dipendente e i suoi stipendi  
- `tipo()`  
    ↳ Restituisce il tipo di dipendente (Indeterminato, Determinato)

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se un file non esiste → mostra messaggio d’errore
- Se una riga è malformata → ignora la riga o avvisa
- Se il tipo di dipendente non è riconosciuto → ignora la riga
- Se uno stipendio non trova il dipendente corrispondente → ignora la riga

---

## ✨ BONUS (FACOLTATIVO)

- Ordinare i dipendenti per `cognome` o `annoAssunzione` usando `Comparator`
- Scrivere l’output in un nuovo file `report_dipendenti.txt`
- Aggiungere filtri: ad esempio, stampare solo i dipendenti a tempo indeterminato
- Aggiungere un metodo `mediaStipendi()` nella classe `Dipendente`, con implementazioni diverse in ogni sottoclasse

---