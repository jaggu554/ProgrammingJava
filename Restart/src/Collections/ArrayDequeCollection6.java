package Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeCollection6 {
public static void main(String[] args) {
	ArrayDeque<String> deque=new ArrayDeque<>();
	deque.add("character");
	deque.add("cow");
	deque.add("Buffalo");
	deque.add("goat");
	deque.add("Dog");
	System.out.println(deque);
	deque.remove();
	Iterator<String> it=deque.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
