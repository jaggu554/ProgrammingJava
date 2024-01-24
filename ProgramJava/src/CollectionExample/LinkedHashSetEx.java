package CollectionExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
public static void main(String[] args) {
	LinkedHashSet<String> lhs=new LinkedHashSet<>();
	lhs.add("jaggu");
	lhs.add("jagan");
	lhs.add("sami");
	lhs.add("sreeram");
	System.out.println(lhs);
	Iterator<String> itr=lhs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	lhs.remove("sami");
	System.out.println(lhs);
	
	
	}
}
