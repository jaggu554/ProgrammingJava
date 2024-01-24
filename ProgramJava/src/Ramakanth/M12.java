package Ramakanth;

import java.util.Scanner;

public class M12 {
	//checking the number whether it is a palindrome or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}
