class WhileLoop {
	public static void main(String[] args){
		// WAP to print number from range (-123 to -129 , 79-84, -110 to -100 , 0 to -9)
		int a = -123;
		while( a >= -129){
           System.out.println(a);
           a--;
		}
		a = 79;
		while( a <= 84){
			System.out.println(a);
			a++;
		}
		a = -110;
		while( a <= -100){
			System.out.println(a);
			a++;

		}
		a = 0;
		while(a >= -9){
			System.out.println(a);
			a--;
		}
	}
}