#include <iostream>  // Libreria per input/output
using namespace std;

int main() {
    int n;         // Variabile per salvare il numero inserito dall'utente
    char scelta;   // Variabile per decidere se ripetere il programma
    char tipo;     // Variabile per scegliere il tipo di triangolo (Crescente o Decrescente)

    // Inizio ciclo che permette di ripetere tutto il programma finché l'utente lo desidera
    do {
        // Chiediamo all'utente di inserire un numero intero positivo
        cout << "Inserisci un numero intero positivo: ";
        cin >> n;

        // Controllo: il numero deve essere maggiore o uguale a 1
        if (n < 1) {
            cout << "Errore: il numero deve essere maggiore o uguale a 1." << endl;
        } else {
            // L'utente può scegliere tra triangolo crescente o decrescente
            cout << "Scegli il tipo di triangolo:" << endl;
            cout << "  C - Crescente" << endl;
            cout << "  D - Decrescente" << endl;
            cout << "Scelta: ";
            cin >> tipo;

            // Convertiamo la scelta in maiuscolo per semplicità
            tipo = toupper(tipo);

            cout << "\nTriangolo numerico:\n" << endl;

            int i = 1;  // Contatore per le righe del triangolo

            // Ciclo while per stampare ogni riga del triangolo (da 1 a n)
            while (i <= n) {
                int limite;

                // Determiniamo quanti numeri stampare per riga:
                // Se triangolo crescente → stampiamo da 1 a i
                // Se triangolo decrescente → stampiamo da 1 a (n - i + 1)
                if (tipo == 'C') {
                    limite = i;
                } else {
                    limite = n - i + 1;
                }

                // Ciclo for per stampare i numeri sulla riga corrente
                for (int j = 1; j <= limite; j++) {
                    cout << j << " ";
                }

                // Passiamo alla riga successiva
                cout << endl;

                i++; // Incrementiamo il contatore delle righe
            }
        }

        // Alla fine chiediamo all'utente se vuole ripetere l'operazione
        cout << "\nVuoi inserire un altro numero? (s/n): ";
        cin >> scelta;

        // Convertiamo la risposta in minuscolo per accettare anche 'S' o 'N'
        scelta = tolower(scelta);

    } while (scelta == 's');  // Ripeti solo se l'utente scrive 's'

    cout << "Programma terminato." << endl;

    return 0;
}
