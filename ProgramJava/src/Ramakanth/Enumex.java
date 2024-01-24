package Ramakanth;

public class Enumex {
public static void main(String[] main) {
	System.out.println("The size of piza is  "+Size.SMALL.getSize());
}
}
enum Size{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	public String getSize() {
		switch(this) {
		case SMALL:
			return "small";
		case MEDIUM:
			return "medium";
		case LARGE:
			return "large";
		case EXTRALARGE:
			return "extralarge";
			default:
				return null;
		}
	}
}
