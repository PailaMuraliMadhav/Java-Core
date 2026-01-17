// Note : Every object is directly pointing towards class tatic area 

class P1 {
	static String user;

	public static void main(String[] args) {
		System.out.println("start");
		P1 ref1 = new P1();
		ref1.user = "Murali";//ref1->murali

		P1 ref2 = new P1();
		ref2.user = "madhav";//ref1->madhav,ref2->madhav

		P1 ref3 = new P1();
		ref3.user = "paila";//ref1->paila,ref2->paila,ref3->paila
		System.out.println(ref1.user);
		System.out.println(ref2.user);
		System.out.println(ref3.user);


	}
}