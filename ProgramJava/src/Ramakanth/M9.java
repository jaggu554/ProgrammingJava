package Ramakanth;

import java.util.Scanner;

public class M9 {
	//checking the given number is prime or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want");
		int n = sc.nextInt();
		int flag = 0;
		if (n == 0 || n == 1) {
			System.out.print("n is not a prime number");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = 1;
					//System.out.println("n is not a primenumber");
				}
				

			}
			if(flag==1) {
				System.out.println("not prime");
				
			}else {
				System.out.println("Prime");
			}
			
		}
		sc.close();
	}

}
