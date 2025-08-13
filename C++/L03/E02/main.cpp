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

    int countAB = 0;
    int count123 = 0;
    int posXYZ = -1;

    // Ricerca dei pattern "ab", "123", "xyz"
    int i = 0;
    while (i < testo.length()) {
        // Controllo "ab"
        if (i + 1 < testo.length() && testo.substr(i, 2) == "ab") {
            countAB++;
        }

        // Controllo "123"
        if (i + 2 < testo.length() && testo.substr(i, 3) == "123") {
            count123++;
        }

        // Controllo "xyz"
        if (i + 2 < testo.length() && testo.substr(i, 3) == "xyz" && posXYZ == -1) {
            posXYZ = i;
        }

        i++;
    }

    // Sostituzione "ciao" -> "hello"
    string risultato;
    i = 0;
    while (i < testo.length()) {
        if (i + 3 < testo.length() && testo.substr(i, 4) == "ciao") {
            risultato += "hello";
            i += 4; // salta "ciao"
        } else {
            risultato += testo[i];
            i++;
        }
    }

    // Stampa risultati
    cout << "\nRisultati:" << endl;
    cout << "- 'ab' trovato " << countAB << " volte" << endl;
    cout << "- '123' trovato " << count123 << " volte" << endl;

    if (posXYZ != -1)
        cout << "- 'xyz' trovato alla posizione " << posXYZ << endl;
    else
        cout << "- 'xyz' non trovato" << endl;

    cout << "- Stringa modificata: " << risultato << endl;

    return 0;
}
