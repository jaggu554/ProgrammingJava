import java.util.Scanner;

public class Palindrome {
	
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	int temp=num;
	int remainder,rev=0;
	while(num>0) {
		 remainder=num%10;
		 rev=remainder+(rev*10);
		 num=num/10;
		
	}
	if(temp==rev) {
		System.out.println("Palimdrome");
	}else {
		System.out.println("not palimdrome");
	}
	
	
}
}
