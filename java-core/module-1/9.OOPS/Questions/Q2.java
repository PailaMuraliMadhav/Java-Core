// WAJP to excecute instance initalizer block and exceute non static method before the excecution of main 
class Q2 {
	//non static block
	{
		System.out.println("this is a instance initializer block!");
		test();
	}
	// non-static method
	public void test(){
		System.out.println("non static method");
	}
	// static block 
	static {
	System.out.println("static bolck excecuted");
	Q2 ref = new Q2();
	//or
	// ref.test();
		

	}
	


	public static void main(String[] args) {
		System.out.println("main st");
		
		System.out.println("main end");

		
	}
}
// o/p
/*
static bolck excecuted
this is a instance initializer block!
non static method
main st
main end
*/