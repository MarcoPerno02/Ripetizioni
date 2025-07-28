ESERCIZIO: Gestione nota spesa

OBIETTIVO:
Creare un'applicazione in C# con interfaccia grafica (WinForms o WPF)
che permetta ad un utente di gestire una nota spesa.
L'applicazione contiene una textbox per inserire il nome del prodotto,
un campo per inserire la quantità, una checkbox per dire se è urgente
e un bottone per aggiungere il prodotto alla lista.

Una volta cliccato inserisci, i dettagli verrano salvati come riga
in una textbox di output in sola lettura.
La riga avrà questo formato:
"Nome prodotto - Quantità: X - Urgente: Sì/No"

REQUISITI RICHIESTI:
1. INTERFACCIA UTENTE:
   - Textbox per inserire il nome del prodotto
   - Textbox per inserire la quantità (solo numeri)
   - Checkbox "Urgente"
   - Bottone "Aggiungi Prodotto"
   - Textbox di output in sola lettura per visualizzare la lista dei prodotti

2. LOGICA DI INSERIMENTO:
    - Quando l'utente clicca "Aggiungi Prodotto":
      * Controlla che il nome del prodotto non sia vuoto
      * Controlla che la quantità sia un numero valido
      * Se tutto è corretto, aggiungi una riga alla textbox di output
      * Se il prodotto è urgente, mostra "Urgente: Sì", altrimenti "Urgente: No"
      * Se ci sono errori, mostra un messaggio di errore
