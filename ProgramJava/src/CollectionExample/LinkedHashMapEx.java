package CollectionExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
	hm.put(101,"Jaggu");
	hm.put(102,"ramu");
	hm.put(103,"subbu");
	for(Map.Entry m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	//System.out.println(hm.remove(102));
	System.out.println(hm);
}
}
