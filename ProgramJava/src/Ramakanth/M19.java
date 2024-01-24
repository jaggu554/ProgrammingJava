package Ramakanth;

import java.util.Scanner;

import javax.swing.plaf.SliderUI;

public class M19 {
	
	public static void main(String[] args) {
		Scanner fc = new Scanner(System.in);
		int n = fc.nextInt();
		String s1[] = new String[n];
		if(n==0) {
			System.out.println("No values");
		}else {
			for(int i=0;i<n;i++) {
				s1[i]=fc.next();
				System.out.println(s1[i]);
			}
		}
		
		
		

	}
}
