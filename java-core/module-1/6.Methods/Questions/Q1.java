class Q1 {
	public static void greet(){
		System.out.println("Hello");
	}
		public static void greet(String name){
		System.out.println("Hello "+name +"!");
	}
		public static void greet(String name,int age){
		System.out.println("Hello "+ name + " your age is: "+age);
	}
	public static void main(String[] args){
		greet();
		greet("Murali");
		greet("Murali",21);

	}
	
}