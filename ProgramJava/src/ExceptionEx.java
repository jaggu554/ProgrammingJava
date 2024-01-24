
public class ExceptionEx {
	/*
	public static void divideByZero() {
		throw new ArithmeticException("Try to divide by 0");
		
	}
	*/

	public static void main(String[] args) {
		/*
		try {
			int[] arr = { 1, 2, 3, 4 };
			System.out.println(arr[10]);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Rest of the code in try block");
		}
		*/
		/*
		try {
			int number=10/0;
			System.out.println("Rest of code in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException "+e.getMessage());
		} finally {
			System.out.println("rest the code and run again");
		}
*/
		//divideByZero();
		ListOfNumbers list=new ListOfNumbers();
		list.writeList();
		
	}
}
class ListOfNumbers{
	public int[] arr=new int[10];
	public void writeList() {
		try {
			arr[10]=11;
			
		}catch (NumberFormatException e1) {
			System.out.println("NumberFormatException=>"+e1.getMessage());
			
		}catch(IndexOutOfBoundsException e2) {
			System.out.println("IndexOutOfBoundsException=>"+e2.getMessage());
		}
	}
}