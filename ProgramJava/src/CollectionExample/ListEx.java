package CollectionExample;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ListEx {
public static void main(String[] args) {
	HashSet<Integer> set=new HashSet<>();
	set.add(100);
	set.add(200);
	set.add(300);
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(50);
	set.add(60);
	set.remove(100);
	System.out.println(set);
	//set.clear();
	//set.removeAll(set);
	HashSet<Integer> set1=new HashSet<>();
	set1.addAll(set);
	System.out.println(set1);
	
	Iterator<Integer> itr=set1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
