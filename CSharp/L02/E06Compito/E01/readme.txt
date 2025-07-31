==============================
STATISTICHE STUDENTI - WINFORMS
==============================

Descrizione:
------------
L'applicazione leggere dati da tre file:
- classeA.txt
- classeB.txt
- classeC.txt

Ogni riga contiene:
    Nome Cognome MediaVoti

Esempio:
    Mario Rossi 7.5
    Anna Verdi 8.2
    Luca Bianchi 6.9

Funzionamento:
--------------
- L'utente seleziona la classe tramite una ComboBox.
- Il programma legge il file corrispondente e calcola:
    - La media generale della classe
    - Il numero di studenti promossi (media ≥ 6)
    - Il numero di studenti con media ≥ 8

Interfaccia:
------------
- Label: "Seleziona Classe"
- ComboBox: opzioni "ClasseA", "ClasseB", "ClasseC"
- TextBox (sola lettura):
    • Media Classe
    • Studenti Promossi (≥ 6)
    • Studenti Eccellenti (≥ 8)

Requisiti:
----------
- .NET WinForms compatibile
- File `.txt` nella stessa cartella dell’eseguibile

Nota:
-----
- Gestire file mancanti con messaggi di errore.
- La media è arrotondata a due decimali.

