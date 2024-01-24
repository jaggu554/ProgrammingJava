
public class Arraysort {
	public static void main(String[] args) {
		int[] arr= {9,8,4,5,1,10,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length && i!=j;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(int w=0;w<arr.length;w++) {
			System.out.println(arr[w]);
		}

	}

}
