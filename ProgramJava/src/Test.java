import java.util.*;

class Test{
	public static void main(String[] args) {
		try {
			int div=9/0+2;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println("Parent exception occurs");
		}
	}
}