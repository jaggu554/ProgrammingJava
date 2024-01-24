import java.util.Iterator;
import java.util.Stack;

public class StackList {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<>();
	s.push(10);
	s.push(2);
	System.out.println(s.pop());
	s.push(30);
	s.push(50);
	s.push(40);
	System.out.println("Peek element:"+s.peek());
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
