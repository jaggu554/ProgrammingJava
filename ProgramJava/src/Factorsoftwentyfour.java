
public class Factorsoftwentyfour {
	public static int  factors(int n) {
		
		int count=1;
		//count 1 is used because every number itself is a factor
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		return count;
		
		
	}
	public static void main(String[] args) {
		System.out.println(factors(168));
	}

}
