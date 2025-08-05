#include <iostream>
#include <cctype>  // per isalpha()
using namespace std;

int main() {
    char lettera;

    // Chiedi all'utente di inserire una lettera
    cout << "Inserisci una lettera: ";
    cin >> lettera;

    // Verifica se l'input è una lettera
    if (!isalpha(lettera)) {
        cout << "Input non valido: non hai inserito una lettera." << endl;
        return 1; // Termina con errore
    }

    // Controlla se è una vocale (sia maiuscola che minuscola)
    if (lettera == 'a' || lettera == 'e' || lettera == 'i' ||
        lettera == 'o' || lettera == 'u' ||
        lettera == 'A' || lettera == 'E' || lettera == 'I' ||
        lettera == 'O' || lettera == 'U') {

        cout << "È una vocale" << endl;
    } else {
        cout << "Non è una vocale" << endl;
    }

    return 0;
}
