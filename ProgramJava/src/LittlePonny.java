import java.util.Scanner;

/*Little Ponny is given an array, A, of N integers. 
 * In a particular operation, he can set any element of the array equal to -1.
 */

/*He wants your help in finding out the minimum number of operations required 
 * such that the maximum element of the resulting array is B.
 *  If it is not possible, then return -1.
 */
public class LittlePonny {
	public int reqOperations(int A[], int B) {
		int n = A.length;
		int flag = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] == B) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}
		}
		int count = 0;
		if (flag == 0) {
			return -1;
		} else {
			for (int j = 0; j < n; j++) {
				if (A[j] > B) {
					count += 1;
				}
			}

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int b=sc.nextInt();
		LittlePonny L=new LittlePonny();
		System.out.println(L.reqOperations(arr, b));
		
	}

}
