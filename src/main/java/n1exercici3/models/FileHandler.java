package n1exercici3.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FileHandler {

    public HashMap<String, String> llegirCountriesDelFitxer(String nom){
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        File countries = new File("countries.txt");
        try (Scanner lector = new Scanner(countries)){
            while (lector.hasNextLine()) {
                String data = lector.nextLine();
                String[] divisio = data.split(" ");

                if (divisio.length == 2) {
                    String pais = divisio[0];
                    String capital = divisio[1];
                    capitalCities.put(pais, capital);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return capitalCities;
    }

    public void fitxerClasificacio(String nomFitxer, String nomUsuari, int puntuacio){
        try (FileWriter classificaio = new FileWriter(nomFitxer, true);) {
            classificaio.write(nomUsuari + ": " + puntuacio + " punts.\n");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
