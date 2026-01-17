/*
Constructor -
* special type of non-static member
* because-
Constructor name is same as class NAme.
* similar to method but do not have any return type.
Note -
if method is returning any data we need not to specify what type of data method is returning.(Return type of method).

*Every constructor will have-

1. constructor chaining statement :
1> super() calling statment.
2> this() callign statement.
2. PLI : PRe loading instructions.
3. IIB : INtance initializer block.(non static)
4. UWS : USer written statements.

**Default Constructor-
if programmar has not written any constructor then by default JVM will add no argument constructor
during compile time.
**parameterized Constructor-
a constructor which has formal arguments.
*to initialize non-static variables(during object creation)
**copy constructor-

**private constructor-

*/

public class Cons {
	int id;
	String name ;
	public Cons(int id,String name){
		this.id=id;
		this.name = name;
		System.out.println(id+" "+name);
	}
	public Cons(){
		// default constructor
			System.out.println("Constrctor is called");
		}

	public static void main(String[] args) {
		System.out.println("main start");
		Cons ref2 =new Cons();
		Cons ref1 = new Cons(1,"murali");
		
		System.out.println("main end");

	}
}