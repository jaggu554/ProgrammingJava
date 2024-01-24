

public class Comileatime {
public static void main(String[] args) {
	pattern1 p1=new pattern1();
	p1.display();
	p1.display('#');
	
}
}
class pattern1{
	public void display() {
		for(int i=0;i<10;i++) {
			System.out.println("*");
		}
	}
	public void display(char symbol) {
		for(int i=0;i<10;i++) {
			System.out.println(symbol);
			
		}
	}
}