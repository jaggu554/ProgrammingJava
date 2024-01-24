import java.util.Scanner;

public class Solution1 {

	public void solve(int[] A, int[] B) {
		int n = A.length;
		int n1 = B.length;
		int newAr[][] = new int[n1][n];

		for (int j =0; j<n1; j++) {
			for (int i = 0; i < n; i++) {
				newAr[j][(B[j] + i) % n] = A[i];

			}

		}

		for (int z = n1-1; z >=0; z--) {
			for (int y = 0; y < n; y++) {
				System.out.print(newAr[z][y] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int k = 0; k < N; k++) {
			A[k] = sc.nextInt();
		}
		int l = sc.nextInt();
		int B[] = new int[l];
		for (int f = 0; f < l; f++) {
			B[f] = sc.nextInt();
		}
		s.solve(A, B);
	}

}
