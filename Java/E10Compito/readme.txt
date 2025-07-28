Consegna E10 - Ereditarietà e Polimorfismo in Java

Scrivi un programma Java che modelli una gerarchia di veicoli utilizzando l'ereditarietà.

1. Crea una classe base chiamata `Veicolo` che abbia:
    - Un attributo protetto `velocitaMassima`. (protected)
    - Un costruttore che inizializza `velocitaMassima`.
    - Un metodo `stampaTipo()` che stampa "Veicolo generico". (Statico)

2. Crea le classi figlie `Auto` e `Bicicletta` che estendono `Veicolo`:
    - Ridefinisci il metodo `stampaTipo()` per stampare rispettivamente "Auto" e "Bicicletta".
    - Implementa il costruttore che richiama quello della classe padre.
    - (Opzionale) In `Auto`, aggiungi un metodo che stampa la velocità massima.

3. Crea una classe `Monopattino` che estende `Veicolo`:
    - Non ridefinire il metodo `stampaTipo()`, così da utilizzare quello della classe base.
    - Nel costruttore, imposta la velocità massima a 25.

4. Nel metodo `main` della classe `Main`, crea un oggetto per ciascuna classe e richiama il metodo `stampaTipo()` su ciascuno.

Obiettivo: Comprendere l'ereditarietà, il polimorfismo e l'utilizzo del costruttore della classe padre tramite `super`.