import java.util.*;
public class SortedInterfaceTreeset {
public static void main(String[] args) {
	Map<String,Integer> map=new HashMap<String,Integer>();
	map.put("Jagadesh", 554);
	map.put("Vijay", 522);
	map.put("Naresh", 515);
	map.put("Gun", 570);
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
		
	}
}
