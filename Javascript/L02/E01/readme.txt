ESERCIZIO: Captcha con Selezione di Immagini

DESCRIZIONE:
Devi creare una pagina web che simuli un sistema di captcha come quelli che si trovano sui siti internet. 
L'utente dovrà identificare e selezionare tutte le immagini che contengono un determinato oggetto.

REQUISITI OBBLIGATORI:

1. STRUTTURA BASE:
   - Crea una griglia 3x3 (9 immagini totali) utilizzando una tabella HTML
   - Sopra la griglia deve apparire una domanda del tipo: "Seleziona tutte le immagini contenenti: [oggetto]"
   - Aggiungi un pulsante "Verifica" sotto la griglia

2. FUNZIONALITÀ JAVASCRIPT:
   - Al caricamento della pagina, scegli casualmente quale oggetto l'utente deve trovare
   - Popola la griglia con immagini casuali (alcune conterranno l'oggetto richiesto, altre no)
   - Quando l'utente clicca su un'immagine, essa deve evidenziarsi visivamente
   - L'utente può selezionare/deselezionare più immagini
   - Quando si preme "Verifica", controlla se la selezione è corretta

3. LOGICA DI VALIDAZIONE:
   - La selezione è corretta SOLO SE:
     * Tutte le immagini contenenti l'oggetto richiesto sono selezionate
     * Nessuna immagine di altri oggetti è selezionata
   - Mostra un messaggio di successo ("Hai vinto!") o fallimento ("Hai perso!")

4. VARIABILITÀ:
   - Ogni volta che si ricarica la pagina, l'oggetto da cercare deve cambiare
   - Le immagini nella griglia devono essere disposte casualmente

SPECIFICHE TECNICHE:

Oggetti disponibili: aereo, pizza, bici, cane
- Per ogni oggetto devi avere almeno 3 varianti di immagine
- Nomina i file: [oggetto]-1.png, [oggetto]-2.png, [oggetto]-3.png
- Organizza le immagini nella cartella static/img/

Esempio di struttura file:
static/img/aereo-1.png
static/img/aereo-2.png
static/img/aereo-3.png
static/img/pizza-1.png
... ecc

SUGGERIMENTI IMPLEMENTAZIONE:

1. Usa un array per memorizzare i tipi di oggetti disponibili
2. Crea un array bidimensionale per tracciare quali immagini sono state cliccate
3. Assegna ID univoci alle immagini (es: "img-0-1" per riga 0, colonna 1)
4. Usa Math.random() per la selezione casuale
5. Per evidenziare le immagini selezionate, aggiungi/rimuovi una classe CSS

ESEMPIO DI FUNZIONAMENTO:
- Pagina si carica → Domanda: "Seleziona tutte le immagini contenenti: pizza"
- Griglia mostra 9 immagini casuali (3 pizze, 6 altri oggetti)
- Utente clicca sulle 3 pizze → si evidenziano
- Utente preme "Verifica" → "Hai vinto!"
- Se l'utente avesse cliccato anche su un aereo → "Hai perso!"

CRITERI DI VALUTAZIONE:
✅ Griglia 3x3 generata dinamicamente
✅ Domanda che cambia ad ogni ricaricamento  
✅ Selezione multipla funzionante
✅ Evidenziazione visiva delle selezioni
✅ Logica di validazione corretta
✅ Codice pulito e commentato
✅ Sistema di immagini organizzato