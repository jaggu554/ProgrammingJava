import java.util.Scanner;
public class MaxNoInMatrix {
	public static void maxNo(int mat[][],int n) {
		int max=mat[0][0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]>max) {
					max=mat[i][j];
				}
			}

		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int size=in.nextInt();
		int arr[][]=new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=in.nextInt();
			}
		}
		MaxNoInMatrix.maxNo(arr,size);
		
	}

}
