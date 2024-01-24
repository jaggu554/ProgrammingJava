
public class ptshala1 {
	public void findIndex(int[] arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.print(i+" ");
				break;
			}
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==x) {
				System.out.print(i);
				break;
			}
		}
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,5,5,5,6,78,90};
	int x=5;
	ptshala1 p=new ptshala1();
	p.findIndex(arr, x);
}
}
