# 📈 ESERCIZIO: Simulatore di Trading Azionario (WinForms) con Struct

## DESCRIZIONE
Crea una **app WinForms** per simulare operazioni di **trading azionario** con queste funzionalità:
- Visualizzazione delle operazioni in una **DataGridView di sola lettura**.
- Inserimento di nuove operazioni mediante **TextBox**.
- Salvataggio e caricamento delle operazioni da/per un **file di testo**.

---

## UI (WinForms)

- Un controllo `DataGridView` (`dgvTrades`), impostato su `ReadOnly = true`
- Cinque `TextBox` per l’inserimento di una nuova operazione:
    - `txtTicker` (es. AAPL, TSLA)
    - `txtTipo` (`BUY` o `SELL`)
    - `txtQuantità` (numero intero positivo)
    - `txtPrezzo` (decimale > 0)
    - `txtData` (formato: `gg/mm/aaaa`)
- Tre pulsanti:
    - **Carica Operazioni** – carica dati da file
    - **Aggiungi Operazione** – aggiunge una nuova operazione dal form
    - **Salva Operazioni** – salva i dati su file

---

## STRUTTURA DATI

```csharp
struct Trade
{
    public string Ticker;
    public string Tipo;      // "BUY" o "SELL"
    public int Quantità;
    public decimal Prezzo;
    public DateTime Data;
}
```

```csharp
Trade[] trades = new Trade[100];
int tradeCount = 0;
```

---

## FUNZIONI PRINCIPALI

- **LoadTrades()**  
    Legge da file (`trades.txt`) e popola `trades[]`; aggiorna `tradeCount`  
    Aggiorna `dgvTrades`

- **SaveTrades()**  
    Scrive le operazioni da `trades[]` nel file di testo fino a `tradeCount`

- **RefreshDataGrid()**  
    Aggiorna la DataGridView con i dati correnti di `trades[]`

- **AddTrade(...)**  
    Legge i dati dalle TextBox, li valida (es. quantità > 0, tipo = "BUY"/"SELL", data valida), aggiunge la struct al vettore, incrementa `tradeCount`, e aggiorna la griglia

---

## VALIDAZIONE INPUT

- Ticker non può essere vuoto
- Tipo deve essere "BUY" o "SELL" (maiuscolo)
- Quantità > 0
- Prezzo > 0
- Data deve essere valida (es. tramite `DateTime.TryParseExact()`)

---

## FORMATO FILE (`trades.txt`)

Ogni riga rappresenta una Trade, con campi separati da virgole:

```
AAPL,BUY,10,180.50,05/08/2025
TSLA,SELL,5,720.00,06/08/2025
```

---

## BONUS (FACOLTATIVO)

- Aggiungi colonna calcolata **Totale = Quantità × Prezzo**
- Filtri per Ticker o intervallo di date
- Uso di `OpenFileDialog` / `SaveFileDialog`
- Visualizzazione di un grafico (ad esempio, con il controllo Chart) per visualizzare trend o volumi