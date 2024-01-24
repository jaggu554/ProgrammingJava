package Ramakanth;

import java.util.Scanner;

public class M14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gender = sc.nextLine();

		int age = sc.nextInt();
		if (gender.equals("Female")){
			if (age >= 1 && age <= 58) {
				System.out.println("the percentage of interest is 8.2%");
			} else if (age >= 59 && age <= 100) {
				System.out.println("the percentage of interest is 9.2%");
			}
		} else if(gender.equals("Male")){
			if (age >= 1 && age <= 58) {
				System.out.println("the percentage of interest is 8.4%");
			} else if (age >= 59 && age <= 100) {
				System.out.println("the percentage of interest is 10.5%");
			}

		}
	}

}
