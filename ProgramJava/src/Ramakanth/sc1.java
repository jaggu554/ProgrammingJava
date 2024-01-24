package Ramakanth;

import java.util.Scanner;
//prime number
public class sc1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		if(n<=1) {
			System.out.println("it is not prime");
			
		}else {
			
			for(int i=2 ;i<n;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}else {
					flag=0;
				}
			}
			if(flag==1) {
				System.out.println("not prime");
			}else {
				System.out.println("prime");
			}
		}
		
	}

}
