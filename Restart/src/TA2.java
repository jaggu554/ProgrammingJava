import java.util.Scanner;

public class TA2 {
	public static void main(String[] args) {
		// we are showing how many the number is repeated in an array
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int fr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int visited = -1;
		for (int j = 0; j < n; j++) {
			int count = 1;
			for (int k = j + 1; k < n; k++) {
				if (arr[j] == arr[k]) {
					count++;
					fr[k] = visited;
				}
			}
			if (fr[j] != visited) {
				fr[j] = count;
			}
		}
		System.out.println("elements" + "    " + "frequency");
		for (int f = 0; f < fr.length; f++) {
			if (fr[f] != visited) {
				System.out.println(arr[f] + "   ||  " + fr[f]);
			}
		}
	}
}
