import java.util.Scanner;

public class Reversesc {
	public void reverseNumber(int arr[]) {
		int r=0;
		int l=arr.length-1;
		int temp;
		while(r<l) {
			temp=arr[r];
			arr[r]=arr[l];
			arr[l]=temp;
			r=r+1;
			l=l-1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		Reversesc r=new Reversesc();
		r.reverseNumber(A);
	}

}
