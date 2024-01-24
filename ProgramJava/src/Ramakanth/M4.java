package Ramakanth;

import java.util.Scanner;

public class M4 {
public static void main(String[] args) {
	//given array contains prints true element is 1 or 4
	Scanner sx=new Scanner(System.in);
	int n=sx.nextInt();
	int[] arr=new int[n];
	int flag=0;
	for(int i=0;i<n;i++) {
		arr[i]=sx.nextInt();
	}
	for(int j=0;j<n;j++) {
		if(arr[j]==4||arr[j]==1) {
			flag=1;
		}else {
			flag=0;
		}
	}
	if(flag==1) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
}
}
