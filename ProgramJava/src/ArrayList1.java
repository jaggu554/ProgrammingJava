import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList<String> animals=new ArrayList<>();
	animals.add("jaggu");
	animals.add("Vijay");
	animals.add("vishnu");
	animals.add("ajay");
	System.out.println(animals);
	for(String e:animals) {
		System.out.println(e);
	}
	animals.remove(0);
	System.out.println(animals);
}
}
