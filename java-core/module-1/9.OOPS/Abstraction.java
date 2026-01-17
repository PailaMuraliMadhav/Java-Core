abstract class Father{
	abstract public void test();
		abstract public int demo(int a,int b);

}
class Son extends Father{
	@Override
	public void test(){
		System.out.println("test method override");
	}
	@Override
	public int demo(int a,int b){
		return a+b;
	}
	public  void  d(){
		System.out.println("Demo child");
	}

}

class Abstraction{
	public static void main(String[] args) {
		// Father f = new Father();  cannot be instantiated
		Father f = new Son();
		f.test();
		System.out.println( f.demo(4,5));
		Son obj = (Son)f;
		obj.d();
		
	}
}