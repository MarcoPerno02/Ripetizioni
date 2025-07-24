ESERCIZIO: GESTIONE BIBLIOTECA DIGITALE

Creare un sito web per la gestione di una biblioteca digitale personale.
Il programma dovrà permettere all'utente di registrare i libri letti e tenere traccia del proprio progresso di lettura.

Il sito deve chiedere all'utente:
    - Titolo del libro (textbox, obbligatorio)
    - Autore del libro (textbox, obbligatorio)
    - Genere del libro (select con opzioni: "Romanzo", "Giallo", "Fantasy", "Saggistica", "Biografia")
    - Numero di pagine totali (input numerico, deve essere maggiore di 0)
    - Numero di pagine lette (input numerico, deve essere compreso tra 0 e il numero di pagine totali)
    - Valutazione da 1 a 5 stelle (radio buttons o select)

Dopo aver validato tutti i campi, il programma deve:
1. Calcolare la percentuale di completamento della lettura
2. Determinare lo stato del libro: "Da iniziare" (0%), "In lettura" (1-99%), "Completato" (100%)
3. Mostrare un resoconto completo all'interno di una tabella con tutti i dati inseriti, la percentuale di completamento e lo stato
4. Applicare uno stile diverso in base allo stato (colore verde per completato, giallo per in lettura, rosso per da iniziare)
5. Dare un messaggio di congratulazioni se il libro è completato e ha ricevuto 4 o 5 stelle

Validazioni richieste:
- Tutti i campi obbligatori devono essere compilati
- Il numero di pagine totali deve essere maggiore di 0
- Il numero di pagine lette non può essere maggiore del totale
- La valutazione deve essere selezionata