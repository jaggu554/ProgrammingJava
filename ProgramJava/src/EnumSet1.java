import java.util.EnumSet;



public class EnumSet1 {
	enum Size{
		SMALL,MEDIUM,EXTRALARGE,LARGE;
	}
	public static void main(String[] args) {
		//EnumSet<Size> sizes =EnumSet.allOf(Size.class);
		//EnumSet<Size> sizes =EnumSet.noneOf(Size.class);
		//EnumSet<Size> sizes =EnumSet.range(Size.MEDIUM,Size.EXTRALARGE);
		EnumSet<Size> sizes=EnumSet.of(Size.MEDIUM);
		System.out.println("Enumset:"+sizes);
		
	}
}
