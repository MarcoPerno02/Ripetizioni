#include <iostream>

int main()
{
    // risultato sarà a sua volta un double, derivando da double ha senso
    double num1, num2, risultato;
    // operazione è un Carattere, quindi char
    char operazione;
    
    // Leggiamo gli input
    std::cout<<"Inserisci il primo numero: ";
    std::cin>>num1;
    
    std::cout<<"Inserisci il secondo numero: ";
    std::cin>>num2;
    
    std::cout<<"Scegli l'operazione (+, -, *, /): ";
    std::cin>>operazione;
    
    // Attenzione ad no usare le "" perchè quelle sono per le stringhe
    // e operazione è un char (Carattere)
    if (operazione == '+') {
        risultato = num1 + num2;
    }
    else if (operazione == '-') {
        risultato = num1 - num2;
    }
    else if (operazione == '*') {
        risultato = num1 * num2;
    }
    else if (operazione == '/') {
        if(num2 == 0) {
            // Mettendo return qua interrompe l'esecuzione della 
            // funzione main. Ritorniamo 1 per segnalare che qualcosa è andato storto
            // perchè di default si ritorno 0 se va tutto bene
            std::cout << "Errore: divisione per 0 non consentita";
            return 1;
        }
        risultato = num1 / num2;
    }
    // Se non era nessuno dei casi precedenti allora è sicuramente un operazione non riconosciuta
    // e quindi interrompiamo (con il return) l'esecuzione
    else {
        std::cout << "operazione non riconosciuta";
        return 1;
    }
    
    // Stampiamo il Risultato
    std::cout << "Risultato: " << risultato;
    
}