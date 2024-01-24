import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class SetInterface {
public static void main(String[] args) {
	Set<Integer> numbers=new TreeSet<>();
	numbers.add(10);
	numbers.add(30);
	numbers.add(20);
	numbers.add(11);
	System.out.println("Numbers:"+ numbers);
	System.out.println("Accessing elements using itrator()");
	Iterator<Integer> iterate=numbers.iterator();
	while(iterate.hasNext()) {
		System.out.println(iterate.next());
		System.out.println(",");
		//this automatically provides sorted output
	}
	
}
}
