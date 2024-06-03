package n1exercici1;

import n1exercici1.models.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MonthSetter {

	public static void runProgram() {

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

		System.out.print("Previ a inserció: ");
		for (Month mes : mesos) {
			System.out.print(mes.getName() + ", ");
		}
		System.out.println();

		mesos.add(7, new Month("Agost"));

		System.out.print("Post a l'inserció: ");
		for (Month mes : mesos) {
			System.out.print(mes.getName() + ", ");
		}
		System.out.println();

		HashSet<Month> setMesos = new LinkedHashSet<>(mesos);

		setMesos.add(new Month("Gener"));
		setMesos.add(new Month("Maig"));

		System.out.print("Hash set iterator: ");
		Iterator<Month> it = setMesos.iterator();
		while (it.hasNext()) {
			Month mes = it.next();
			System.out.print(mes.getName() + ", ");
		}
		System.out.println();

		System.out.print("Hash set for: ");
		for (Month mes : setMesos) {
			System.out.print(mes.getName() + ", ");
		}

	}
}
