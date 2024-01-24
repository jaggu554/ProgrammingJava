package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueCollection {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();//new Deque<>();
		pq.add("String");
		pq.add("cherri");
		pq.add("ratnamma");
		pq.add("chari");
		pq.add("jagan");
		System.out.println("head:"+pq.element());
		System.out.println("head:"+pq.peek());
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("After removing the elements");
		Iterator<String> itr1=pq.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
