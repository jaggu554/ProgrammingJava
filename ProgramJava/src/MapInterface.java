import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class MapInterface {
public static void main(String[] args)
{
	/*
	Map<String,Integer> numbers=new HashMap<>();
	numbers.put("One ",1);
	numbers.put("two",2);
	numbers.put("Three", 3);
	System.out.println("Map:"+numbers);
	System.out.println("Keys:"+numbers.keySet());
	System.out.println("values:"+numbers.values());
	System.out.println("Entries:"+numbers.entrySet());
	int Value=numbers.remove("two");
	System.out.println("Removed value="+Value);
	*/
	HashMap<Integer,String> languages=new HashMap<>();
	languages.put(1, "Java");
	languages.put(2,"Python");
	languages.put(3, "Js");
	System.out.println("Hashmap:"+languages);
	System.out.println("Keys:");
	for(Integer key:languages.keySet()) {
		System.out.println(key);
		System.out.println(" ");
	}
	System.out.println("\n values");
	for(String value:languages.values()) {
		System.out.println(value);
		System.out.println("  ");
	}
	System.out.println("\n entries:");
	for(Entry<Integer, String> entry:languages.entrySet()) {
		System.out.println(entry);
		System.out.println(" ");
	}
}
}
