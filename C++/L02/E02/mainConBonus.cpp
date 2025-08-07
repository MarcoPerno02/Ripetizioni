#include <iostream>  // Libreria per input/output
using namespace std;

int main() {
    int n;             // Numero inserito dall'utente
    char scelta;       // Per decidere se ripetere il programma

    // Inizio ciclo che permette di ripetere il programma finché l'utente lo desidera
    do {
        // Richiesta input all'utente
        cout << "Inserisci un numero intero positivo: ";
        cin >> n;

        // Verifica che il numero sia valido
        if (n < 1) {
            cout << "Errore: il numero deve essere maggiore o uguale a 1." << endl;
        } else {
            int somma = 0;        // Accumulatore per la somma
            int fattoriale = 1;   // Accumulatore per il fattoriale (inizia da 1)

            // Costruzione della formula della somma (bonus 1)
            cout << "\nSomma: ";
            for (int i = 1; i <= n; i++) {
                somma += i;  // Somma i numeri da 1 a n
                cout << i;
                if (i < n) cout << " + ";
            }
            cout << " = " << somma << endl;

            // Costruzione della formula del fattoriale (bonus 1)
            cout << "Fattoriale: ";
            for (int i = 1; i <= n; i++) {
                fattoriale *= i;  // Moltiplica i numeri da 1 a n
                cout << i;
                if (i < n) cout << " * ";
            }
            cout << " = " << fattoriale << endl;

            // Calcolo e stampa della media (bonus 3)
            double media = static_cast<double>(somma) / n;
            cout << "Media dei numeri da 1 a " << n << " = " << media << endl;
        }

        // Richiesta all’utente se vuole ripetere il programma (bonus 2)
        cout << "\nVuoi inserire un altro numero? (s/n): ";
        cin >> scelta;
        scelta = tolower(scelta);  // Converte in minuscolo per accettare anche 'S'

    } while (scelta == 's');

    // Messaggio finale
    cout << "Programma terminato." << endl;

    return 0;
}
