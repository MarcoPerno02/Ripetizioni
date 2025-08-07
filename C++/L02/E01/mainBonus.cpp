#include <iostream>
using namespace std;

int main() {
    int n;
    char scelta;
    char tipo;

    do {
        cout << "Inserisci un numero intero positivo: ";
        cin >> n;

        if (n < 1) {
            cout << "Errore: il numero deve essere maggiore o uguale a 1." << endl;
        } else {
            cout << "Scegli il tipo di triangolo:" << endl;
            cout << "  C - Crescente" << endl;
            cout << "  D - Decrescente" << endl;
            cout << "Scelta: ";
            cin >> tipo;

            // converti in maiuscolo
            tipo = toupper(tipo);

            cout << "\nTriangolo numerico:\n" << endl;

            int i = 1;
            while (i <= n) {
                int limite = (tipo == 'C') ? i : (n - i + 1);
                for (int j = 1; j <= limite; j++) {
                    cout << j << " ";
                }
                cout << endl;
                i++;
            }
        }

        cout << "\nVuoi inserire un altro numero? (s/n): ";
        cin >> scelta;
        scelta = tolower(scelta);

    } while (scelta == 's');

    cout << "Programma terminato." << endl;

    return 0;
}
