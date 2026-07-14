function calcolaConto() {
    // 1. Recupero input dal DOM
    let tavolo = document.getElementById("tavolo").value;
    let persone = parseInt(document.getElementById("persone").value);
    let conto = parseFloat(document.getElementById("conto_totale").value);
    let percentualeMancia = document.getElementById("servizio").value;
    
    // Recupero il radio button del pagamento
    let metodoSelezionato = document.querySelector('input[name="metodo"]:checked');

    let divErrore = document.getElementById("errore");
    let divAvviso = document.getElementById("avviso-pos");
    let divTabella = document.getElementById("risultato-tabella");

    // Reset degli elementi di output ad ogni esecuzione
    divErrore.innerHTML = "";
    divAvviso.innerHTML = "";
    divAvviso.style.display = "none";
    divTabella.innerHTML = "";

    // 2. Validazioni dei campi
    if (tavolo === "" || persone === "" || percentualeMancia === "" || !metodoSelezionato) {
        divErrore.innerHTML = "Errore: Compila tutti i campi, seleziona la mancia e il metodo di pagamento.";
        return;
    }

    if (isNaN(persone) || persone <= 0) {
        divErrore.innerHTML = "Errore: Il numero di persone deve essere un numero intero maggiore di 0.";
        return;
    }

    if (isNaN(conto) || conto <= 0) {
        divErrore.innerHTML = "Errore: Il conto totale inserito deve essere maggiore di 0 €.";
        return;
    }

    // Estrazione dei dati validati
    let metodoPagamento = metodoSelezionato.value;
    let manciaPercentuale = parseFloat(percentualeMancia);

    // 3. Logica dei Calcoli Matematici
    let valoreMancia = (conto * manciaPercentuale) / 100;
    let contoFinaleConMancia = conto + valoreMancia;
    let quotaSingola = contoFinaleConMancia / persone;

    // Arrotondamenti standard a 2 cifre decimali per la valuta (€)
    valoreMancia = Math.round(valoreMancia * 100) / 100;
    contoFinaleConMancia = Math.round(contoFinaleConMancia * 100) / 100;
    quotaSingola = Math.round(quotaSingola * 100) / 100;

    // 4. Classificazione della fascia di spesa (Stato) e classi CSS
    let fasciaSpesa = "";
    let classeCss = "";

    if (quotaSingola <= 20) {
        fasciaSpesa = "Economico";
        classeCss = "economico";
    } else if (quotaSingola <= 45) {
        fasciaSpesa = "Medio";
        classeCss = "medio";
    } else {
        fasciaSpesa = "Costoso";
        classeCss = "costoso";
    }

    // 5. Controllo Condizionale Speciale (Logica AND)
    if (metodoPagamento === "Carta di Credito" && quotaSingola < 12) {
        divAvviso.innerHTML = "Attenzione: Verificare se il locale accetta pagamenti singoli con carta per cifre inferiori a 12€!";
        divAvviso.style.display = "block";
    }

    // 6. Generazione e stampa della tabella di resoconto
    let htmlTabella = `
        <table>
            <thead>
                <tr>
                    <th>Tavolo</th>
                    <th>Persone</th>
                    <th>Mancia Totale</th>
                    <th>Conto + Mancia</th>
                    <th>Quota a Testa</th>
                    <th>Fascia Spesa</th>
                </tr>
            </thead>
            <tbody>
                <tr class="${classeCss}">
                    <td>${tavolo}</td>
                    <td>${persone}</td>
                    <td>${valoreMancia.toFixed(2)}€</td>
                    <td>${contoFinaleConMancia.toFixed(2)}€</td>
                    <td><strong>${quotaSingola.toFixed(2)}€</strong></td>
                    <td>${fasciaSpesa}</td>
                </tr>
            </tbody>
        </table>
    `;

    divTabella.innerHTML = htmlTabella;
}