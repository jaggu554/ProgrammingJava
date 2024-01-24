package CollectionExample;

import java.util.Map;
import java.util.HashMap;

public class HashMapex {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(101, "Jaggu");
		hm.put(102, "Jagga");
		hm.put(103, "Ramu");
		hm.put(104, "Sagga");
		System.out.println(hm);
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
