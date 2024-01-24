import java.util.Scanner;

public class Arrayrotatesc {
	public void rotate(int arr[], int b) {
		int n = arr.length;
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[(i + b) % n] = arr[i];
			// System.out.print(ar[i]+" ");

		}
		for (int j = 0; j < n; j++) {
			System.out.print(ar[j] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrayrotatesc f = new Arrayrotatesc();
		f.rotate(A, B);
	}

}
