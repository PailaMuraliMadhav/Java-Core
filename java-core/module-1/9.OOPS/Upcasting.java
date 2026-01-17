class Father{
	int a =10;
}
class Son extends Father{
	int b=20;
}
public class Upcasting {
	public static void main(String[] args) {
		System.out.println("-------------------object of father store inside ffather class ref variable");
		Father obj = new Father();
		System.out.println(obj.a);
		// System.out.println(obj.b);//CTE
		System.out.println("--------Object of Son class store inside son class ref variable");
		Son obj2 = new Son();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println("----------Upcasting--------------");
		Father obj3 = new Son();
		System.out.println(obj3.a);
		// System.out.println(obj3.b);//CTE
		System.out.println("------------Downcasting");
		Son obj4 =  (Son)obj3;
		System.out.println(obj4.a);
		System.out.println(obj4.b);


		
	}
	
}