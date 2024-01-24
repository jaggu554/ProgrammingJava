import java.util.Scanner;

public class Armsc {
	public static void armNumber(int n) {
		int result=0;
		int temp=n;
		
		while(n>0) {
			int rem=n%10;
			result=(int) (result+Math.pow(rem,3));
			n=n/10;
		}
		if(temp==result) {
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Armsc a=new Armsc();
		for(int i=1;i<=n;i++) {
			a.armNumber(i);
		}
	}

}
