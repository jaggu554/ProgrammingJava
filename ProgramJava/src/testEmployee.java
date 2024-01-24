
public class testEmployee {

	public static void main(String[] args) {
	Employee e1=new Employee(123,"Jagagdesh",98765432.09f);
	
	e1.show();

	}

}
class Employee{
	String name;
	
	int id;
	float salary;
	Employee(int id,String name,float salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void show() {
		System.out.println(name+" "+id+" "+" "+salary);
	}
}
