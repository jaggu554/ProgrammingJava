import java.util.*;
public class SortedInterace {
public static void main(String[] args) {
	SortedMap<String,Integer> map=new TreeMap<>();
	map.put("One", 1);
	map.put("Two", 2);
	map.put("Three", 3);
	System.out.println(map);
	System.out.println("FirstKey:"+map.firstKey());
	System.out.println("Secondkey:"+map.lastKey());
	System.out.println("between elements:"+map.subMap("One", "Two"));
	System.out.println(map.tailMap("Two"));
	
}
}
