import java.util.*;
public class DequeArrayDequeue {
public static void main(String[] args) {
	
	Deque <String> deque =new ArrayDeque<>();
	deque.add("Jaggu");
	deque.add("Vishnu");
	deque.add("Rashmi");
	deque.add("Vijay");
	System.out.println(deque);
	System.out.println(deque.peek());
	System.out.println(deque.poll());
	for(String e:deque) {
		System.out.println(e);
	}
}
}
