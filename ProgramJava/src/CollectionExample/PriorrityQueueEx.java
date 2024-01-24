package CollectionExample;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorrityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Jaggu");
		pq.add("Vijay");
		pq.add("Rani");
		pq.add("Subbu");
		pq.add("Suhas");
		System.out.println(pq);
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		pq.poll();
		pq.remove();
		System.out.println("after removing the elments");
		Iterator<String> itr1=pq.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
