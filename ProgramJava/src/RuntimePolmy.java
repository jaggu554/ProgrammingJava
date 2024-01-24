
public class RuntimePolmy {
//method overriding 
	public static void main(String[] args) {
		Language l1=new Language();
		l1.displayinfo();
		Java j1=new Java();
		j1.displayinfo();
	}
}
class Language{
	public void displayinfo() {
		System.out.println("Common English Language");
	}
}
class Java extends Language{
	public void displayinfo() {
		System.out.println("Java programming language");
	}
}
