import java.util.*;
class DigitSum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numbere : ");
		int n = sc.nextInt();
		int sum = 0;
		while(n!=0){
			int d = n%10;
		    sum +=d;
		    n/=10;
		}
		System.out.println("digit sum is : "+sum);
	}
}