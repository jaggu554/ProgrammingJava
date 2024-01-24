
public class Aggregation {

	public static void main(String[] args) {
		

		Address address1=new Address("atp",5275001,"India");
		Employee1 e=new  Employee1("Jaggu",554,address1);
		e.show();
	}

}
class Address{
	String country;
	int zip;
	String city;
	Address(String country,int zip,String city){
		this.country=country;
		this.zip=zip;
		this.city=city;
	}
}
class Employee1{
	String name;
	int id;
	Address address;
	Employee1(String name,int id,Address address){
		this.name=name;
		this.id=id;
		this.address=address;
		
	}
	
	void show() {
		System.out.println(id+" "+name+" "+address.city+" "+address.country+" "+address.zip);
	}
}
