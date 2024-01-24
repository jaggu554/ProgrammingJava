import java.util.Scanner;

public class RightRotateTA3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int b[]=new int[n];
		int no_rotates=3;
		for(int i=0;i<n;i++) {
			b[i]=input.nextInt();
		}
		for(int j=0;j<no_rotates;j++) {
			int k,Last=b[n-1];
			for( k=n-1;k>0;k--) {
				b[k]=b[k-1];
			}
			b[0]=Last;
		}
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
