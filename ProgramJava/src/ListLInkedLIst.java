import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class ListLInkedLIst {
public static void main(String[] args) {
	List<String> al=new LinkedList<>();
	al.add("Rama");
	al.add("Raju");
	al.add("Duvvu");
	al.add("jaggu");
	al.add("jagan");
	System.out.println("Elememts in LinkedList:"+al);
	Iterator itr= al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
