import java.util.Scanner;

public class Cap {
public static int countFactors(int n) {
	int count=0;
	for(int i=1;i*i<=n;i++) {
		
		if(n%i==0) {
			if(i==n/i) {
				count=count+1;
			}else{
				count=count+2;
			}
		}
		
	}
	return count;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	System.out.println(countFactors(N));
}
}
