// Seleziona l'elemento del DOM che funge da display della calcolatrice
const display = document.getElementById("display");

// Seleziona tutti i bottoni presenti nella pagina
const buttons = document.querySelectorAll("button");

// Variabili per gestire lo stato dell'input corrente e dei calcoli precedenti
let currentInput = "";   // Numeri digitati dall'utente (in attesa di operazione o risultato)
let lastOperator = "";   // Ultimo operatore premuto (+, -, *, /)
let lastValue = "";      // Valore precedente alla pressione dell'operatore

// Aggiunge un event listener a ciascun bottone
buttons.forEach(button => {
    button.addEventListener("click", (event) => {
        const value = event.target.id; // Ottiene l'ID del bottone cliccato (es: "1", "+", "=")

        // Se il bottone ha un valore valido, gestiscilo
        if (value) {
            handleInput(value);
        }
    });
});

// Funzione principale che decide cosa fare in base al valore premuto
function handleInput(value) {
    if (isOperator(value)) {
        // Se è un operatore, gestiscilo separatamente
        handleOperator(value);
    } else if (value === "=") {
        // Se è il bottone "=", calcola il risultato
        calculateResult();
    } else if (value === "C") {
        // Se è il bottone "C", cancella tutto
        clearDisplay();
    } else if (value === "←") {
        // Se è il bottone backspace, cancella l'ultimo carattere
        deleteLastCharacter();
    } else {
        // Altrimenti, è un numero o un punto decimale: aggiungilo all'input attuale
        currentInput += value;
        updateDisplay(value); // Mostralo sul display
    }
}

// Verifica se il valore passato è un operatore
function isOperator(value) {
    return ["+", "-", "*", "/"].includes(value);
}

// Gestisce la logica degli operatori
function handleOperator(operator) {
    if (currentInput === "") return; // Se non c'è niente da operare, ignora

    // Se c'è già un'operazione in corso (es. 5 + 2), calcolala prima
    if (lastOperator && lastValue) {
        calculateResult();
    }

    // Salva l'operatore e il valore attuale per la prossima operazione
    lastOperator = operator;
    lastValue = currentInput;
    currentInput = ""; // Svuota l'input corrente per il prossimo numero
    updateDisplay(operator); // Mostra l'operatore sul display
}

// Calcola il risultato dell'operazione
function calculateResult() {
    // Verifica che tutte le parti dell’operazione siano presenti
    if (lastOperator && lastValue && currentInput) {
        if (currentInput === "0" && lastOperator === "/") {
            // Gestione della divisione per zero
            alert("Errore: Divisione per zero non permessa.");
            return; // Interrompe l'esecuzione
        }
        // Esegue il calcolo convertendo in stringa l'espressione e passandola a eval
        const result = eval(`${lastValue}${lastOperator}${currentInput}`);
        
        // Pulisce il display
        display.innerText = "";

        // Mostra il risultato
        updateDisplay(result);

        // Resetta gli operatori ma conserva il risultato come input attuale
        lastOperator = "";
        lastValue = "";
        currentInput = result;
    }
}

// Cancella completamente il display e tutte le variabili
function clearDisplay() {
    display.innerText = "";
    currentInput = "";
    lastOperator = "";
    lastValue = "";
}

// Cancella solo l'ultimo carattere inserito
function deleteLastCharacter() {
    if (currentInput.length === 0) {
        // Se non c'è input corrente, annulla anche operatore e valore precedente
        if (lastOperator) {
            currentInput = lastValue;  // Ripristina il numero precedente
            lastValue = "";
            lastOperator = "";
        }
    }
    else {
        // Altrimenti rimuove l'ultimo carattere da currentInput
        currentInput = currentInput.slice(0, -1);
    }

    // Aggiorna il display togliendo l'ultimo carattere visualizzato
    display.innerText = display.innerText.slice(0, -1);
}

// Aggiorna il contenuto del display aggiungendo un valore
function updateDisplay(value) {
    display.innerText += value;
}