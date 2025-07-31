==============================
REGISTRO PRESENZE - WINFORMS
==============================

Descrizione:
------------
L'applicazione legge i dati dai file:
- gennaio.txt
- febbraio.txt
- marzo.txt

Ogni riga contiene:
    Data NumeroPresenze

Esempio:
    2025-01-01 24
    2025-01-02 22
    2025-01-03 20

Funzionamento:
--------------
- Seleziona il mese tramite ComboBox.
- Calcola e visualizza:
    - Presenze totali nel mese
    - Giorno con meno presenze
    - Media giornaliera delle presenze

Interfaccia:
------------
- Label: "Seleziona Mese"
- ComboBox: "Gennaio", "Febbraio", "Marzo"
- TextBox (sola lettura):
    • Presenze Totali
    • Giorno Minimo Presenze
    • Media Presenze

Requisiti:
----------
- File `.txt` nella cartella dell’eseguibile

Nota:
-----
- Gestione errori per file non trovato.
- Media arrotondata con due decimali.
