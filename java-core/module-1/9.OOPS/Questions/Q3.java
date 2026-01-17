class Q3 {
	int id;
	String name,cn;
double per;
public Q3(){
	this.id =3;
	this.name = "murali";
	this.per = 80.5;
	this.cn = "LPU";
}
	public Q3(int id){
		this.id= id;
	}
	public Q3(String name){
		this.name = name;
	}
	public Q3(double per){
		this.per=per;
	}
	public Q3(int id,String name){
		this.id= id;
		this.name=name;
	}
	public Q3(int id,double per){
		this.id=id;
		this.per=per;
	}
	public Q3(String name,double per){
		this.name=name;
		this.per= per;
	}
	public Q3(int id,String name,double per){
		this.id= id;
		this.name = name;
		this.per=per;
	}
	public static void print(Q3 s){
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.per);
		System.out.println(s.cn);






	}
	public static void main(String[] args) {
		Q3 o1 = new Q3();
		Q3 o2 = new Q3(3);
		Q3 o3 = new Q3("paila");
		Q3 o4 = new Q3(80.3);
		Q3 o5 = new Q3(23,"paila");
		Q3 o6 = new Q3(24,80);
		Q3 o7 = new Q3("Murali",90);
		Q3 o8 = new Q3(13,"Madhav",85);
		Q3 o9 = new Q3();

		Q3.print(o1);
		


		
	}
}