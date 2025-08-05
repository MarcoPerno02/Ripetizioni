#include <iostream>
using namespace std;

int main() {
    int n;
    char sceltaContinua;
    char ordine;

    do {
        // Chiedi un numero positivo
        cout << "Inserisci un numero intero positivo: ";
        cin >> n;

        if (n < 1) {
            cout << "❌ Errore: il numero deve essere maggiore di 0.\n";
        } else {
            // Chiedi l'ordine della stampa (normale o inverso)
            cout << "Vuoi stampare i numeri da 1 a " << n << " (n) o da " << n << " a 1 (i)? [n/i]: ";
            cin >> ordine;

            // --- Ciclo while ---
            cout << "\nNumeri:\n";
            if (ordine == 'i' || ordine == 'I') {
                int i = n;
                while (i >= 1) {
                    cout << i << endl;
                    i--;
                }
            } else {
                int i = 1;
                while (i <= n) {
                    cout << i << endl;
                    i++;
                }
            }

            // --- Ciclo for: tabellina del numero ---
            cout << "\nTabellina del " << n << ":\n";
            for (int j = 1; j <= 10; j++) {
                cout << j << " x " << n << " = " << j * n << endl;
            }
        }

        // Chiedi se l’utente vuole continuare
        cout << "\nVuoi inserire un altro numero? (s/n): ";
        cin >> sceltaContinua;
        cout << "----------------------------------\n";

    } while (sceltaContinua == 's' || sceltaContinua == 'S');

    cout << "\nProgramma terminato. 👋" << endl;
    return 0;
}
