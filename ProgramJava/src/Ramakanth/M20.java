package Ramakanth;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class M20 {
	//caluculating the elements present between the 6 and 7
	public static void Addsum(int[] arr) {
		boolean add=true;
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			
			if(arr[i]!=6&&add==true) {
				sum=sum+arr[i];
				//System.out.println(sum);
			}else if(arr[i]==6) {
				add=false;
			}else if(arr[i]==7) {
				add=true;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int f=sc.nextInt();
	int [] a=new int [f];
	for(int j=0;j<f;j++) {
		a[j]=sc.nextInt();
	}
	M20.Addsum(a);
	
		
	}
	

}
