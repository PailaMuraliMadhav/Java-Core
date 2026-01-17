// Constsructor Chaining
// if we have n number of constructor we can use (n-1) this calling statements.
// this Constructor-
/*
* a constructor calling statement.
* it is used to call constructor of same class.
* if we have n number of constructor we can use (n-1) this calling statements.
* if any constructor have this() then that constructor does not have PLI and IIB.(Instance Initialization Block)()
//NOte -> Constrctor recursion is not possible as it will not create an object.
*if acheived it will give compile time error.
SIB (Static Initialization Block)
*/

 class Const{
 	int id;
 	String name;
 	double sal;
 	public Const(){
 		this.id = 123;
 		this.name = "Unknown";
 		this.sal = 50000.0;
 	}
 	public Const(int id){
 		this();//default constructor called
 		this.id= id;
 	}
 	public Const(String name){
 		this();//default called
 		this.name = name;

 	}

 	public static void main(String[] args) {
 		Const ref1 = new Const(1);//123 overwrittern by 1
 		System.out.println(ref1.id);//1
 		System.out.println(ref1.name);//unknown
 		System.out.println(ref1.sal);//50000.0

 		Const ref2 = new Const("Murali");//unkniwn overwritten by Murali
 		System.out.println(ref2.id);//123
 		System.out.println(ref2.name);//murali
 		System.out.println(ref2.sal);//50000.0
 		
 	}

 }