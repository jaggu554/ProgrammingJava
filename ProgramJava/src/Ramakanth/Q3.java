package Ramakanth;

import java.util.Scanner;
//Write a C program to calculate the root of a Quadratic Equation
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		double a=sc.nextDouble();
		System.out.println("Enter b value");
		double b=sc.nextDouble();
		System.out.println("Enter c value");
		double c=sc.nextDouble();
		double d=b*b-4.0*a*c;
		double r1,r2;
		if(d==0) {
			r1=-b/2*a;
			r2=r1;
			System.out.println("the roots are of r1 and r2 are equal"+r1+" "+r2);
		}else if(d>0) {
			r1=-b+Math.pow(d,0.5)/2*a;
			r2=-b-Math.pow(d,0.5)/2*a;
			System.out.println("the roots are of r1 and r2 are "+r1+" "+r2);
		}else {
			System.out.println("the roots are imaginary");
		}
	}

}
