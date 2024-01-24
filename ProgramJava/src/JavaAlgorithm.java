import java.util.ArrayList;
import java.util.Collections;

public class JavaAlgorithm {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(4);
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		System.out.println("Unsorted numbers:"+numbers);
		Collections.sort(numbers);
		System.out.println("Sorted Array:"+numbers);
		int pos=Collections.binarySearch(numbers,4);
		System.out.println(pos);
		System.out.println(Collections.max(numbers));
		System.out.println(Collections.min(numbers));

	}

}
