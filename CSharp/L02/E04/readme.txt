Meteo
Creare un esercizio winformos C# che legga 3 file chiamati torino.txt, milano.txt e roma.txt.
Ogni file contiene diversi record dove la prima colonna è la data, la seconda è la temperatura minima
e la terza la temperatura massima.
L'applicazione deve visualizzare in un apposita interfaccia grafica le temperature minime, medie e massime
per ogni città lette da file.
Verranno visualizzate le temperature minime, medie e massime per una città selezionata tramite una ComboBox.
Consiglio: fare una funzione che prende in input la città e calcola le temperature e le visualizza anche.

L'interfaccia deve avere:
- Una Label per le città (Torino, Milano, Roma)
- Una TextBox per le temperature minime
- Una TextBox per le temperature medie
- Una TextBox per le temperature massime
- Una ComboBox per selezionare la città

Esempio di contenuto per torino.txt:
2024-06-01 22 30 60
2024-06-02 24 35 55
2024-06-03 20 40 65
2024-06-04 23 32 58
2024-06-05 21 25 62

Esempio di contenuto per milano.txt:
2024-06-01 25 28 50
2024-06-02 27 30 48
2024-06-03 24 30 53
2024-06-04 26 32 49
2024-06-05 23 36 55

Esempio di contenuto per roma.txt:
2024-06-01 28 35 45
2024-06-02 30 40 42
2024-06-03 27 45 47
2024-06-04 29 30 44
2024-06-05 26 35 50

Per leggere da file con StreamReader 

string percorso = "percorso/del/tuo/file.txt";
using (StreamReader sr = new StreamReader(percorso))
{
    string linea;
    while ((linea = sr.ReadLine()) != null)
    {
        Console.WriteLine(linea);
    }
}