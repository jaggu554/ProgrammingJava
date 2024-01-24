import java.util.Scanner;
public class AscendingTA5 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int temp=0;
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		for(int j=0;j<n;j++) {
			for(int k=j+1;k<n;k++) {
				if(arr[j]>=arr[k]) {
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
					
				}
			}
			System.out.print(arr[j]+" ");
		}
		
	}

}
