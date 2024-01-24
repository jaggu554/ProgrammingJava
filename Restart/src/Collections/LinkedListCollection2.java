package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection2 {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<>();
	ll.add("sasi");
	ll.add("harsha");
	ll.add("charita");
	ll.add("jaggu");
	ll.addFirst("jagan");
	Iterator<String> itr=ll.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
