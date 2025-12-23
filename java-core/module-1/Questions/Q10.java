// WAP to find the min number from three numbers
import java.util.*;

class Q10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		int a = sc.nextInt();
		System.out.println("Enter: ");
		int b = sc.nextInt();
		System.out.println("Enter: ");
		int c = sc.nextInt();

				if(a < b && a < c ){
				System.out.println(a + "is Min");
	
		}
		 else if(b < a && b <c ){
		 			System.out.println(b + "is Min");

		 }
		 else{
		 			System.out.println(c + " is Min");

		 }
	}
}