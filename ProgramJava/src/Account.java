
public class Account {
	int acco_no;
	String name;
	float amount;
	Account(int acco_no,String name,float amount){
		this.acco_no=acco_no;
		this.name=name;
		this.amount=amount;
	}
	void withdraw(int amt) {
		if(amount<amt) {
			System.out.println("Low balance");
		}else {
			amount=amount-amt;
			System.out.println("Amount withdrawn is "+amt);
		}
		
	}
	void deposit(int amt) {
		amount=amount+amt;
		System.out.println(amt+" deposited");
	}
	void balanceEnquiry() {
		System.out.println("Your balance amount is "+amount);
	}
	public static void  main(String[] args) {
		Account a=new Account(554,"Jagadeeswar reddy",50000);
		a.balanceEnquiry();
		a.deposit(10000);
		a.balanceEnquiry();
		a.withdraw(30000);
		a.balanceEnquiry();
		a.withdraw(40000);
		
	}
}
