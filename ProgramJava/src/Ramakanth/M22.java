package Ramakanth;

import java.util.Scanner;

public class M22 {
	//printing the index value if the element is present in the array
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int searchKey=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int flag=0;
		int j;
		for( j=0;j<n;j++) {
			if(arr[j]==searchKey) {
				flag=1;
				break;
			}else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println(j);
		}else {
			System.out.println(-1);
		}
	}

}
