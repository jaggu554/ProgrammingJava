
public class Student {
	int id;
	String name;
	void insert(int rno,String n) {
		id=rno;
		name=n;
	}
	void displayInformation() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		/*
		s1.name="jaggubhai";
		s1.id=554;*/
		
		Student s2=new Student();
		/*
		s2.name="Ramesh";
		s2.id=544;
		*/
		s1.insert(554, "Jaggubhai");
		s1.displayInformation();
		s2.insert(544, "Rajesh");
		s2.displayInformation();
	}
}
