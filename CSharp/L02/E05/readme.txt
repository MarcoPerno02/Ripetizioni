=========================
ANALISI VENDITE - WINFORMS
=========================

Descrizione:
------------
Questa applicazione WinForms in C# legge i dati di vendita da tre file di testo:
- negozio1.txt
- negozio2.txt
- negozio3.txt

Ogni file contiene i dati giornalieri di un negozio. I dati sono così formattati:

    <DATA> <FATTURATO> <NUMERO_VENDITE>

Esempio:
    2025-07-01 150 10
    2025-07-02 200 5
    2025-07-03 180 8

Funzionalità:
-------------
- L'interfaccia consente all'utente di selezionare il negozio da una ComboBox.
- Una volta selezionato, il programma legge il file corrispondente e calcola:
    - Il fatturato totale
    - Il numero totale di vendite
    - Il fatturato medio per vendita

Requisiti:
----------
- I file `negozio1.txt`, `negozio2.txt`, `negozio3.txt` devono trovarsi nella stessa cartella dell'eseguibile (bin\Debug o bin\Release)

Interfaccia Grafica:
--------------------
- Label: "Seleziona Negozio"
- ComboBox: con opzioni "Negozio1", "Negozio2", "Negozio3"
- TextBox (di sola lettura):
    - Fatturato Totale
    - Vendite Totali
    - Media per Vendita

Istruzioni:
-----------
1. Avvia l'applicazione
2. Seleziona un negozio dal menu a tendina
3. I risultati verranno mostrati nelle TextBox

Note:
-----
- Il calcolo medio è arrotondato a due cifre decimali.
- Se un file non è trovato, viene mostrato un messaggio d'errore.

