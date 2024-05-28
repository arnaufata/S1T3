package n2exercici1;

import java.util.HashSet;

public class S103n2exercici1 {

	public static void main(String[] args) {
		
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();

		restaurants.add(new Restaurant("Can Rius", 6));
		restaurants.add(new Restaurant("Bar Casal", 3));
		restaurants.add(new Restaurant("Alreves", 8));
		restaurants.add(new Restaurant("Can Rius", 6));
		restaurants.add(new Restaurant("Bar Casal", 10));
		
		for (Restaurant restaurant : restaurants) {
			System.out.println(restaurant.getNom() + ", " + restaurant.getPuntuacio());
		}
	}

}
