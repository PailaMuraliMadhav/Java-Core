class Mobile {
	String brand;
	int st;
	boolean is5g;
	public Mobile(){
		this.brand="unknown";
		this.st = 64;
		this.is5g= false;
	}
	public Mobile(String brand,int st,boolean is5g){
		this();
		this.brand= brand;
		this.st= st;
		this.is5g=is5g;

	}
	public static void main(String[] args) {
		Mobile mo = new Mobile("Mi",128,true);
		System.out.println(mo.brand);
		System.out.println(mo.st);
		System.out.println(mo.is5g);
	}
}