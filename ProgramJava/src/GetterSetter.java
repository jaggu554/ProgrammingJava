
public class GetterSetter {
public static void main(String[] args) {
	Person p1=new Person();
	p1.setage(45);
	p1.getAge();
}
}
class Person{
	private int age;
	public int getAge() {
		System.out.println(age);
	return age;
}
	public void setage(int age) {
		this.age=age;
		
	}
}