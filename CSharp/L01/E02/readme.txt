ESERCIZIO: Analizzatore di File di Testo (.txt)

OBIETTIVO:
Creare un'applicazione in C# con interfaccia grafica (WinForms o WPF)
che permetta all'utente di selezionare un file di testo (.txt) contenuto nella cartella bin
chiamato "testo.txt" e analizzarne il contenuto per fornire alcune statistiche fondamentali.
Il file contiene solo spazi come caratteri separatori tra le parole.

FUNZIONALITÀ RICHIESTE:

1. INTERFACCIA UTENTE:
   - Bottone "Analizza contenuto"
   - Area di output che visualizzi i seguenti dati:
     • Numero totale di parole
     • Numero totale di frasi
     • Parola più lunga presente nel testo
     • Lunghezza media delle parole

2. LOGICA DI ANALISI:
   - Il programma deve leggere il file
   - Le parole sono separate da spazi (usa Regex o metodi di split)
   - Deve essere calcolata la lunghezza media delle parole
   - Il programma deve gestire correttamente file vuoti o non validi

