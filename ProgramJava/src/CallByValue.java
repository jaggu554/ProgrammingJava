
public class CallByValue {
	int data =50;
	void change(int data) {
		data =data+100;
		System.out.println(data);
	}


	public static void main(String[] args) {
	
		CallByValue j1=new CallByValue();
		System.out.println("Before change"+j1.data);
		j1.change(500);
		System.out.println("After change "+j1.data);

	}

}
