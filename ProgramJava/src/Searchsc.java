import java.util.Scanner;

public class Searchsc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
	    for(int i=0;i<T;i++) {
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int j=0;j<N;j++) {
			arr[j]=sc.nextInt();
		}
		int B=sc.nextInt();
		int flag=0;
		for(int k=0;k<N;k++) {
			if(arr[k]==B) {
			 flag=1;
			 break;
			}else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
		
	}

}
