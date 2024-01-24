import java.util.Scanner;

public class Equilbrium {
	public void solve(int[] A) {
		int n=A.length;
		int P[]=new int[n];
		P[0]=A[0];
		for(int i=1;i<n;i++) {
			P[i]=P[i-1]+A[i];
			//System.out.println(P[i]);
		}
		int sl=0;
		int rl=0;
		int f;
		int flag=0;
		for(f=0;f<n;f++) {
			if(f!=0) {
				sl=P[f-1];
				//System.out.println(sl);
				rl=P[n-1]-P[f];
				if(sl==rl) {
					//System.out.println(f);
					flag=1;
					break;
				}
			}
		}
		if(flag==1) {
			System.out.println(f);
		}else {
			System.out.println(-1);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int j=0;j<N;j++) {
			A[j]=sc.nextInt();
		}
		Equilbrium S=new Equilbrium();
		S.solve(A);//-7, 1, 5, 2, -4, 3, 0//1, 2, 3, 4, 5, 6, 13, 1, 2, 3, 4, 5, 6 ]
	}

}
