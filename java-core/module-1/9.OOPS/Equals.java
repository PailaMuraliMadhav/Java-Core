class Equals {
	int id;
	String name;
	public Equals(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj){
		Equals e = (Equals) obj;
		return this.id== e.id && this.name==e.name;
	}
	public static void main(String[] args) {
		Equals e1 = new Equals(1,"Murali");
		Equals e2 = new Equals(1,"Murali");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
	}
}