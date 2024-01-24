
public class Methodoverloading {
	/* mehtod overloading with changing the data type
	static int add(int a,int b) {
		System.out.println(a+b);
		return a+b;
		
	}
	static int add(int a ,int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}*/
	static int add(int a,int b) {
		
		System.out.println(a+b);
		return a+b;
		
	}
	static double add(double a ,double b) {
		System.out.println(a+b);
		return a+b;
	}
public static void main(String[] args) {
	Methodoverloading.add(12, 12);
	Methodoverloading.add(2, 2);
}
}
