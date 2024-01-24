import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestsc {
	public int solve(int A[]) {
		int n=A.length;
		Arrays.sort(A);
		if(n>=2) {
			return A[n-2];
		}else {
			return -1;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		SecondLargestsc G=new SecondLargestsc();
		System.out.println(G.solve(arr));
		
		
	}

}
