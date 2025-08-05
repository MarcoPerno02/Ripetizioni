package E11;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public abstract class Risorsa {
    // Contatore statica per gli identificativi.
    // Supponiamo che tutti gli identificativi
    // siano maggiori di 0 e soprattuto incremntali di 1
    // (quindi 0, 1, 2, 3, ...)
    private static int contatore = 0;

    private String titolo;
    private String autore;
    private int identificativo;

    public Risorsa(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
        this.identificativo = contatore;
        contatore++;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    @Override
    public String toString() {
        return "Risorsa{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                '}';
    }

    public static ArrayList<Risorsa> caricaRisorseDaFile(String nomeFile) {
        ArrayList<Risorsa> risorse = new ArrayList<>();
        // Implementazione per caricare le risorse da un file
        // (da implementare in classi derivate)
        try (Scanner scanner = new Scanner(new File(nomeFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.startsWith("Libro")) {
                    risorse.add(Libro.daRigaFile(line));
                } else if(line.startsWith("Rivista")) {
                    risorse.add(Rivista.daRigaFile(line));
                } else if(line.startsWith("DVD")) {
                    risorse.add(DVD.daRigaFile(line));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return risorse;
    }
}

