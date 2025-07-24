ESERCIZIO: Generatore di Password Casuale

DESCRIZIONE:
Crea una pagina web che genera password casuali in base alle preferenze dell'utente.
L'utente può scegliere quali tipi di caratteri includere e la lunghezza della password.

REQUISITI OBBLIGATORI:

1. STRUTTURA BASE:
   - 4 checkbox per scegliere i tipi di caratteri:
     * Lettere minuscole (a-z)
     * Lettere maiuscole (A-Z) 
     * Numeri (0-9)
     * Simboli (!@#$%^&*)
   - Un campo per inserire la lunghezza desiderata (tra 4 e 20 caratteri)
   - Un bottone "Genera Password"
   - Un'area per mostrare la password generata
   - Un bottone "Copia Password" che diventa visibile dopo la generazione

2. FUNZIONALITÀ JAVASCRIPT:
   - Crea 4 array separati contenenti i diversi tipi di caratteri
   - Quando l'utente clicca "Genera Password", unisci gli array selezionati
   - Genera una password casuale della lunghezza richiesta
   - Mostra la password nell'area dedicata
   - Valida che almeno un tipo di carattere sia selezionato

3. VALIDAZIONE:
   - Se nessun checkbox è selezionato: "Errore: Seleziona almeno un tipo di carattere!"
   - Se la lunghezza è vuota o non valida: "Errore: Inserisci una lunghezza tra 4 e 20!"
   - Se tutto è corretto: genera e mostra la password

4. FUNZIONE COPIA:
   - Il bottone "Copia Password" deve copiare il testo negli appunti
   - Mostra un messaggio "Password copiata!" per 2 secondi

SPECIFICHE TECNICHE:

Array di caratteri da creare:
- lettereMinuscole = ['a', 'b', 'c', ..., 'z']
- lettereMaiuscole = ['A', 'B', 'C', ..., 'Z']  
- numeri = ['0', '1', '2', ..., '9']
- simboli = ['!', '@', '#', '$', '%', '^', '&', '*']

ALGORITMO SUGGERITO:

1. Controlla quali checkbox sono selezionati
2. Crea un array vuoto chiamato "caratteriDisponibili"
3. Per ogni checkbox selezionato, aggiungi i suoi caratteri a "caratteriDisponibili"
4. Genera la password:
   - Crea un array vuoto "password"
   - Ripeti per la lunghezza richiesta:
     * Scegli un indice casuale da "caratteriDisponibili"
     * Aggiungi quel carattere all'array "password"
5. Converti l'array "password" in stringa e mostrala

SUGGERIMENTI IMPLEMENTAZIONE:

- Usa Math.floor(Math.random() * array.length) per gli indici casuali
- Usa array.push() per aggiungere elementi
- Usa array.join('') per convertire array in stringa
- Usa document.getElementById() per accedere agli elementi
- Usa element.checked per verificare lo stato dei checkbox
- Usa navigator.clipboard.writeText() per copiare negli appunti

ESEMPIO DI STRUTTURA:

```
☐ Lettere minuscole (a-z)
☐ Lettere maiuscole (A-Z)
☐ Numeri (0-9)
☐ Simboli (!@#$%^&*)

Lunghezza: [____] caratteri

[Genera Password]

Password generata: _______________

[Copia Password]
```

BONUS OPZIONALE:
- Mostra la "forza" della password (Debole/Media/Forte) in base ai tipi di caratteri
- Permetti di rigenerare la password senza cambiare le impostazioni
