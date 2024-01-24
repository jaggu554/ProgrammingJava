import java.util.Scanner;

public class LeftRotateTA3 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int arr[]=new int[n];
	int no_rotates=3;
	for(int i=0;i<n;i++) {
		arr[i]=input.nextInt();
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int i=0;i<no_rotates;i++) {
		int j,first;
		first=arr[0];
		for(j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
		}
		arr[j]=first;
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
