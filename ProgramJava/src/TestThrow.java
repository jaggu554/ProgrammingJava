
public class TestThrow {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person not eligible to vote");
		}else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		
TestThrow.validate(13);
	}

}

