package Ramakanth;
import java.util.Scanner;
public class M16 {
	//chara
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	if(ch==Character.toLowerCase(ch)) {
		System.out.println(ch);
	}else {
		System.out.println("Given character is uppercase");
	}
}
}
