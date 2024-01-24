package Ramakanth;

import java.util.Scanner;

public class Q2 {
	// Write a C program to accept a coordinate point in a XY coordinate system and
	// de
	// termine in which quadrant the coordinate point lies.
//test data: 7 9
//excepted output:
	// The coordinate point (7,9) lies in the First quadrant
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x value");
		int x = sc.nextInt();
		System.out.println("Enter the y value");
		int y = sc.nextInt();
		if (x > 0 && y > 0) {
			System.out.println("the coordinate point ("+x+","+y+") lies in the first quadrant");
		}else if(x<0 && y>0) {
			System.out.println("the coordinate point ("+x+","+y+") lies in the second quadrant");
		}else if(x<0 && y<0) {
			System.out.println("the coordinate point ("+x+","+y+") lies in the third quadrant");
		}else if(x>0 && y<0) {
			System.out.println("the coordinate point ("+x+","+y+") lies in the fourth quadrant");
		}else {
			System.out.println("Please enter correct inputs");
		}
	}
}
