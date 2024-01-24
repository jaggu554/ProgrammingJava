
public class RemoveDuplicate {
	int arr[]= {10,20,30,40,50,10,20,30,40,60,70,60,70};
	int myArray[]= new int[arr.length];
	int temp[];
	public  void remove() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					myArray[i]=arr[i];
					System.out.println(myArray[i]);
				}
				
			}
			
			
		}
		
	}
	

	public static void main(String[] args) {
		
	RemoveDuplicate R=new RemoveDuplicate();
	R.remove();
	
	}
}
