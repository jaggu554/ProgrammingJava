package CollectionExample;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(5);
		ll.add(1);
		ll.add(6);
		ll.addFirst(90);
		ll.addLast(9);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		LinkedList<Integer> ll2=new LinkedList<>();
		ll2.addAll(ll);
		ll2.addFirst(10);
		Collections.sort(ll2);
		Iterator<Integer> itr=ll2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}

}
