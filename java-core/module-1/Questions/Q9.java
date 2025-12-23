// WAP to find the max number from three numbers

import java.util.Scanner;

class Q9 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		int a = sc.nextInt();
		System.out.println("Enter: ");
		int b = sc.nextInt();
		System.out.println("Enter: ");
		int c = sc.nextInt();

		if(a > b && a > c ){
				System.out.println(a + "is MAx");
	
		}
		 else if(b > a && b >c ){
		 			System.out.println(b + "is MAx");

		 }
		 else{
		 			System.out.println(c + " is MAx");

		 }

	}

}