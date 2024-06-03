package n1exercici3.models;

import java.util.HashMap;

public class Game {
    public static void runProgram(){
        FileHandler fileHandler = new FileHandler();
        HashMap<String, String> capitalCities = fileHandler.llegirCountriesDelFitxer("countries.txt");

        User user = new User();
        CapitalQuiz quiz = new CapitalQuiz(capitalCities);
        int puntuacio = quiz.startQuiz();

        fileHandler.fitxerClasificacio("classificacio.txt", user.getNomUsuari(), puntuacio);
    }
}
