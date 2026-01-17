class Level1{
	int a =13;
}
class Level2 extends Level1{
	int b = 26;
}
class Level3 extends Level2{
	int c = 39;
}
class Level4 extends Level3{
	int d = 52;
}
public class Candy {
	public static void main(String[] args) {
		System.out.println("--------LEvel 1");
		Level1 l1= new Level4();
		System.out.println(l1.a);
		// System.out.println(l1.b);//CTE
		System.out.println("---Level2");
		Level2 l2 = (Level2)l1;
		System.out.println(l2.a);
		System.out.println(l2.b);
		System.out.println("------LEvel 3");
		Level3 l3 = (Level3)l2;
		System.out.println(l3.a);
		System.out.println(l3.b);
		System.out.println(l3.c);
		System.out.println("-----Level4");
		Level4 l4 = (Level4)l3;
		System.out.println(l4.a);
		System.out.println(l4.b);
		System.out.println(l4.c);
		System.out.println(l4.d);


		
	}

}