package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListex {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Jaggu");
		list.add("Ramu");
		list.add("swami");
		list.add("Subbu");
		list.add("Anil");
		System.out.println("list before sorted");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("List after sorted");
		System.out.println(list);
		System.out.println("Printing the elements in list in reverse order");
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
		
	
	}

}
