package Ramakanth;
import java.util.Scanner;
public class M10 {
	public static void main(String[] args) {
		//sum of the given number 
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}
		System.out.println("the sum of the given number is "+sum);
	}

}
