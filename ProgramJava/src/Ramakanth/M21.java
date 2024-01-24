package Ramakanth;

import java.util.Scanner;

public class M21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		for(int k=n-1;k>=0;k--) {
			for(int f=n-1;f>=0;f--) {
				System.out.print(arr[k][f]+" ");
			}
			System.out.println();
		}
	}

}
