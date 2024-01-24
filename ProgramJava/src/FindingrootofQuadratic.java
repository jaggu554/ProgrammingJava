
public class FindingrootofQuadratic {
public static void main(String[] args) {
	double r1,r2,a=12,c=25,rp,b=13,ip,D,j;
	
	D=(Math.pow(b, 2)-4*a*c);
	if(D>=0) {
		r1=(-b+Math.sqrt(D))/2*a;
		r2=(-b-Math.sqrt(D))/2*a;
		System.out.println("the square roots of r1 and r2:"+r1+" "+r2);
	}else {
		rp=-b/2*a;
		ip=Math.sqrt(-D)/2*a;
		
		
	}
	
	
}
}
