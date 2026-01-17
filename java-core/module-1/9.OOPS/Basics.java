 class Basics {

 	/*
 	* Fundamentals of OOPS :
 	* types of Global members : (static , non-static)
 	*/

 	static int a=10;
 	static int b =a;
 	// static method 
 	public static void test(){
 		System.out.println("start");
 		System.out.println(a);
 		System.out.println("end");
 	}
 	public static void main(String[] args) {
 		System.out.println("Main start");
 		System.out.println(a);
 		test();
 		int a = 23;
 		System.out.println(a);
 		System.out.println(Basics.a);

 		System.out.println("main end");

 	}
 }