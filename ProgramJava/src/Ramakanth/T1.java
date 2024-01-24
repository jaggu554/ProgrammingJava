package Ramakanth;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		//printing  duplicates present in array by using a another array
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				if (arr[j] == arr[k]) {

					b[j] = arr[j];

				}

			}

			System.out.print(b[j] + " ");
		}

	}

}
