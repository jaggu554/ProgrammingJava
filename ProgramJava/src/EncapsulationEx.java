
public class EncapsulationEx {
public static void main(String[] args) {
	Area a1=new Area(12,23);
	a1.getArea();
	
}
}
class Area{
	int length;
	int breadth;
	Area(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	public void getArea() {
		int area=breadth*length;
		System.out.println("Area :"+ area);
	}
}
