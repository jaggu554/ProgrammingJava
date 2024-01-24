import java.awt.Window.Type;

public class AutoandUnBoxing {
public static void main(String[] args) {
	/*
	int a=20;
	Integer i=Integer.valueOf(a);
	Integer j=a;
	System.out.println(a);
	System.out.println(i);
	System.out.println(j);
	*/
	//unboxing 
	/*
	Integer a=new Integer(3);
	int i=a.intValue();
	int j=a;
	System.out.println(j);
	System.out.println(i);
	System.out.println(a);
	*/
	/*
	double a=10;
	Double b=a;
	Double b1=Double.valueOf(a);
	System.out.println(b1);
	*/
	Integer a=new Integer(3);
	int i=a.intValue();
	int j=a;
	System.out.println(j);
}
}
