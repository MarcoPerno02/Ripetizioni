#include <iostream>
using namespace std;

int main() {
    int n;

    cout << "Inserisci un numero intero positivo: ";
    cin >> n;

    if (n < 1) {
        cout << "Errore: il numero deve essere maggiore o uguale a 1." << endl;
        return 1; // uscita con errore
    }

    cout << "\nTriangolo numerico:\n" << endl;

    int i = 1;
    while (i <= n) {
        for (int j = 1; j <= i; j++) {
            cout << j << " ";
        }
        cout << endl;
        i++;
    }

    return 0;
}
