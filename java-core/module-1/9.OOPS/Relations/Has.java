class Address {
	String city,state;
	public Address(String city,String state){
		this.city=city;
		this.state=state;
	}
	public void add(){
				System.out.println(city+" "+state);
	}
}
class Std {
	int id;
	String name;
	Address address ;
	public Std(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display(){
		System.out.println(id);
		System.out.println(name);
		// System.out.println(address.city+" "+address.state);
		address.add();
	}
}
class Has {
	public static void main(String[] args) {
		Address ad = new Address("Phagwara","Punjab");
		Std s = new Std(1,"Murali",ad);
		s.display();

		
	}
	
}