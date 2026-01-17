class ThisU {
	int  a =21; // non-static variable
	// non-static method
	public void test(){
		System.out.println(a);//21
		System.out.println(this.a);//21
	}
	static int m = 10;
	public void t(){
		System.out.println(m);//10
		System.out.println(this.m);//10
		System.out.println(ThisU.m);//10

	}
	public static void main(String[] args) {
		System.out.println("start");

		ThisU obj = new ThisU();
		obj.test();
		obj.t();

		System.out.println("end");
		
	}
	
}