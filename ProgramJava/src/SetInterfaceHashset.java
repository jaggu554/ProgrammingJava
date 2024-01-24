import java.util.HashSet;
import java.util.Set;

public class SetInterfaceHashset {
	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		System.out.println("Set:"+set1);
		Set<Integer> set2=new HashSet<>();
		set2.add(50);
		set2.add(60);
		set2.add(60);
		set2.addAll(set1);
		System.out.println("Union :"+set2);
		set2.retainAll(set1);
		System.out.println("Intersection:"+set2);
		set1.containsAll(set2);
		System.out.println("subset:"+set1);
	}

}
