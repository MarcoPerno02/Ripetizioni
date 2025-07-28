Creare un'applicazione in C# con interfaccia grafica (WinForms o WPF)
che genera una password casuale basata su criteri specifici.
Il programma deve includere le seguenti funzionalità:
1. INTERFACCIA UTENTE:
   - Checkbox per selezionare i tipi di caratteri da includere nella password:
     - Lettere minuscole (a-z) (26 caratteri)
     - Lettere maiuscole (A-Z) (26 caratteri)
     - Numeri (0-9) (10 caratteri)
     - Simboli (!@#$%^&*) (8 caratteri)
   - Input per specificare la lunghezza della password (tra 4 e 20 caratteri)
   - Bottone per generare la password
   - Area per visualizzare la password generata
2. GENERAZIONE PASSWORD:
   - La password deve essere generata casualmente in base ai tipi di caratteri selezionati
   - Deve rispettare la lunghezza specificata dall'utente
   - Deve essere visualizzata nell'area dedicata dopo la generazione

CONSIGLI DI IMPLEMENTAZIONE:
- Per decidere che carattere (lettera, numero, simbolo) aggiungere alla password,
puoi usare un array che contiene tutti i caratteri possibili. Esempio crea un
array con tutti i caratteri disponibili in base alle scelte dell'utente.
Poi per scegliere un carattere casuale, puoi usare la funzione random per generare un indice casuale