package Ramakanth;
import java.util.Scanner;
public class M6 {
	public static void main(String[] args) {
		//this is a program about colour case testing by switch
		Scanner sc=new Scanner(System.in);
		char colour=sc.next().charAt(0);
		switch(colour) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'W':
			System.out.println("White");
			break;
		case default:
			System.out.println("Invalid case");
		}
	}

}
