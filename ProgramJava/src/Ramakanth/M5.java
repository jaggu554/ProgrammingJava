package Ramakanth;

import java.util.Scanner;

public class M5 {
	
	public static void main(String[] args) {
		//finding the mid elements of the two dimensional array  ---12
		//i have to how to take run time for 2d array and how to insert for the two two dimensional static method
		
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
			//int arr[][]= {{1,2,3},{4,5,6}};
		for (int l = 0; l < 2; l++) {
			int mid=arr[l][arr.length/2];
			for (int k = 0; k < 3; k++) {
				if (arr[l][k] == mid) {
				System.out.print(arr[l][k]+" ");	
				}
				
			}
		}
		

	}

}
