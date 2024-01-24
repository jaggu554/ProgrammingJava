package Ramakanth;
import java.util.Scanner;
public class M2 {
	//finding the minimum and maximum values present in the array 
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int max=a[0];
	int min=a[0];
	for(int j=0;j<n;j++) {
		if(min>a[j]) {
			min=a[j];
			
		}
		if(max<a[j]) {
			max=a[j];
		}
	}
	System.out.println(min);
	System.out.println(max);
	
	}

}
