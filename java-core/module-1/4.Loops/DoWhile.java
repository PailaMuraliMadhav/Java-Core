// WAP to print number form the range (-111 to -101,123 to 113, 5 to -5, -10 to 0)
 class DoWhile {
 	public static void main(String[] args){
 		int n = -111;
 		do{
 			System.out.println(n);
 			n++;
 		}
 		while( n <= -101);
 		 		System.out.println("--------------");

        n = 123;
        do{
 			System.out.println(n);
 			n--;
 		}
 		while( n >= 113);
 		 		System.out.println("--------------");

         n = 5;
         do{
 			System.out.println(n);
 			n--;
 		}

 		while( n >= -5);
 		System.out.println("--------------");

 		n = -10;
 		 		System.out.println("--------------");

 		 		do{
 			System.out.println(n);
 			n++;
 		}
 		while( n <=0);
 	}


 }
 // WAP to print char from range(s to l,T to Z) using do while