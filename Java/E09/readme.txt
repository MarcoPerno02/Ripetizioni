Consegna E09 - Ereditarietà e Override in Java

Scrivi un programma Java che modelli una gerarchia di animali utilizzando l'ereditarietà. 

1. Crea una classe base chiamata `Animale` che abbia:
    - Un attributo protetto `numeroZampe`.
    - Un costruttore che inizializza `numeroZampe`.
    - Un metodo `stampaVerso()` che stampa un verso generico dell'animale.

2. Crea le classi figlie `Cane` e `Gatto` che estendono `Animale`:
    - Ridefinisci il metodo `stampaVerso()` per stampare rispettivamente "Bau!" e "Miao!".
    - Implementa il costruttore che richiama quello della classe padre.
    - (Opzionale) Nel `Cane`, aggiungi un metodo che stampa il numero di zampe.

3. Crea una classe `UccelloSenzaVersionePropriaDiStampaVerso` che estende `Animale`:
    - Non ridefinire il metodo `stampaVerso()`, così da utilizzare quello della classe base.
    - Nel costruttore, imposta il numero di zampe a 0.

4. Nel metodo `main` della classe `Main`, crea un oggetto per ciascuna classe e richiama il metodo `stampaVerso()` su ciascuno.

Obiettivo: Comprendere come funziona l'ereditarietà, l'override dei metodi e l'utilizzo del costruttore della classe padre tramite `super`.