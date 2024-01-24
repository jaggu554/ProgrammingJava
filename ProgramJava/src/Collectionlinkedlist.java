import java.util.List;
import java.util.LinkedList;

public class Collectionlinkedlist {
	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(30);
		numbers.add(40);
		int index = numbers.indexOf(20);
		System.out.println("second index position element:" + index);
		int removedNumbr = numbers.remove(3);
		System.out.println(removedNumbr);
		System.out.println("Numbers:" + numbers);
		numbers.addAll(numbers);
		System.out.println(numbers);
		System.out.println();

		List<Integer> newNumbr = new LinkedList<>();

		for (Integer I : numbers) {
			if (!newNumbr.contains(I)) {
				newNumbr.add(I);
			}
		}
		System.out.println(newNumbr);

	}

}
