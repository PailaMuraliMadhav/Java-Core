class Static {
	static int a = 10;
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("direct :"+a);
		System.out.println("with className: "+Static.a);
		Static obj = new Static();
		System.out.println("with reference : "+obj.a);
		System.out.println("end");
		
	}
}