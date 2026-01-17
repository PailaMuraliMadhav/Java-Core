class Copy {
	int id;
	String name;
	public Copy(int id,String name){
		this.id= id;
		this.name = name;
	}
	public Copy(Copy obj){
		this.id = obj.id;
		this.name= obj.name;
	}
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Copy obj1 = new Copy(112,"Murali");
		Copy obj2 = new Copy(obj1);
		obj1.display();
		obj2.display();



		
	}
}