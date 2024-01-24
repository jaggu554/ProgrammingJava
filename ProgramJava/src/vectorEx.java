import java.util.Iterator;
import java.util.Vector;

public class vectorEx {

	public static void main(String[] args) {
	Vector<Integer> numbers =new Vector<>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	System.out.println("vector:"+numbers);
	Vector<String> numbers1=new Vector<>();
	numbers1.add("50");
	numbers1.add("60");
	numbers1.add("70");
	String element=numbers1.remove(2);
	System.out.println();
	
	System.out.println("Element:"+element);
		

	}

}
