#include <iostream>
#include <string>
using namespace std;

int main() {
    string testo;
    cout << "Inserisci una stringa: ";
    getline(cin, testo);

    if (testo.empty()) {
        cout << "Errore: stringa vuota!" << endl;
        return 1;
    }

    int i = 0;
    int totaleCaratteri = 0;
    int maiuscole = 0;
    int minuscole = 0;
    int cifre = 0;

    cout << "\nVocali trovate:" << endl;

    while (i < testo.length()) {
        char c = testo[i];
        totaleCaratteri++;

        if (c >= 'A' && c <= 'Z') {
            maiuscole++;
        } else if (c >= 'a' && c <= 'z') {
            minuscole++;
        }

        if (c >= '0' && c <= '9') {
            cifre++;
        }

        // Controllo delle vocali (maiuscole e minuscole)
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            cout << c << endl;
        }

        i++;
    }

    cout << "\nTotale caratteri: " << totaleCaratteri << endl;
    cout << "Lettere maiuscole: " << maiuscole << endl;
    cout << "Lettere minuscole: " << minuscole << endl;
    cout << "Cifre: " << cifre << endl;

    return 0;
}
