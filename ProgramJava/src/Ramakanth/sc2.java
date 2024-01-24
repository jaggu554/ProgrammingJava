package Ramakanth;

import java.util.Scanner;
//perfect number //sum of its perfect divisors equal to n
public class sc2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("perfect number");
		}else {
			System.out.println("not perfect nummber");
		}
		
	}

}
