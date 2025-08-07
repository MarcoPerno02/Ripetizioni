# 🖥️ ESERCIZIO: Gestione Ordini con DataGridView, Vettori e File in WinForms (Con Struct)

## DESCRIZIONE  
Crea una **applicazione WinForms** per gestire un elenco di ordini usando un **vettore di struct** in memoria.  
L'app permette di **caricare**, **visualizzare**, **modificare** e **salvare** gli ordini tramite un DataGridView e file di testo.

---

## 📌 REQUISITI OBBLIGATORI

### 1. STRUTTURA UI (WinForms):
- Un controllo `DataGridView` (`dgvOrders`) per mostrare e modificare gli ordini
- Tre bottoni:  
  - `Carica` → carica gli ordini da file  
  - `Salva` → salva gli ordini su file  
  - `Aggiungi Ordine` → aggiunge un nuovo ordine vuoto al vettore e aggiorna la griglia

---

## 2. FUNZIONALITÀ PRINCIPALI:

- Definisci una `struct Order` con proprietà:  
  - `int OrderID`  
  - `string CustomerName`  
  - `string Product`  
  - `int Quantity`  
  - `decimal Price`

- Usa un vettore fisso `Order[] orders = new Order[100]`  
- Mantieni un contatore `orderCount` che indica quanti ordini sono presenti

- Al click su **Carica**:
  - Legge dal file `orders.txt`  
  - Riempe `orders[]` aggiornando `orderCount`  
  - Popola il DataGridView con i dati

- Il DataGridView consente la modifica diretta dei campi

- Al click su **Salva**:
  - Scrive gli ordini contenuti nell'array su file, fino a `orderCount`

- Al click su **Aggiungi Ordine**:
  - Se c’è spazio, aggiunge un nuovo ordine con valori di default  
  - Aggiorna DataGridView

---

## 🔁 STRUTTURA LOGICA DEL CODICE

### VARIABILI PRINCIPALI  
- `Order[] orders = new Order[100]`  
- `int orderCount = 0`

### FUNZIONI PRINCIPALI  
- `LoadOrders()`  
  ↳ Legge file e aggiorna `orders` e `orderCount`  
- `SaveOrders()`  
  ↳ Scrive `orders` su file  
- `RefreshDataGrid()`  
  ↳ Popola il DataGridView dai dati del vettore  
- `AddOrder()`  
  ↳ Inserisce un ordine di default nell’array, incrementa `orderCount` e aggiorna griglia

---

## ⚠️ GESTIONE CASI PARTICOLARI

- File inesistente o vuoto → messaggio e DataGridView vuoto  
- Controlla che `orderCount < orders.Length` prima di aggiungere  
- Validazione base per quantità e prezzo (positivi) su modifica  
- Gestione eccezioni in lettura/scrittura file

---

## 💡 ESEMPIO FILE `orders.txt`

```
1,Mario Rossi,Mouse,2,19.99
2,Anna Bianchi,Tastiera,1,49.50
3,Luigi Verdi,Monitor,1,199.99
```

---

## ✨ BONUS (FACOLTATIVO)

- Ordinamento per `OrderID` o altri campi  
- Filtro per cliente con textbox  
- Uso di `OpenFileDialog` e `SaveFileDialog` per scegliere file  
- Colonna calcolata "Totale" (Quantity * Price) in DataGridView  
- Eliminazione ordini con bottone dedicato e gestione vettore
