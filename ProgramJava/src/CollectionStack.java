import java.util.Stack;

public class CollectionStack {
	public static void main(String[] args) {
		Stack<String> animals=new Stack<>();
		animals.push("Dog");
		animals.push("donkey");
		animals.push("cat");
		animals.push("Goat");
		System.out.println("Animals:"+animals);
		String element=animals.pop();
		System.out.println("Element:"+element);
		System.out.println();
		System.out.println(animals.peek());
		System.out.println(animals.search("cat"));
		
	}

}
