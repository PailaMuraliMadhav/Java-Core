// WAP to print numbers from range( 1111 to 1121,1234 to 1223,-1111 to -1223,-1234 to -1223) using for loop
class ForLoop {
	public static void main(String[] args){
		int a;
		for(a = 1111;a <= 1121;a++){
			System.out.println(a);
		}
		System.out.println("---------");

		for(a = 1234;a >= 1223;a--){
			System.out.println(a);
		}
		System.out.println("---------");

		for(a = -1111;a >= -1121;a--){
			System.out.println(a);
		}
		System.out.println("---------");

				for(a = -1234;a <= -1223;a++){
			System.out.println(a);
		}
		System.out.println("---------");

   char ch ;
   for(ch = 'D';ch <= 'Z';ch++){
   	System.out.println(ch);
   }
   System.out.println("-----------------");
      for(ch = 'm';ch >= 'e';ch--){
   	System.out.println(ch);
   }
   System.out.println("-----------------");
      for(ch = 'z';ch >= 't';ch--){
   	System.out.println(ch);
   }
   System.out.println("-----------------");
      for(ch = 'r';ch <= 'x';ch++){
   	System.out.println(ch);
   }
   System.out.println("-----------------");
	}
}