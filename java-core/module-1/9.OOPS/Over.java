class Father{
	public  void test(){
		System.out.println("Father class test");
	}
	public  void demo(int a){
		System.out.println("Father class demo");
	}


}
class Son extends Father{
	@Override
		public  void test(){
		System.out.println("Son class test");
	}
	@Override
	public  void demo(int a){
		System.out.println("Son class demo");
	}


}
class Over{
	public static void main(String[] args) {
		System.out.println("***Father object stored in father ref ***");
		Father ref = new Father();
		ref.test();
		ref.demo(0);
		System.out.println("***Son object stored in son ref***");
		Son ref2 = new Son();
		ref2.test();
		ref2.demo(0);
		System.out.println("***upcasting****");
		Father ref3 = new Son();
		ref3.test();
		ref3.demo(0);
		System.out.println("***downcasting***");
		Son ref4 = (Son)ref3;
		ref4.test();
		ref4.demo(0);


		
	}
}
/*
Father object stored in father ref
Father class test
Father class demo
Son object stored in son ref
Son class test
Son class demo
upcasting
Son class test
Son class demo
downcasting
Son class test
Son class demo
*/