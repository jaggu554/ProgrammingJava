import java.util.ArrayList;

public class Collection1 {

	
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Jaggu");
		animals.add("Naresh");
		animals.add("Hema");
		System.out.println("ArrayList:" + animals);
		String remove1 = animals.remove(0);
		System.out.println(remove1);
		animals.add("Deepthi");
		animals.add("Chandra");
		System.out.println(animals.size());
		System.out.println(animals.iterator());
		animals.addAll(animals);

		System.out.println(animals);
		System.out.println(animals.get(0));
		ArrayList<String> newArray = new ArrayList<>();
		for (String e : animals) {
			if (!newArray.contains(e)) {
				newArray.add(e);
				
			}
		}System.out.println(newArray);
		

	}

}
