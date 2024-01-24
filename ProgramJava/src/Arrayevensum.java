
public class Arrayevensum {
	int arr[]= {1,2,3,4,5,6,7,8,9,10,2,5,6,4,7,8};
	int sum=0;
	
	public void PrintArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			sum=sum+arr[i];
			System.out.println(sum);
		}
	}
	}

	public static void main(String[] args) {
		Arrayevensum A1=new Arrayevensum();
		A1.PrintArray(A1.arr);
		
	}

	

}
