import java.util.Scanner;

public class ScProblem {
	//Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). 
	//Check if any good pair exist or not.
	public int solve(int A[],int B) {
		int n=A.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					continue;
				}
				if(A[i]+A[j]==B) {
					//System.out.println(1);
					return 1;
					
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("Enter the b value");
		int b=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		ScProblem s=new ScProblem();
		System.out.println(s.solve(arr, b));
	}

}
