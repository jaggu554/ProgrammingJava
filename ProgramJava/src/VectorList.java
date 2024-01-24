import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class VectorList {
public static void main(String[] args) {
	List<Integer> v=new Vector<>();
	v.add(1);
	v.add(0);
	v.add(20);
	v.add(10);
	System.out.println(v);
	Iterator itr=v.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
