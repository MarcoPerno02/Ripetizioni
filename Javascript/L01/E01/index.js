function stampaNomeCompleto() {
    // Attraverso document.getElementById visitiamo l'albero contentente tutti i nostri tag html
    // e la funzione cercherà quel node (ovvero il tag html) con l'id passatto alla funzione
    let inputTextboxName = document.getElementById("name")
    let name = inputTextboxName.value

    if(name == "") {
        alert("Inserisci il nome")
        return
    }

    let inputTextboxSurname = document.getElementById("surname")
    let surname = inputTextboxSurname.value

    if(surname == "") {
        alert("Inserisci il cognome")
        return
    }

    alert("Nome: " + name + "\nCognome: " + surname)

    let h3NomeCompletoTag = document.getElementById("h3NomeCompleto")
    h3NomeCompletoTag.className = "h3NomeCompletoVisibile"

    // Ogni volta che l'evento click sul bottone viene scatenato e viene eseguito questo codice,
    // le righe seguenti aggiorneranno il contenuto del tag p con id 'nomeCompleto'
    let pNomeCompleto = document.getElementById("nomeCompleto")
    pNomeCompleto.textContent = name + " " + surname;
}

function onMouseLeaveTextbox() {
    alert("Mouse leave textbox")
}