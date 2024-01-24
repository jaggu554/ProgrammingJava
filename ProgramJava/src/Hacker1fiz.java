import java.util.Scanner;

public class Hacker1fiz {
public static void main(String[] args) {
	System.out.println("Enter a number n");
	Scanner input =new Scanner(System.in);
	int n=input.nextInt();
	Solution s=new Solution();
	Solution.Printfiz(n);
}
}
class Solution{
	public static void Printfiz(int n) {
		for(int i=0;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%3==0){
			System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}

	
}
