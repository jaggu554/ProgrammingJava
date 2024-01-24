package Ramakanth;

import java.util.Scanner;

//perfect square 
public class sc4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int sr=(int)Math.sqrt(n);
	
	if(sr*sr==n) {
		System.out.println(sr);
	}else {
		System.out.println(-1);
	}
}
}
