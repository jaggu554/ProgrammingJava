package Ramakanth;

import java.util.Scanner;

public class M13 {
	public static void main(String[] args) {
		Scanner fc=new Scanner(System.in);
		int num=fc.nextInt();
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			
		}
		System.out.println(rev);
	}

}
