package Collections;
import java.util.Iterator;
import java.util.Vector;
public class VectorCollection3 {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("adivireddy");
		v.add("Lavanya");
		v.add("sridevi");
		v.add("Hanumanth reddy");
		
		Iterator<String> it=v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
