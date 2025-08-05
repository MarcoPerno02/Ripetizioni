#include <iostream>
using namespace std;

int main() {
    int eta;

    // Richiesta dell'età all'utente
    cout << "Inserisci la tua età: ";
    cin >> eta;

    // Controllo validità dell'età
    if (eta < 0 || eta > 120) {
        cout << "Valore non valido" << endl;
    }
    // Caso: minorenne
    else if (eta < 18) {
        cout << "Accesso negato: sei minorenne." << endl;
    }
    // Caso: età compresa tra 18 e 65 (inclusi)
    else if (eta <= 65) {
        cout << "Accesso consentito." << endl;
    }
    // Caso: over 65
    else {
        cout << "Accesso consentito. Attenzione: servizio disponibile con supporto." << endl;
    }

    return 0;
}
