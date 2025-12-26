class MultipleOperations {
	public static void findMax(int a,int b,int c){
		if(a > b && a> c){
			System.out.println(a + " is Max");
		}
		else if(b > c && b >a){
			System.out.println(b+ " is MAx");
		}
		else{
			System.out.println(c + " is MAx");
		}
	}
	public static void isPrime(int n){
	
			for(int i=2;i<=n/2;i++){
				if(n%i == 0 ){
					System.out.println("Not Prime");
					return;
				}
}
		System.out.println(" Prime");


	}

	public static void findMin(int a,int b,int c){
		if(a < b && a< c){
			System.out.println(a + " is Min");
		}
		else if(b < c && b < a){
			System.out.println( b+ " is Min");
		}
		else{
			System.out.println(c + " is Min");
		}
	}
	public static void isFibo(int n){
		int a = 0;
		int b =1;
		if(n <=1){
			System.out.println(1);
		}
		for(int i=1;i<=n;i++){
			System.out.print(a+ " ");
		int temp = a+b;
		a=b;
		b= temp;
		}


	}
	public static void main(String[] args){
		findMax(5,6,7);
		isPrime(13);
		isFibo(6);
			System.out.println();

		findMin(5,6,7);
	}
	
}