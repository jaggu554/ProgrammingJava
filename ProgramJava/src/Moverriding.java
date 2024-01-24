
public class Moverriding {
	public static void main(String[] args) {
		Java1 j1 = new Java1();
		j1.displayInfo();
		
	}

}

class Language2 {
	public void displayInfo() {
		System.out.println("Common English Language");
	}
}

class Java1 extends Language2 {
	public void displayInfo() {
		System.out.println("Java programming Language");
	}
}
