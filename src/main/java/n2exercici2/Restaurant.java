package n2exercici2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

	// ATRIBUTS
	
		 private String nom;
		 private int puntuacio;
		
		// CONSTRUCTOR
		
		public Restaurant(String nom, int puntuacio) {
			this.nom       = nom;
			this.puntuacio = puntuacio;
		}

		// GETTERS & SETTERS
		
		public String getNom() {
			return nom;
		}

		public int getPuntuacio() {
			return puntuacio;
		}

		// MÈTODES
		
		@Override
		public int hashCode() {
			return Objects.hash(nom, puntuacio);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Restaurant other = (Restaurant) obj;
			return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
		}

		@Override
		public int compareTo(Restaurant o) {return Integer.compare(this.puntuacio, o.getPuntuacio());
		}	
} 
