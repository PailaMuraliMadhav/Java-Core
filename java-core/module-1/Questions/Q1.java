// if a number is divisible by 7
import java.util.Scanner;

class Q1 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		if(a%7 == 0){
			System.out.println("Yes");

		}else{
			System.out.println("No");
					}
	}

}