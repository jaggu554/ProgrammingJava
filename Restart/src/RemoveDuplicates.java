import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	/* this program is find the sorted array
	public static int removeDuplicates(int a[], int n) {
		if (n==0 || n==1){  
            return n;  
        }  
		int j = 0;
		int[] temp = new int[n];
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}

		}
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
			System.out.println(a[i]);
		}
		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int length=RemoveDuplicates.removeDuplicates(arr, size);
		
		/*for (int k = 0; k < length; k++) {
			System.out.print(arr[k] + " ");
		}
		*/
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		for(int i=0;i<j;i++) {
			System.out.println(arr[i]);
		}

	}

}
