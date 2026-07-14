ESERCIZIO: DIVISIONE CONTO E CALCOLO MANCIA

Creare un sito web per gestire la divisione del conto di una cena tra amici, calcolando automaticamente la mancia in base al servizio e la quota che ogni persona deve pagare.

Il sito deve chiedere all'utente:
- Nome del tavolo / Gruppo (textbox, obbligatorio - es. "I laureandi")
- Numero di persone (input numerico, deve essere un numero intero maggiore di 0)
- Importo totale del conto in € (input numerico, deve essere maggiore di 0)
- Qualità del servizio per la mancia (select con opzioni: "Ottimo [+15%]", "Buono [+10%]", "Sufficiente [+5%]", "Pessimo [0%]")
- Metodo di pagamento preferito (radio buttons: "Contanti", "Carta di Credito")

Dopo aver validato tutti i campi, il programma deve:
1. Calcolare il valore della mancia (in base alla percentuale selezionata) e sommarlo al conto per ottenere il Totale Finale.
2. Calcolare la quota singola che ogni persona deve pagare (Totale Finale diviso il Numero di persone).
3. Determinare la fascia di spesa a persona (lo Stato): "Economico" (fino a 20€ a testa), "Medio" (da 20.01€ a 45€ a testa), "Costoso" (oltre 45€ a testa).
4. Mostrare un resoconto completo in una tabella con tutti i dati (Nome tavolo, Persone, Mancia totale, Totale complessivo, Quota a testa e Fascia di spesa).
5. Applicare uno stile diverso alla riga della tabella in base alla fascia di spesa (colore verde per "Economico", giallo/arancione per "Medio", rosso per "Costoso").
6. Mostrare un messaggio speciale di avviso se il metodo di pagamento è "Carta di Credito" MA la quota a persona è inferiore a 12€ (es. "Attenzione: Verificare se il locale accetta pagamenti con carta per cifre così piccole!").

Validazioni richieste:
- Tutti i campi obbligatori devono essere compilati.
- Il numero di persone deve essere maggiore di 0.
- Il conto totale deve essere maggiore di 0.
- Il metodo di pagamento deve essere selezionato.