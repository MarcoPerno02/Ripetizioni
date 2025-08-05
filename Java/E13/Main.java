package E13;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Veicolo> veicoli = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Java/E13/veicoli.txt"))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                String[] dati = riga.split(",");
                if (dati.length != 5) continue;

                String tipo = dati[0];
                String marca = dati[1];
                String modello = dati[2];
                int anno = Integer.parseInt(dati[3]);
                int extra = Integer.parseInt(dati[4]);

                Veicolo v = switch (tipo) {
                    case "Auto" -> new Auto(marca, modello, anno, extra);
                    case "Moto" -> new Moto(marca, modello, anno, extra);
                    case "Camion" -> new Camion(marca, modello, anno, extra);
                    default -> null;
                };

                if (v != null) {
                    veicoli.add(v);
                }
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Errore nel formato dei dati: " + e.getMessage());
        }

        // Stampa i veicoli
        System.out.println("📋 Veicoli caricati:");
        for (Veicolo v : veicoli) {
            System.out.println(v.descrizione());
        }
    }
}
