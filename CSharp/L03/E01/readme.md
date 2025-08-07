# 🖥️ ESERCIZIO: Gestione Ordini con DataGridView (Non modificabile), Vettore di Struct e File in WinForms

## DESCRIZIONE  
Crea una **applicazione WinForms** per gestire ordini usando un **vettore di struct** in memoria.  
Il `DataGridView` deve essere **solo lettura** (non modificabile manualmente dall'utente).  
Per aggiungere un ordine, l'utente inserisce i dati in delle `TextBox` dedicate e poi clicca un bottone per aggiungere il record.

L'app permette di **caricare**, **visualizzare**, **aggiungere** (da TextBox) e **salvare** gli ordini tramite file di testo.

---

## 📌 REQUISITI OBBLIGATORI

### 1. STRUTTURA UI (WinForms):
- Un controllo `DataGridView` (`dgvOrders`) **impostato a ReadOnly = true**  
- Quattro `TextBox` per inserire i dati del nuovo ordine:  
  - `txtCustomerName`  
  - `txtProduct`  
  - `txtQuantity`  
  - `txtPrice`  
- Quattro etichette per identificare ogni textbox  
- Tre bottoni:  
  - `Carica` → carica ordini da file  
  - `Aggiungi Ordine` → aggiunge nuovo ordine con dati presi dalle TextBox  
  - `Salva` → salva ordini su file

---

## 2. FUNZIONALITÀ PRINCIPALI:

- Definisci una `struct Order` con proprietà:  
  - `int OrderID`  
  - `string CustomerName`  
  - `string Product`  
  - `int Quantity`  
  - `decimal Price`

- Mantieni un vettore fisso `Order[] orders = new Order[100]` e un contatore `orderCount`

- Al click su **Carica**:  
  - Legge il file `orders.txt`  
  - Popola il vettore `orders` e aggiorna `orderCount`  
  - Aggiorna il DataGridView (in sola lettura)

- L'utente inserisce i dati del nuovo ordine nelle TextBox e clicca **Aggiungi Ordine**:  
  - Controlla validità dati (es. quantità e prezzo positivi)  
  - Aggiunge l’ordine nel vettore (assegna un `OrderID` autoincrementale)  
  - Aggiorna il DataGridView con il nuovo ordine

- Al click su **Salva**:  
  - Salva gli ordini correnti in `orders` su file di testo

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI  
- `Order[] orders = new Order[100]`  
- `int orderCount = 0`  
- `int nextOrderID = 1` (per autoincrementare gli ID)

### FUNZIONI  
- `LoadOrders()`  
- `SaveOrders()`  
- `RefreshDataGrid()`  
- `AddOrder(string customerName, string product, int quantity, decimal price)`  
  ↳ Validazione + inserimento + aggiornamento griglia

---

## ⚠️ GESTIONE CASI PARTICOLARI

- File mancante o vuoto → mostra messaggio, DataGridView vuoto  
- Verifica che `orderCount < orders.Length` prima di aggiungere  
- Validazione semplice per input da TextBox (numeri validi e positivi)  
- Gestisci eccezioni di lettura/scrittura

---

## 💡 ESEMPIO FILE `orders.txt`


```
1,Mario Rossi,Mouse,2,19.99
2,Anna Bianchi,Tastiera,1,49.50
3,Luigi Verdi,Monitor,1,199.99
```

---

## ✨ BONUS (FACOLTATIVO)

- Disabilita il bottone Aggiungi se input non valido  
- Usa `OpenFileDialog` e `SaveFileDialog` per scegliere file  
- Aggiungi filtro per cliente  
- Colonna "Totale" calcolata (Quantity * Price) nel DataGridView

