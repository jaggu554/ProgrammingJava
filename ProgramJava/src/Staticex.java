
public class Staticex {
public  static void main(String[] args) {
	
	Student2 c1=new Student2(554,"jagadesh");
	Student2 c2 =new Student2(522,"Vijay");
	Student2.clgname="Midts";
	c1.display();
	c2.display();
	
	}
	
}
class Student2{
	int rollno;
	String name;
	static String clgname="ALTS";
	Student2(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		
	}
	void display() {
		System.out.println(rollno+" "+name+" "+clgname);
	}
}
