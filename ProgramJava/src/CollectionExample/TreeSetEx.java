package CollectionExample;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(12);
		set.add(11);
		set.add(7);
		set.add(18);
		set.add(2);
		set.add(4);
		System.out.println(set);
		System.out.println("First Element in the treeSet "+set.pollFirst());
		System.out.println("Last Element in the treeset "+set.pollLast());
	}

}
