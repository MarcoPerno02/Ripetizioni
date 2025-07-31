==============================
RILEVAMENTO TRAFFICO - WINFORMS
==============================

Descrizione:
------------
L'applicazione legge da file:
- lunedi.txt
- martedi.txt
- mercoledi.txt

Ogni riga contiene:
    Ora NumeroVeicoli

Esempio:
    08:00 120
    09:00 180
    10:00 90

Funzionamento:
--------------
- Seleziona il giorno tramite ComboBox.
- Calcola e visualizza:
    - Totale veicoli rilevati
    - Ora con traffico massimo
    - Media veicoli per ora

Interfaccia:
------------
- Label: "Seleziona Giorno"
- ComboBox: "Lunedì", "Martedì", "Mercoledì"
- TextBox (sola lettura):
    • Totale Veicoli
    • Ora Picco Traffico
    • Media Veicoli

Requisiti:
----------
- File di testo presenti accanto all’eseguibile

Nota:
-----
- Gestione errori di apertura file.
- Media arrotondata a due decimali.
- In caso di più ore con traffico massimo, si può scegliere la prima.
