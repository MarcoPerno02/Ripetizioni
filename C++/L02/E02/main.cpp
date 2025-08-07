#include <iostream>  // Libreria standard per input/output
using namespace std;

int main() {
    int n;  // Variabile per salvare il numero inserito dall'utente

    // Chiediamo all'utente di inserire un numero intero positivo
    cout << "Inserisci un numero intero positivo: ";
    cin >> n;

    // Controlliamo che il numero sia valido (maggiore o uguale a 1)
    if (n < 1) {
        cout << "Errore: il numero deve essere maggiore o uguale a 1." << endl;
        return 1;  // Uscita con codice di errore
    }

    int somma = 0;        // Variabile per la somma da 1 a n
    int fattoriale = 1;   // Variabile per il fattoriale (prodotto da 1 a n)

    // Calcolo della somma da 1 a n usando un ciclo for
    for (int i = 1; i <= n; i++) {
        somma += i;  // Aggiungiamo i alla somma
    }

    // Calcolo del fattoriale di n usando un altro ciclo for
    for (int i = 1; i <= n; i++) {
        fattoriale *= i;  // Moltiplichiamo i alla variabile fattoriale
    }

    // Stampiamo i risultati
    cout << "Somma da 1 a " << n << " = " << somma << endl;
    cout << "Fattoriale di " << n << " = " << fattoriale << endl;

    return 0;  // Il programma termina con successo
}
