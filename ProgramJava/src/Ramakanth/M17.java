package Ramakanth;

import java.util.Scanner;

public class M17 {
	//checks the lastDigit in the given two numbers
	public static void lastDigit(int num1,int num2) {
		if(num1%10==num2%10) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		M17 s=new M17();
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		s.lastDigit(n1, n2);
		
	}

}
