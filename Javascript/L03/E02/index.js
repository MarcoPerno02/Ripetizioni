// Inizializza un array vuoto per memorizzare gli articoli della lista della spesa
let listaSpesa = [];

// Seleziona il campo di input dove l’utente inserisce il nome dell’articolo
const input = document.getElementById('articolo');

// Seleziona il contenitore (ul o div) dove verranno mostrati gli articoli
const lista = document.getElementById('lista');

// Funzione chiamata quando l’utente vuole aggiungere un nuovo articolo
function aggiungiArticolo() {
    // Prende il valore dell’input, rimuove eventuali spazi iniziali/finali
    const articolo = input.value.trim();

    // Se l’input è vuoto, mostra un messaggio di errore e interrompe l’esecuzione
    if (articolo === '') {
        mostraErrore('Inserisci un articolo valido.');
        return;
    }

    // Aggiunge l’articolo all’array principale
    listaSpesa.push(articolo);

    // Pulisce il campo input
    input.value = '';

    // Aggiorna la visualizzazione della lista
    aggiornaLista();
}

// Funzione che mostra un messaggio di errore temporaneo all’utente
function mostraErrore(messaggio) {
    // Seleziona l’elemento che visualizza gli errori (es. un div con classe "errore")
    const errore = document.querySelector('.errore');

    // Inserisce il messaggio di errore nel div
    errore.textContent = messaggio;

    // Rende visibile il div
    errore.style.display = 'block';

    // Nasconde il messaggio dopo 3 secondi
    setTimeout(() => {
        errore.style.display = 'none';
    }, 3000);
}

// Funzione che aggiorna dinamicamente la lista visualizzata sullo schermo
function aggiornaLista() {
    // Svuota il contenuto attuale della lista (per ricostruirla)
    lista.innerHTML = '';

    // Per ogni elemento dell’array, crea un <li> e un pulsante "Rimuovi"
    listaSpesa.forEach((articolo, index) => {
        // Crea un nuovo elemento <li>
        const li = document.createElement('li');
        li.textContent = articolo;

        // Crea il pulsante "Rimuovi"
        const btnRimuovi = document.createElement('button');
        btnRimuovi.textContent = 'Rimuovi';

        // Aggiunge un attributo data-index per sapere quale elemento rimuovere
        btnRimuovi.setAttribute('data-index', index);

        // Aggiunge l’evento click per rimuovere l’articolo corrispondente
        btnRimuovi.addEventListener('click', () => rimuoviArticolo(index));

        // Inserisce il pulsante dentro il <li>
        li.appendChild(btnRimuovi);

        // Inserisce il <li> completo dentro la lista
        lista.appendChild(li);
    });
}

// Funzione per rimuovere un articolo dato il suo indice
function rimuoviArticolo(index) {
    // Se l’indice non è valido, mostra un messaggio di errore
    if (index < 0 || index >= listaSpesa.length) {
        mostraErrore('Articolo non trovato.');
        return;
    }

    // Rimuove l’articolo dall’array con splice
    listaSpesa.splice(index, 1);

    // Aggiorna la lista visualizzata
    aggiornaLista();
}
