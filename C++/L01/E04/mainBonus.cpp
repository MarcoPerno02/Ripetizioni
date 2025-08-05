#include <iostream>
#include <string>
using namespace std;

// Funzione che verifica l'accesso in base all'età
string verificaAccesso(int eta) {
    if (eta < 0 || eta > 120) {
        return "Valore non valido";
    } else if (eta < 18) {
        return "Accesso negato: sei minorenne.";
    } else if (eta <= 65) {
        return "Accesso consentito.";
    } else {
        return "Accesso consentito. Attenzione: servizio disponibile con supporto.";
    }
}

int main() {
    int eta;
    char risposta;

    do {
        // Richiesta età con controllo validità
        do {
            cout << "Inserisci la tua età: ";
            cin >> eta;

            if (eta < 0 || eta > 120) {
                cout << "❌ Età non valida. Inserisci un numero tra 0 e 120." << endl;
            }

        } while (eta < 0 || eta > 120);  // ripeti finché l’età non è valida

        // Mostra il messaggio in base all’età
        cout << verificaAccesso(eta) << endl;

        // Chiede se si vuole inserire un altro utente
        cout << "\nVuoi inserire un'altra età? (s/n): ";
        cin >> risposta;
        cout << "----------------------------------" << endl;

    } while (risposta == 's' || risposta == 'S');

    cout << "\nProgramma terminato." << endl;
    return 0;
}
