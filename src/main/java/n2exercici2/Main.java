package n2exercici2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Set<Restaurant> restaurants = new TreeSet();

		restaurants.add(new Restaurant("Can Rius", 6));
		restaurants.add(new Restaurant("Bar Casal", 3));
		restaurants.add(new Restaurant("Alreves", 8));
		restaurants.add(new Restaurant("Can Rius", 6));
		restaurants.add(new Restaurant("Bar Casal", 10));
	
		for (Restaurant restaurant : restaurants) {
			System.out.println("nom: " + restaurant.getNom() + ", puntuació: " + restaurant.getPuntuacio());
		}
		
	}

}
