class Address {
	String city;
	public Address(String city){
		this.city = city;
	}
}
class Emp{
		int id;
		Address address ;
		public Emp(int id, Address address){
			this.id= id;
			this.address = address;
		}
		public Emp(Emp emp2){
			this.id= emp2.id;
			this.address= emp2.address;
		}
		void disply(){
			System.out.println(id+ " "+ address.city);
		}

	
	public static void main(String[] args) {
		Address o = new Address("US");
		Emp e1 = new Emp(123,o);
		Emp e2 = new Emp(e1);
		e2.address.city= "AP";
		e1.disply();
		e2.disply();


		
	}

}