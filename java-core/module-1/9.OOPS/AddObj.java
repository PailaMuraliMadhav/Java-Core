//WAJP to create  a static method which will return address of  a object ?

class AddObj {
	 static int id=10;
	public static void display(){
		System.out.println(id);
		System.out.println(AddObj.id);
	}

	public static void main(String[] args) {
		AddObj obj = new AddObj();
		obj.display();
		obj.display(obj.id);
	}
	
}