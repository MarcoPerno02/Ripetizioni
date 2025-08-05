#include <iostream>
#include <cctype>  // per isalpha() e islower()
using namespace std;

// Funzione che verifica se una lettera è una vocale
bool isVocale(char c) {
    // Rende il confronto case-insensitive
    c = tolower(c);
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
}

int main() {
    char lettera;
    char risposta;

    do {
        cout << "Inserisci una lettera: ";
        cin >> lettera;

        // Verifica se è una lettera dell'alfabeto
        if (!isalpha(lettera)) {
            cout << "❌ Input non valido: devi inserire una lettera dell'alfabeto." << endl;
        } else {
            // Verifica se è una vocale o una consonante
            if (isVocale(lettera)) {
                cout << "✅ È una vocale" << endl;

                // Bonus: indica se è maiuscola o minuscola
                if (islower(lettera)) {
                    cout << "(minuscola)" << endl;
                } else {
                    cout << "(maiuscola)" << endl;
                }
            } else {
                cout << "ℹ️ Non è una vocale" << endl;
            }
        }

        // Chiedi all'utente se vuole ripetere
        cout << "\nVuoi inserire un'altra lettera? (s/n): ";
        cin >> risposta;
        cout << "--------------------------------------" << endl;

    } while (risposta == 's' || risposta == 'S');

    cout << "\n👋 Programma terminato." << endl;
    return 0;
}
