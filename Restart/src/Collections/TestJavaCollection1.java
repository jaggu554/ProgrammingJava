package Collections;
import java.util.*;
public class TestJavaCollection1 {
public static void main(String[] args) {
	ArrayList<Integer> List=new ArrayList<>();
	List.add(13);
	List.add(140);
	List.add(15);
	List.add(16);
	List.add(13);
	List.add(140);
	List.add(90);
	Iterator it=List.iterator();
	
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
}
}
