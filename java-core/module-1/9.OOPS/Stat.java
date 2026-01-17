class Stat {
	int a = 5;
	public void test(){
		System.out.println(a);
		int a = 25;
		System.out.println(a);

	}
	public static void main(String[] args) {
		Stat obj = new Stat();
		obj.test();
				
	}
}