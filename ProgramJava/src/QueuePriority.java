import java.util.Queue;
import java.util.Iterator;
import java.util.PriorityQueue;
public class QueuePriority {
public static void main(String[] args) {
	Queue<String> queue=new PriorityQueue<>();
	queue.add("Jaggu");
	queue.add("Ramu");
	queue.add("Ravi");
	queue.add("raghu");
	queue.add("Rajan");
	queue.add("Jaggu");
	System.out.println(queue);
	Iterator itr=queue.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	queue.poll();
	queue.remove();
	Iterator itr1=queue.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	System.out.println("After removing the two elements :"+queue);
	
}
}
