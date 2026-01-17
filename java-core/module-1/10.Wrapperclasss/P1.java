class P1{
	public static void main(String[] args) {
		int a  =10;
		// Boxing
		// Implicit
		Integer i =a;
		System.out.println("Implicit boxing : "+i);
		// Explicit
		Integer j = Integer.valueOf(a);
		System.out.println("Explicit boxing: "+j);
		Integer b = 10;
		int k=b;
		System.out.println("implicit Unboxing: "+k);
		int l = b.intValue();
		System.out.println("Explicit Unboxing: "+l);
	}
}