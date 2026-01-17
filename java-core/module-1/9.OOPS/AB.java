abstract class Father{
	static int a =10;
	int b = 20;
	 public static  void test(){
	 System.out.println("static menthod");
	 }

	 public void  demo(){
	 	System.out.println("non static method");
	 }
	 abstract public void abs();
	 static{
	 	System.out.println("Staic initializer block");
	 }
	 {
	 	System.out.println("instatnce initializer block");
	 }
	 public Father(){
	 	System.out.println("Constrctor");
	 }

}
class Son extends Father{
	@Override
	public void abs(){
		System.out.println("abstract method ");
	}
}

class AB{
	public static void main(String[] args) {
		// Father f = new Father();  cannot be instantiated
		Father f = new Son();
		System.out.println(f.a);
		System.out.println(f.b);
		f.test();
		f.demo();
		// System.out.println( f.demo(4,5));
	
		
	}
}