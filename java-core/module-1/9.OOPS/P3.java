class P3 {
	public void test(){
		System.out.println("start");
		System.out.println(this);//456
		System.out.println("end");
	}
	public static void main(String[] args) {
		P3 ref1 = new P3();
		System.out.println(ref1);//123
		P3 ref2 = new P3();
		System.out.println(ref2);//456
		P3 ref3 = new P3();
		System.out.println(ref3);//789
		ref2.test();

	}
}