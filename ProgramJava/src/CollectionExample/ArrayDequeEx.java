package CollectionExample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeEx {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Jaggu");
		deque.add("raja");
		deque.add("raja");
		deque.add("ravi");
		deque.add("Somu");
		System.out.println(deque);
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
		System.out.println(deque.poll());
		System.out.println("After using poll");
		Iterator<String> itr = deque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
