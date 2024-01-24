import java.util.Scanner;

public class DescendingTA6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int temp = 0;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				if (a[j] < a[k]) {
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
			System.out.print(a[j] + " ");
		}
	}
}
