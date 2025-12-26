// Check if a number is abduct number or not
import java.util.*;
class Q2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter :");
		int n = sc.nextInt();
		int org = n;
		int sum = 0;
		for(int i=1;i<n;i++){
			if(n%i == 0){
				sum+=i;
			}
		}
		if(sum > org){
			System.out.println("yes its Abduct number");
		}
		else{
			System.out.println("No its not abduct number");
		}
	}
	
}