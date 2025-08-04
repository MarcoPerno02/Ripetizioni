# 🧾 ESERCIZIO: Gestione Lista Spesa

## DESCRIZIONE  
Crea una pagina web che simuli una semplice **lista della spesa**.  
L’utente può **aggiungere articoli**, **visualizzarli** dinamicamente, e **rimuoverli**.  
La gestione dei dati avviene tramite un **array di stringhe (`listaSpesa`)**, **senza l’uso di dizionari o oggetti**.

---

## REQUISITI OBBLIGATORI

### 1. STRUTTURA BASE (HTML):
- Un campo `input` per inserire il nome dell’articolo
- Un pulsante **"Aggiungi"** per salvare l’articolo
- Una lista visuale (`<ul>` o `<div>`) dove verranno mostrati tutti gli articoli
- Ogni articolo della lista deve contenere:
  * Il nome
  * Un pulsante **"Rimuovi"** accanto

---

### 2. FUNZIONALITÀ JAVASCRIPT:
- Al click su **"Aggiungi"**:
  * Il valore del campo input viene letto e **ripulito** (`trim()`)
  * Se vuoto → mostra un messaggio di errore temporaneo
  * Altrimenti, viene **inserito in un array `listaSpesa`**
  * L’interfaccia viene **rigenerata** per mostrare la lista aggiornata
  * L’input viene **svuotato**

- Cliccando su **"Rimuovi"** accanto a un articolo:
  * Si recupera l’indice associato
  * L’articolo viene **rimosso dall’array** con `splice()`
  * La lista visiva viene **rigenerata** per riflettere il cambiamento

---

## LOGICA DI GESTIONE (step-by-step)

1. **Dichiarazione variabili globali**:
   - `listaSpesa` → array vuoto per contenere solo stringhe
   - `input` e `lista` → selettori DOM

2. **Aggiunta articolo (`aggiungiArticolo`)**:
   - Leggi `input.value` → rimuovi spazi → verifica se è valido
   - Se non valido → chiama `mostraErrore(messaggio)`
   - Se valido → inserisci con `push()`, svuota input e chiama `aggiornaLista()`

3. **Aggiornamento dinamico lista (`aggiornaLista`)**:
   - Svuota il contenuto corrente del contenitore (`innerHTML = ''`)
   - Per ogni articolo in `listaSpesa`, crea dinamicamente:
     - `<li>` con il testo dell’articolo
     - un `<button>` con `data-index` per identificare la posizione
     - un `addEventListener` per rimuoverlo

4. **Rimozione articolo (`rimuoviArticolo(index)`)**:
   - Verifica che l’indice sia valido
   - Rimuovi con `splice(index, 1)`
   - Aggiorna nuovamente la lista

5. **Gestione errori (`mostraErrore`)**:
   - Visualizza un messaggio per 3 secondi con `setTimeout()`
   - Utilizza un `<div class="errore">` nascosto da mostrare quando serve

---

## SPECIFICHE TECNICHE

- `push()` per aggiungere articoli
- `splice(index, 1)` per rimuoverli
- `forEach()` per rigenerare dinamicamente gli elementi della lista
- `setAttribute('data-index', index)` per collegare i pulsanti "Rimuovi" all’elemento giusto
- `innerHTML` per svuotare e ricostruire il contenuto visivo

---

## SUGGERIMENTI IMPLEMENTAZIONE

1. Usa `input.value.trim()` per evitare spazi vuoti
2. Usa `textContent` per aggiornare i testi del DOM
3. Utilizza `addEventListener("click", ...)` per gli eventi
4. Visualizza gli errori in un div `.errore` con visibilità a tempo
5. Crea elementi dinamici (`createElement`) per ogni articolo

---

## ESEMPIO DI FUNZIONAMENTO

[ Inserisci articolo: ________  (Aggiungi) ]

Lista spesa:  
– **latte**        [ Rimuovi ]  
– **pane**         [ Rimuovi ]  
– **uova**         [ Rimuovi ]

- Se l’utente inserisce `pasta` e preme **Aggiungi** → compare in fondo  
- Se clicca su **Rimuovi** accanto a `latte` → `latte` viene eliminato dalla lista e dall’array

---

## CRITERI DI VALUTAZIONE

✅ Utilizzo di array semplici (`string[]`)  
✅ Aggiunta dinamica con `push()`  
✅ Rimozione dinamica con `splice()`  
✅ Validazione input attiva  
✅ Lista aggiornata ogni volta  
✅ Interfaccia chiara e funzionante  
✅ Codice ben organizzato e commentato

---

## BONUS OPZIONALE

- ✅ Contatore tipo: `"Hai N articoli nella lista"`  
- ✅ Ordinamento alfabetico della lista ad ogni inserimento  
- ✅ Invio dell’articolo con `Enter`  
- ✅ Salvataggio automatico in `localStorage` per conservare i dati
