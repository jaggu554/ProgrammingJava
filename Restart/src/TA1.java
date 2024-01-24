import java.util.Scanner;

public class TA1 {
	public static void main(String[] args) {
		//copying the array elements into another array
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			arr1[i]=arr[i];
		}
		System.out.println();
		for(int j=0;j<n;j++) {
			System.out.print(arr1[j]+" ");
		}
		
	}

}
