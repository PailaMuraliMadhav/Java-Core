// Object is used to use non-static members inside static 
/*
className obj = new className();
*new is a keyword
new - we can create n number of object.
returns address of object.
*className is a non-primitive type to store address of object.





*/
class Object {
	int a =10;
	public static void main(String[] args) {
		System.out.println("Main start");
		// System.out.println(a);CTE
		// System.out.println(Object.a);CTE
		System.out.println(new Object());
		Object ob = new Object();
		System.out.println(ob);
		System.out.println(ob);
		System.out.println(ob.a);
				System.out.println("Main end");

	}
}