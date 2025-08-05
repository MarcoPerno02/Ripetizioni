#include <iostream>
using namespace std;

int main() {
    int n;

    // Chiedi all'utente di inserire un numero positivo
    cout << "Inserisci un numero: ";
    cin >> n;

    // Controlla che il numero sia valido
    if (n < 1) {
        cout << "Errore: devi inserire un numero intero positivo." << endl;
        return 1; // termina il programma
    }

    // --- Ciclo while: stampa da 1 a n ---
    cout << "\nNumeri da 1 a " << n << ":" << endl;
    int i = 1;
    while (i <= n) {
        cout << i << endl;
        i++;
    }

    // --- Ciclo for: stampa la tabellina del n ---
    cout << "\nTabellina del " << n << ":" << endl;
    for (int j = 1; j <= 10; j++) {
        cout << j << " x " << n << " = " << j * n << endl;
    }

    return 0;
}
