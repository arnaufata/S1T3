package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class S103n1exercici2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(3);
		numbers.add(24);
		numbers.add(7);
		numbers.add(13);
		
		System.out.println(numbers);

		List<Integer> inverseNumbers = new ArrayList<Integer>();
		
		ListIterator<Integer> it = numbers.listIterator(numbers.size());
		while (it.hasPrevious()) {
			int num = it.previous();
			inverseNumbers.add(num);
		}
		
		System.out.println(inverseNumbers);
		
	}

}
