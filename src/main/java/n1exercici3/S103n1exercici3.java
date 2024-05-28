package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class S103n1exercici3 {

	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		try {
			File countries = new File("countries.txt");
			Scanner lector = new Scanner(countries);
			while (lector.hasNextLine()) {
				String data = lector.nextLine();
				
				// Dividir la línia en nom de país i capital
				String[] divisio = data.split(" ");
				
				// Com al document de text al final de la llista hi ha dos "intros", qe equivalen a dos lines mes sense res que el hasNext llegirà, puc anar al
				// document i treure-les, i que el document acabi just al final de la llista de països, o poso un if per comprovar i evitar errors
				if (divisio.length == 2) {
					String pais = divisio[0];
					String capital = divisio[1];
					capitalCities.put(pais, capital);
				}
			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix el teu nom d'usuari: ");
		String nomUsuari = teclat.nextLine();
		
		ArrayList<String> countries = new ArrayList<>(capitalCities.keySet());
		HashSet<String> countriesAsked = new HashSet<String>();
		
		Random random = new Random();
		int contadorPunts = 0;

		for (int i = 0; i < 10; i++) {
			String paisAleatori;
			
			do {                                                    // Comprovem que el pasïs no hagi estat preguntat ja
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
		
		try {
		      FileWriter classificaio = new FileWriter("classificacio.txt", true); //true --> per afegir dades al fitxer existent sense sobrescriure'l.
		      classificaio.write(nomUsuari + ": " + contadorPunts + " punts.\n");
		      classificaio.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
