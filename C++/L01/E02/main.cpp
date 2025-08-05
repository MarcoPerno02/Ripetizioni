#include <iostream>
using namespace std;

// Funzione che restituisce true se il numero è pari, false altrimenti
bool isPari(int n) {
    return n % 2 == 0;
}

int main() {
    int numero;
    char risposta;

    do {
        // Richiesta all'utente
        cout << "Inserisci un numero intero: ";
        cin >> numero;

        // Verifica se pari o dispari
        if (isPari(numero)) {
            cout << "Il numero è pari" << endl;
        } else {
            cout << "Il numero è dispari" << endl;
        }

        // Bonus: verifica se è multiplo di 10
        if (numero % 10 == 0) {
            cout << "Inoltre, il numero è un multiplo di 10!" << endl;
        }

        // Chiedi se l’utente vuole continuare
        cout << "Vuoi inserire un altro numero? (s/n): ";
        cin >> risposta;

        cout << "------------------------------------" << endl;

    } while (risposta == 's' || risposta == 'S');

    cout << "Programma terminato." << endl;

    return 0;
}
