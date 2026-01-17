/*
non-static block :
a block which declared inside class area or global area wothout static  keyword is known as non static block.
also known as instance initializzer block.
it gets excecuted whenever we are creating an object.
**like constructor**
*/
class NonStatic {
	//class area or global area
	int a = 90;
	static int b =89;
	{
	// non-static block or instance initializer block
		System.out.println(a);
		System.out.println(b);
		System.out.println("New onject created for thisexp class");
}
	public static void main(String[] args) {
		System.out.println(" main start");
		NonStatic ref1 = new NonStatic();
		NonStatic ref2 = new NonStatic();
		NonStatic ref3 = new NonStatic();
		System.out.println("end");
		
	}
}
// to excecute instance initalizer block and exceute non static method before the excecution of main 