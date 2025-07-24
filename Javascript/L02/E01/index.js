// Array che contiene le 4 opzioni possibili di oggetti per il gioco
let opzioni = ['aereo', 'pizza', 'bici', 'cane'];

// Variabile che memorizza quale oggetto l'utente deve selezionare in questa partita
let opzioneScelta = "";

// Array bidimensionale che tiene traccia di quali immagini sono state cliccate dall'utente
// Struttura: tabellaImmaginiCliccate[riga][colonna] = true/false
let tabellaImmaginiCliccate = [];

// Funzione che viene eseguita automaticamente quando la pagina è completamente caricata
window.onload = function() {
    // Sceglie casualmente una delle 4 opzioni per questa partita
    let scelta = Math.floor(Math.random() * opzioni.length);  // Genera un numero casuale
                                                              // tra 0 e la lunghezza dell'array opzioni (0-3)
    
    // Trova l'elemento HTML con id "domanda" e imposta il testo della domanda
    let domanda = document.getElementById("domanda");
    domanda.textContent = "Selezione le immagini contenenti: " + opzioni[scelta];
    
    // Salva l'opzione scelta per poterla confrontare nella verifica
    opzioneScelta = opzioni[scelta];

    // Trova l'elemento tabella nell'HTML dove inserire le immagini
    let tabella = document.getElementById("tabella");
    // Crea una griglia 3x3 di immagini
    for (let i = 0; i < 3; i++) {
        // Crea una nuova riga per ogni iterazione (i rappresenta il numero di riga)
        let riga = document.createElement("tr");
        tabella.appendChild(riga);

        // Inizializza una nuova riga nell'array che traccia i click
        tabellaImmaginiCliccate.push([]);

        // Per ogni riga, crea 3 colonne
        for (let j = 0; j < 3; j++) {
            // Crea una nuova cella della tabella
            let cella = document.createElement("td");
            
            // Crea un elemento immagine
            let img = document.createElement("img");
            
            // Assegna un ID univoco all'immagine nel formato "img-riga-colonna"
            img.id = "img-" + i + "-" + j;
            
            // Assegna la funzione da eseguire quando l'immagine viene cliccata
            img.onclick = function() {
                immagineCliccata(img, i, j);
            }

            // Sceglie casualmente un oggetto per questa immagine (può essere diverso da quello richiesto)
            oggettoScelto = opzioni[Math.floor(Math.random() * opzioni.length)];
            
            // Sceglie casualmente una variante dell'oggetto (1, 2 o 3)
            let numero = Math.floor(Math.random() * 3) + 1; // Numero casuale tra 1 e 3
            
            // Imposta il percorso dell'immagine combinando oggetto e numero
            img.src = "./static/img/" + oggettoScelto + "-" + numero + ".png";

            // Aggiunge la cella alla riga e l'immagine alla cella
            riga.appendChild(cella);
            cella.appendChild(img);

            // Inizializza lo stato di questa immagine come "non cliccata" (false)
            tabellaImmaginiCliccate[i].push(false);
        }
    }
    
    // Stampa nella console l'array che traccia i click per debug
    console.log(tabellaImmaginiCliccate);

};

/**
 * Funzione chiamata quando l'utente clicca su una delle immagini
 * @param {HTMLImageElement} img - L'elemento immagine che è stato cliccato
 * @param {number} i - L'indice della riga dell'immagine (0-2)
 * @param {number} j - L'indice della colonna dell'immagine (0-2)
 */
function immagineCliccata(img, i, j) {
    // Inverte lo stato dell'immagine: se era cliccata diventa non cliccata e viceversa
    tabellaImmaginiCliccate[i][j] = !tabellaImmaginiCliccate[i][j]; // Salva il valore opposto al precedente
                                                                    // Se era true, diventa false e viceversa
    
    // Gestisce l'aspetto visivo dell'immagine in base al suo stato
    if(tabellaImmaginiCliccate[i][j]) {
        // Se l'immagine è ora selezionata, aggiunge la classe CSS per evidenziarla
        img.classList.add("imgCliccata");
    } else {
        // Se l'immagine è ora deselezionata, rimuove la classe CSS
        img.classList.remove("imgCliccata");
    }
}

/**
 * Funzione che verifica se l'utente ha selezionato correttamente le immagini
 * Controlla che tutte le immagini dell'oggetto richiesto siano selezionate
 * e che nessuna immagine di altri oggetti sia selezionata
 */
function verifica() {
    // Seleziona tutte le immagini presenti nella pagina
    let imgs = document.querySelectorAll("img");
    
    // Indice per scorrere le immagini
    let indiceImg = 0;
    
    // Variabile che indica se la selezione dell'utente è corretta
    let valido = true;

    // Continua il controllo finché non trova un errore o finisce le immagini
    while(valido == true && indiceImg < imgs.length) {
        let img = imgs[indiceImg];

        // Estrae la posizione dell'immagine dal suo ID
        // Esempio: se img.id = "img-0-1", allora row=0 e col=1
        let row = img.id.split("-")[1];  // Numero della riga
        let col = img.id.split("-")[2];  // Numero della colonna

        // Estrae il tipo di oggetto dall'URL dell'immagine
        // Esempio di processo:
        // 1. img.src = "file:///C:/Users/marco/.../cane-2.png"
        // 2. split("/").pop() prende l'ultimo elemento dopo "/" -> "cane-2.png"
        // 3. split("-")[0] prende la prima parte prima di "-" -> "cane"
        let oggettoInImg = img.src.split("/").pop().split("-")[0]; // Prende il nome dell'oggetto dall'URL dell'immagine

        // Verifica la correttezza della selezione con due controlli:
        // 1. Se l'immagine è selezionata ma NON contiene l'oggetto richiesto -> ERRORE
        // 2. Se l'immagine NON è selezionata ma contiene l'oggetto richiesto -> ERRORE
        if((tabellaImmaginiCliccate[row][col] == true && oggettoInImg != opzioneScelta) || 
           (tabellaImmaginiCliccate[row][col] == false && oggettoInImg == opzioneScelta)) {
            valido = false;  // Segna come non valido
        }
        
        // Passa all'immagine successiva
        indiceImg++;
    }

    // Mostra il risultato all'utente
    if(valido == true) {
        alert("Hai vinto!");  // Tutte le selezioni sono corrette
    } else {
        alert("Hai perso!");  // Almeno una selezione è sbagliata
    }
}