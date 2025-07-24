function calcolaBonus() {
    let inputTextboxName = document.getElementById("nome");
    let name = inputTextboxName.value;
    if (name == "") {
        alert("Inserisci il nome");
        return;
    }

    let inputTextboxSurname = document.getElementById("cognome");
    let surname = inputTextboxSurname.value;
    if (surname == "") {
        alert("Inserisici il cognome")
        return;
    }

    let inputDataDiNascita = document.getElementById("dataDiNascita");
    let dataDiNascita = inputDataDiNascita.value;
    if (dataDiNascita == "") {
        alert("Inserisci la data di nascita");
        return;
    }

    let inputTextboxFigli = document.getElementById("numeroFigli");
    let figli = inputTextboxFigli.value;
    if (figli < 0) {
        alert("Il valore di figli non può essere minore di 0")
        return;
    }

    let inputStatoLavoratore = document.getElementById("statoLavorativo")
    let statoLavorativo = inputStatoLavoratore.value;
    if (statoLavorativo != "disoccupato" && statoLavorativo != "lavoratore") {
        alert("Stato lavorativo non valido");
        return;
    }

     let inputTextboxisee = document.getElementById("isee");
    let isee = inputTextboxisee.value;
    if (isee < 0 || isee > 1000) {
        alert("Il valore di isee non può essere minore di 0 oppure maggior di 1000")
        return;
    }

    let pRisultato = document.getElementById("risultato")

    if (figli >= 2 && statoLavorativo == "disoccupato" && isee < 200) {
        let annoNascita = parseInt(dataDiNascita.split("-")[0]);
        if (annoNascita < 2000) {
            pRisultato.textContent = "Congratulazioni " + name + " " + surname + ", hai diritto al bonus!";
            return;
        }
    }

    pRisultato.textContent = "Peccato, " + name + " " + surname + ", non hai diritto al bonus!"

}