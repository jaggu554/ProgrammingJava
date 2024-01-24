package Ramakanth;

import java.util.Scanner;

public class M3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the searchKey");
		int searchKey=sc.nextInt();
		//sc.next();
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int flag=0;
		int j;
		for( j=0;j<n;j++) {
			if(arr[j]==searchKey) {
				flag=1;
				break;
				//System.out.println(j);
			}else {
				flag=0;
				//System.out.println(-1)
			}
		
		}
		if(flag==1) {
			System.out.println(j);
		}else {
			System.out.println(-1);
		}
		
	}
}
