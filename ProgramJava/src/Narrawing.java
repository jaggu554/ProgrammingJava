/*
public class Narrawing {

	public static void main(String[] args) {
		float f=90.0f;
	//	int a=f; this thorws a error
		int a=(int )f;
		System.out.println(a);

	}

}
*/
class Narrawing{
	public static void main(String[] args) {
		/*
		 * int a=1000;
		
		byte b=(byte )a;
		System.out.println(b);
		//this produces overflow error 
	*/
	byte a =10;
	byte b=20;
	byte c=(byte)(a+b);
	System.out.println(c);
	}
}
