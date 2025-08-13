#include <iostream>
#include <string>
#include <vector>
#include <cctype> // per isupper, islower, isdigit, ispunct, isspace
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
    int spazi = 0;
    int punteggiatura = 0;
    int totaleLettere = 0;

    vector<char> vocali;

    while (i < testo.length()) {
        char c = testo[i];
        totaleCaratteri++;

        if (isupper(c)) {
            maiuscole++;
            totaleLettere++;
        } else if (islower(c)) {
            minuscole++;
            totaleLettere++;
        }

        if (isdigit(c)) {
            cifre++;
        }

        if (isspace(c)) {
            spazi++;
        }

        if (ispunct(c)) {
            punteggiatura++;
        }

        // Controllo se è vocale (maiuscola o minuscola)
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            vocali.push_back(c);
        }

        i++;
    }

    // Stampa delle vocali memorizzate
    cout << "\nVocali trovate: ";
    for (char v : vocali) {
        cout << v << " ";
    }
    cout << endl;

    // Calcolo percentuale vocali rispetto alle lettere
    double percentualeVocali = 0;
    if (totaleLettere > 0) {
        percentualeVocali = (static_cast<double>(vocali.size()) / totaleLettere) * 100;
    }

    // Risultati finali
    cout << "\nTotale caratteri: " << totaleCaratteri << endl;
    cout << "Lettere maiuscole: " << maiuscole << endl;
    cout << "Lettere minuscole: " << minuscole << endl;
    cout << "Cifre: " << cifre << endl;
    cout << "Spazi: " << spazi << endl;
    cout << "Segni di punteggiatura: " << punteggiatura << endl;
    cout << "Totale lettere: " << totaleLettere << endl;
    cout << "Percentuale vocali: " << percentualeVocali << "%" << endl;

    return 0;
}
