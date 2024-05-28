package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class S103n1exercici1 {

	public static void main(String[] args) {

		Scanner teclat = new Scanner(System.in);
		ArrayList<Month> mesos = new ArrayList<Month>();

		mesos.add(new Month("Gener"));
		mesos.add(new Month("Febrer"));
		mesos.add(new Month("Març"));
		mesos.add(new Month("Abril"));
		mesos.add(new Month("Maig"));
		mesos.add(new Month("Juny"));
		mesos.add(new Month("Juliol"));
		mesos.add(new Month("Setembre"));
		mesos.add(new Month("Octubre"));
		mesos.add(new Month("Novembre"));
		mesos.add(new Month("Desembre"));

		for (Month mes : mesos) {
			System.out.print(mes.getName() + ", ");
		}
		System.out.println();

		// Afegim el mes agost al ArrayList, i imprimim de nou demostrant que s'ha insertat al lloc dessitjat mantenint l'ordre correcte de la resta de mesos

		mesos.add(7, new Month("Agost"));

		for (Month mes : mesos) {
			System.out.print(mes.getName() + ", ");
		}
		System.out.println();

		// Convertim l'ArrayList en un HashSet i comprovem que no ens afegeix duplicats dels mesos ja existents

		HashSet<Month> setMesos = new LinkedHashSet<>(mesos);

		setMesos.add(new Month("Gener"));
		setMesos.add(new Month("Maig"));

		Iterator<Month> it = setMesos.iterator();
		while (it.hasNext()) {
			Month mes = it.next();
			System.out.print(mes.getName() + ", ");
		}
		System.out.println();
		
		for (Month mes : setMesos) {
			System.out.print(mes.getName() + ", ");
		}

	}
}
