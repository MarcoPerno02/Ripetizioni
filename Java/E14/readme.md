# 🏫 ESERCIZIO: Gestore Studenti e Voti da File

## DESCRIZIONE
Crea un **programma Java a oggetti** per gestire una classe di studenti e i loro voti.  
I dati saranno letti da **due file di testo** e gestiti tramite:

- **Classi astratte**
- **Classi figlie**
- **Override di metodi**
- **Polimorfismo**
- **File I/O**

---

## 📌 REQUISITI OBBLIGATORI

### 1. STRUTTURA BASE (MODELLO A OGGETTI):
- Una **classe astratta** `Studente` con campi comuni:
    - `nome`, `cognome`, `annoNascita`
- Due **classi figlie**:
    - `StudenteSuperiore` → aggiunge `indirizzo`
    - `StudenteUniversitario` → aggiunge `corsoDiLaurea`
- Ogni classe **overridea** un metodo `scheda()` che restituisce informazioni dettagliate
- Un metodo aggiuntivo `tipo()` identifica la categoria dello studente

---

### 2. FILE DI INPUT

#### `studenti.txt`:
```
Superiore,Marco,Rossi,2005,Scientifico
Universitario,Anna,Bianchi,2002,Informatica
Superiore,Luca,Verdi,2004,Classico
Universitario,Giulia,Neri,2001,Economia
```

#### `voti.txt`:
```
Marco,Rossi,Matematica,8
Anna,Bianchi,Programmazione,9
Luca,Verdi,Latino,7
Giulia,Neri,Microeconomia,8
```

---

### 3. FUNZIONALITÀ PRINCIPALI:
- Legge i dati degli studenti dal file `studenti.txt`
- Legge i voti dal file `voti.txt` e li associa agli studenti
- Crea istanze delle classi `StudenteSuperiore` e `StudenteUniversitario` in modo polimorfico
- Aggiunge tutti gli studenti a una `ArrayList<Studente>`
- Stampa la scheda di ciascuno studente con i voti associati

---

## 🔁 STRUTTURA LOGICA DEL PROGRAMMA

### CLASSI:
- `Studente` (abstract)
- `StudenteSuperiore`, `StudenteUniversitario` (classi concrete)
- `Voto` (classe semplice con materia e voto)

### ATTRIBUTI COMUNI:
- `nome`, `cognome`, `annoNascita`

### ATTRIBUTI SPECIFICI:
- `StudenteSuperiore`: `indirizzo`
- `StudenteUniversitario`: `corsoDiLaurea`

### METODI PRINCIPALI:
- `scheda()`  
    ↳ Restituisce una stringa con le info dettagliate dello studente e i suoi voti  
- `tipo()`  
    ↳ Restituisce il tipo di studente (Superiore, Universitario)

---

## ⚠️ GESTIONE CASI PARTICOLARI

- Se un file non esiste → mostra messaggio d’errore
- Se una riga è malformata → ignora la riga o avvisa
- Se il tipo di studente non è riconosciuto → ignora la riga
- Se un voto non trova lo studente corrispondente → ignora la riga

---

## ✨ BONUS (FACOLTATIVO)

- Ordinare gli studenti per `cognome` o `annoNascita` usando `Comparator`
- Scrivere l’output in un nuovo file `report_studenti.txt`
- Aggiungere filtri: ad esempio, stampare solo gli universitari
- Aggiungere un metodo `mediaVoti()` nella classe `Studente`, con implementazioni diverse in ogni sottoclasse

---