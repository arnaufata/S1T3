package n1exercici3.models;

import java.util.*;

public class CapitalQuiz {

    private HashMap<String, String> capitalCities;
    private ArrayList<String> countries;
    private HashSet<String> countriesAsked;
    private Random random;
    private Scanner teclat;
    private int contadorPunts;

    public CapitalQuiz(HashMap<String, String> capitalCities){
        this.capitalCities  = capitalCities;
        this.countries      = new ArrayList<>(capitalCities.keySet());
        this.countriesAsked = new HashSet<>();
        this.random         = new Random();
        this.teclat         = new Scanner(System.in);
        this.contadorPunts  = 0;
    }

    public int startQuiz(){

        for (int i = 0; i < 10; i++) {
            String paisAleatori;

            do {
                int randomIndex = random.nextInt(countries.size());
                paisAleatori = countries.get(randomIndex);
            }
            while (countriesAsked.contains(paisAleatori));

            countriesAsked.add(paisAleatori);

            System.out.println("Indica la capital de " + paisAleatori + " :");
            String respostaUsuari = teclat.nextLine();

            if(capitalCities.get(paisAleatori).equalsIgnoreCase(respostaUsuari)) {
                System.out.println("Correcte!");
                contadorPunts++;
            } else {
                System.out.println("Incorrecte! La capital de " + paisAleatori + " és " + capitalCities.get(paisAleatori) + ".");
            }
        }
        return contadorPunts;
    }
}
