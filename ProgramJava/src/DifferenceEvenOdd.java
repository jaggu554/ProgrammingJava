import java.util.Arrays;
import java.util.Scanner;

public class DifferenceEvenOdd {
	public int solve(int ar[]) {
		int n=ar.length;
		int Ecount=0;
		int Ocount=0;
		
		for(int i=0;i<n;i++) {
			if(ar[i]%2==0) {
				Ecount++;
			}else {
				Ocount++;
			}
		}
		int Ear[]=new int[Ecount];
		int Oar[]=new int[Ocount];
		for(int i=0;i<n;i++) {
			if(ar[i]%2==0) {
				Ear[i]=ar[i];
			}else {
				Oar[i]=ar[i];
			}
		}
		Arrays.sort(Ear);
		Arrays.sort(Oar);
		for(int j=0;j<Ear.length;j++) {
			System.out.println(Oar[j]);
		}
		
		//System.out.println(Oar[0]);
		return Ear[Ear.length-1]-Oar[0] ;
	}
public static void main(String[] args) {
	Scanner fc=new Scanner(System.in);
	int N=fc.nextInt();
	int arr[]=new int[N];
	for(int i=0;i<N;i++) {
		arr[i]=fc.nextInt();
	}
	DifferenceEvenOdd EO=new DifferenceEvenOdd();
	System.out.println(EO.solve(arr));
	
}
}
