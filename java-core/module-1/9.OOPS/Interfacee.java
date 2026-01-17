// To acheive 100% abstraction

interface Father{
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

class Interfacee{
	public static void main(String[] args) {
		Father f = new Son();
		// Son s =  (Son)f();
		f.test();//Abstract OVerride
		System.out.println( f.add(4,5));//9
	}
}