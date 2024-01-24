import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TEestCollection1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Ravi");
		list.add("Rama");
		list.add("Raghu");
		list.add("Subbu");
		list.add("Ravi");
		//removing duplicate elemnts in ArrayList 
		List<String> list1=new ArrayList<>();
		for (String e:list) {
			if(!list1.contains(e)) {
				list1.add(e);
			}
			
		}System.out.println(list);
		System.out.println(list1);
		}

}
