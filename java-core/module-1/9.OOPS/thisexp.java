/*
non-static block :
a block which declared inside class area or global area wothout static  keyword is known as non static block.
also known as instance initializzer block.
it gets excecuted whenever we are creating an object.
**like constructor**
*/
class NonStatic {
	//class area or global area
	{
	// non-static block or instance initializer block
		System.out.println("New onject created for thisexp class");
}
	public static void main(String[] args) {
		System.out.println(" main start");
		thisexp ref1 = new thisexp();
		thisexp ref2 = new thisexp();
		thisexp ref3 = new thisexp();
		System.out.println("end");
		
	}
}