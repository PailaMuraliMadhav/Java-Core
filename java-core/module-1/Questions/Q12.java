// WAP to check if a year is leap year
import java.util.*;

class Q12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter : ");
		int n= sc.nextInt();
		if(( n % 4 == 0 || n % 100 != 0)&& (n% 400 == 0 )){
			System.out.println("Leap year");

		}
		else{
			System.out.println("Not leap year");
					}
	}
}