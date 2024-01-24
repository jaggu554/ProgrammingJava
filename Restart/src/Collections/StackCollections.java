package Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackCollections {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(55);
		Iterator<Integer> it=stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println(stack);
			}
}