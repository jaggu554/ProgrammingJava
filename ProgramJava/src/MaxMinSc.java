import java.util.Scanner;

public class MaxMinSc {
	public int max(int ar[]) {
		int n = ar.length;
		int mx = ar[0];

		for (int i = 0; i < n; i++) {
			if (mx < ar[i]) {
				mx = ar[i];
			}
		}
		return mx;
	}

	public int min(int ar[]) {
		int m = ar.length;
		int mn = ar[0];
		for (int i = 0; i < m; i++) {
			if (mn > ar[i]) {
				mn = ar[i];
			}
		}
		return mn;

	}

	public static void main(String[] args) {
		Scanner fc = new Scanner(System.in);
		int N = fc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=fc.nextInt();
		}
		MaxMinSc M=new MaxMinSc();
		System.out.println("Maximum element in array:"+M.max(arr));
		System.out.println("Minimum element in array:"+M.min(arr));

	}

}
