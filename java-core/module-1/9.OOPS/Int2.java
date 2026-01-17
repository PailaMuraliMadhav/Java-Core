
interface Father{
	static int a=10;
	int b= 20;
	abstract public void test();
	abstract public int add(int a,int b);
}
class Son implements Father{
	@Override
	public void test(){
		System.out.println("Absract override");
	}
	@Override
	public int add(int a,int b){
		return a+b;
	}
}

class Int2{
	public static void main(String[] args) {
		Father f = new Son();
		// Son s =  (Son)f();
		f.test();//Abstract OVerride
		System.out.println( f.add(4,5));//9
	}
}