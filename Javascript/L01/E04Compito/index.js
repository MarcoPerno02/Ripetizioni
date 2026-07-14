function inserisciLibro() {
    let titolo = document.getElementById("titolo").value;
    let autore = document.getElementById("autore").value;
    let genere = document.getElementById("genere").value;
    let voto = document.getElementById("voto").value;

    if (titolo === "" || autore === "" || genere === "" || voto === "") {
        alert("Per favore, compila tutti i campi.");
        return;
    }

    let numeroPagineTotali = parseInt(document.getElementById("numeroPagineTotali").value);
    let numeroPagineLette = parseInt(document.getElementById("numeroPagineLette").value);

    if (numeroPagineTotali <= 0 || numeroPagineLette < 0 || numeroPagineLette > numeroPagineTotali) {
        alert("Per favore, inserisci un numero di pagine valido.");
        return;
    }

    let tabella = document.getElementById("tabella");
    let riga = document.createElement("tr");
    tabella.appendChild(riga);

    let stato;
    if (numeroPagineLette === 0) {
        stato = "Da iniziare";
        riga.className = "libroDaIniziare";
    }
    else if (numeroPagineLette < numeroPagineTotali) {
        stato = "In lettura";
        riga.className = "libroInCorso";
    } else {
        stato = "Completato";
        riga.className = "libroCompletato";
    }

    let cella = document.createElement("td")
    cella.textContent = titolo
    riga.appendChild(cella)
    cella = document.createElement("td")
    cella.textContent = autore
    riga.appendChild(cella)
    cella = document.createElement("td")
    cella.textContent = genere
    riga.appendChild(cella)
    cella = document.createElement("td")
    cella.textContent = numeroPagineTotali
    riga.appendChild(cella)
    cella = document.createElement("td")
    cella.textContent = numeroPagineLette
    riga.appendChild(cella)
    cella = document.createElement("td")
    cella.textContent = ((numeroPagineLette / numeroPagineTotali) * 100).toFixed(2) + "%";
    riga.appendChild(cella)
    cella = document.createElement("td")
    cella.textContent = stato
    riga.appendChild(cella)

    let td = document.createElement("td");
    riga.appendChild(td);

    for (let i = 0; i < voto; i++) {
        let stella = document.createElement("img");
        stella.src = "./static/img/stella.png";
        td.appendChild(stella);
    }
}