package n1exercici1;

import java.util.Objects;

public class Month {

	// ATRIBUTS

	private String name;

	// CONSTRUCTOR

	public Month(String name) {
		this.name = name;
	}

	// GETTERS & SETTERS

	public String getName() {
		return name;
	}

	/*
	 * Si no sobreescribim el mètode 'equals()', Java utilitzarà la implementació
	 * predeterminada d'Object, que només compara les referències d'objecte i
	 * considerarà dos objectes diferents si són instàncies diferents, fins i tot si
	 * tenen el mateix contingut.
	 * 
	 * HashSet reconeixerà que dos objectes Month són iguals si tenen el mateix nom,
	 * i per tant no es permetran duplicats al HashSet basats en el nom del mes.
	 */

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}

}
