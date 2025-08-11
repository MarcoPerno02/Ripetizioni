# 🖥️ ESERCIZIO: Gestione Studenti con DataGridView, Ordinamento e Ricerca  
*(Struct, Vettore Statico e File in WinForms)*

## 📄 Descrizione  
Crea un’applicazione **WinForms** per gestire un elenco di studenti.  
I dati sono memorizzati in un **vettore di struct** e visualizzati in un **DataGridView** (sola lettura).  
Il programma deve permettere di:

- Caricare e salvare i dati da/verso file di testo  
- Aggiungere nuovi studenti  
- Ordinare per nome o voto  
- Cercare studenti per matricola o cognome  
- Leggere da file all'avvio del programma

---

## 📌 Requisiti UI

- **DataGridView** `dgvStudents`:  
  - `ReadOnly = true`  
  - `AllowUserToAddRows = false`  
  - `SelectionMode = FullRowSelect`  

- TextBox:  
  - `txtMatricola` (solo numeri)  
  - `txtNome`  
  - `txtCognome`  
  - `txtVoto` (decimale)  

- Bottoni:  
  - `Aggiungi` → Inserisce nuovo studente  
  - `Salva` → Scrive su file  
  - `Ordina per Nome`  
  - `Ordina per Voto`  
  - `Cerca`  

---

## 🗂 Struttura Dati

- `struct Student` con campi:
  - `int Matricola`
  - `string Nome`
  - `string Cognome`
  - `decimal Voto`

- Vettore fisso: `Student[] students = new Student[200]`  
- Contatore: `int studentCount = 0`

---

## 🔁 Funzioni Principali

- **LoadStudents** → Legge il file `students.txt` e popola il vettore  
- **SaveStudents** → Scrive i dati correnti su file  
- **RefreshDataGrid** → Aggiorna il DataGridView  
- **AddStudent** → Inserisce un nuovo record dopo validazione  
- **SortByName** → Ordinamento alfabetico (Bubble Sort)  
- **SortByGrade** → Ordinamento per voto decrescente (Selection Sort)  
- **SearchByMatricola** → Ricerca lineare per matricola  
- **SearchBySurname** → Ricerca lineare per cognome (case-insensitive)

---

## ⚠️ Casi Particolari

- File assente → griglia vuota + messaggio  
- Matricola duplicata → blocca inserimento  
- Raggiunto limite vettore → impedisce inserimento  
- Input non validi → messaggio di errore  

---

## 📂 Esempio `students.txt`

```
0,Mario,Rossi,8.5
1,Anna,Bianchi,9.0
2,Luigi,Verdi,6.5
```

---

## ✨ Bonus

- Ricerca con filtro in tempo reale  
- Ordinamento automatico dopo inserimento  
- Salvataggio automatico alla chiusura  
- Evidenziare il record trovato  
