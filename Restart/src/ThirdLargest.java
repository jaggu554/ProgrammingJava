import java.util.Scanner;

public class ThirdLargest {
	public static int getThirdLargest(int a[], int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		return a[n - 2];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		for (int k = 0; k < size; k++) {
			arr[k] = in.nextInt();
		}
		System.out.print(ThirdLargest.getThirdLargest(arr, size));
	}

}
