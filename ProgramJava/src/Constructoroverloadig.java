
public class Constructoroverloadig {
public static void main(String[] args) {
	Student1 s1=new Student1 (554,"jaggu");
	Student1 s2=new Student1(554,"Jagadesh",789098.98f);
	s1.show();
	s2.show();
}
}
 class Student1{
	String name;
	int id;
	float salary;
	Student1(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student1(int id,String name,float salary ){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void show() {
		System.out.println(name+" "+id+" "+salary);
	}
}
