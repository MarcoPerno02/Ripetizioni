const ROWS = 3;
const COLS = 3;
let MAX_MOVES = ROWS * COLS; // Numero massimo di mosse che possono essere fatte prima che il gioco finisca in pareggio
let moves;

window.onload = function() {
    moves = 0;
    // Inizializza la griglia del tris
    const table = document.getElementById("trisTable");
    for (let i = 0; i < ROWS; i++) {
        // Versione non ottima:
        let row = document.createElement("tr");
        table.appendChild(row);
        // Versione ottima:
        // const row = table.insertRow();
        for (let j = 0; j < COLS; j++) {
            let cell = row.insertCell();
            cell.onclick = function() {
                // Quando la cella viene cliccata, viene eseguita questa funzione
                // e viene passato il riferimento alla cella cliccata e le coordinate i, j
                // che rappresentano la posizione della cella nella griglia
                cellaCliccata(cell, i, j);
            };
            cell.appendChild(document.createElement("img"))
        }
    }
}


function cellaCliccata(cell, i, j) {
    // cell.style.backgroundColor = "lightblue";
    if (cell.firstChild.src.includes("X.png") || cell.firstChild.src.includes("O.png")) {
        // Se la cella già contiene un'immagine X o O, non fare nulla
        return;
    }
    cell.firstChild.src = "static/X.png"; // Imposta l'immagine X nella cella cliccata alla sua immagine che contiene
    moves++; // Incrementa il numero di mosse

    if(controllaVincitore("X") == true) {
        disabilitaTutteLeCelle(); // Disabilita tutte le celle se l'utente ha vinto
        return;
    }

    // Ora dobbiamo far giocare il computer
    while (moves < MAX_MOVES) {
        // Genera una posizione casuale per il computer
        let randomRow = Math.floor(Math.random() * ROWS);
        let randomCol = Math.floor(Math.random() * COLS);
        let randomCell = document.getElementById("trisTable").rows[randomRow].cells[randomCol];

        // Se la cella è vuota, il computer può giocare
        if (!randomCell.firstChild.src.includes("X.png") && !randomCell.firstChild.src.includes("O.png")) {
            randomCell.firstChild.src = "static/O.png"; // Imposta l'immagine O nella cella scelta dal computer
            moves++; // Incrementa il numero di mosse
            break; // Esci dal ciclo dopo che il computer ha fatto la sua mossa
        }
    }

    if (moves >= MAX_MOVES) {
        // Se il numero di mosse raggiunge il massimo, il gioco finisce in pareggio
        alert("Pareggio!");
        disabilitaTutteLeCelle(); // Disabilita tutte le celle
        return;
    }

    if(controllaVincitore("O") == true) {
        disabilitaTutteLeCelle();
        return
    }

}

function controllaVincitore (simbolo) {
    let table = document.getElementById("trisTable");
    for (let i = 0; i < ROWS; i++) {
        // Controlla righe
        if (
            table.rows[i].cells[0].firstChild.src.includes(simbolo + ".png") &&
            table.rows[i].cells[1].firstChild.src.includes(simbolo + ".png") &&
            table.rows[i].cells[2].firstChild.src.includes(simbolo + ".png")
        ) {
            if(simbolo == "X")
                alert("Hai vinto!");
            else
                alert("Il computer ha vinto!");
            return true; // Esci dalla funzione se un vincitore è stato trovato
        }
    }
    for (let j = 0; j < COLS; j++) {
        // Controlla colonne
        if (
            table.rows[0].cells[j].firstChild.src.includes(simbolo + ".png") &&
            table.rows[1].cells[j].firstChild.src.includes(simbolo + ".png") &&
            table.rows[2].cells[j].firstChild.src.includes(simbolo + ".png")
        ) {
            if(simbolo == "X")
                alert("Hai vinto!");
            else
                alert("Il computer ha vinto!");
            return true; // Esci dalla funzione se un vincitore è stato trovato
        }
    }
    // Controlla diagonale principale
    if (
        table.rows[0].cells[0].firstChild.src.includes(simbolo + ".png") &&
        table.rows[1].cells[1].firstChild.src.includes(simbolo + ".png") &&
        table.rows[2].cells[2].firstChild.src.includes(simbolo + ".png")
    ) {
        if(simbolo == "X")
            alert("Hai vinto!");
        else
            alert("Il computer ha vinto!");
        return true; // Esci dalla funzione se un vincitore è stato trovato
    }
    // Controlla diagonale secondaria
    if (
        table.rows[0].cells[2].firstChild.src.includes(simbolo + ".png") &&
        table.rows[1].cells[1].firstChild.src.includes(simbolo + ".png") &&
        table.rows[2].cells[0].firstChild.src.includes(simbolo + ".png")
    ) {
        if(simbolo == "X")
            alert("Hai vinto!");
        else
            alert("Il computer ha vinto!");
        return true; // Esci dalla funzione se un vincitore è stato trovato
    }
}

function disabilitaTutteLeCelle() {
    // Disabilita tutte le celle della griglia
    let table = document.getElementById("trisTable");
    for (let i = 0; i < ROWS; i++) {
        for (let j = 0; j < COLS; j++) {
            let cell = table.rows[i].cells[j];
            cell.onclick = null; // Rimuove l'evento di click
        }
    }
}