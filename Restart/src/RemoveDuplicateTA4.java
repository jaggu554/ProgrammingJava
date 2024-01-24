import java.util.Scanner;

public class RemoveDuplicateTA4 {
	//printing the duplicates present in the array
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int j=0;j<n;j++) {
			for(int j1=j+1;j1<n;j1++) {
				if(a[j]==a[j1]) {
					System.out.println(a[j1]);
				}
			}
		}
		
	}

}
