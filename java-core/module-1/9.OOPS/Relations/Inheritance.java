

class Father {
	static int a =10;
	public static void test(){
		System.out.println("Father class static method");
	}
	static{
		System.out.println("SIB father");
	}
}
class Son extends Father {
	static int b= 20;
	public static void demo(){
		System.out.println("Son class static method");
	}
	static{
		System.out.println("SIB Son");
	}
}
class Inheritance {
	static{
		System.out.println("SIB driver ");
	}
	public static void main(String[] args) {
System.out.println("MAin start");
// System.out.println(Father.a);
// Father.test();
// System.out.println(Son.a);
// Son.demo();
// ANS: 
// // SIB driver
// // MAin start
// // SIB father
// // 10
// // Father class static method
// // 10
// // SIB Son
// // Son class static method
// // Main end

// Son s = new Son();
// System.out.println(s.a);
// s.test();
// System.out.println(s.b);
// s.demo();
// ANS:
// SIB driver
// MAin start
// SIB father
// SIB Son
// 10
// Father class static method
// 20
// Son class static method
// Main end

System.out.println(Son.a);
Son.demo();
System.out.println(Son.b);
Father.test();
// ANS:
// SIB driver
// MAin start
// SIB father
// 10
// SIB Son
// Son class static method
// 20
// Father class static method
// Main end
System.out.println("Main end");
		
	}
}