package Ramakanth;

import java.util.Scanner;

//sum of natural numbers
public class sc3 {
	public void sumNatural(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc3 s=new sc3();
	s.sumNatural(n);
	
}
}
