
public class Animal {
	protected String name;
	protected void display() {
		System.out.println("I am an animal");
	}
	public static void main(String[] args) {
		Dog D=new Dog();
		
		D.getinfo();
		
	}
}
class Dog{
	String name="Jagadesh";
	public void getinfo() {
		System.out.println("My name is "+name);
	}
}