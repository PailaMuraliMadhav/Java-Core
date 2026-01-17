// Variable shodowing
class Father{
	int a =10;
	static int b= 100;


}
class Son extends Father{
	int a  =20;
	static int b =200;

}
class Polymorphism{
	public static void main(String[] args) {
		System.out.println("Father object stored in father ref ");
		Father ref = new Father();
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println("Son object stored in son ref");
		Son ref2 = new Son();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		System.out.println("upcasting");
		Father ref3 = new Son();
		System.out.println(ref3.a);
		System.out.println(ref3.b);
		System.out.println("downcasting");
		Son ref4 = (Son)ref3;
		System.out.println(ref4.a);
		System.out.println(ref4.b);


		
	}
}
/*
Father object stored in father ref
10
100
Son object stored in son ref
20
200
upcasting
10
100
downcasting
20
200*/