
public class CopyArray {
	public static void main(String[] args) {
int arr1[]= {10,20,30,40,50};
int arr2[]=new int[arr1.length];
arr1[4]=90;
	
for(int i=0;i<arr1.length;i++) {
	arr2[i]=arr1[i];
}
System.out.println("Elements of original array");
for(int e:arr1) {
	System.out.println(e);
}
System.out.println("Elements of ew Array");
for(int i:arr2) {
	System.out.println(i);
}


}
}