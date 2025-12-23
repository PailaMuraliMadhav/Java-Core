// WAP to find the factorail of all number ranging from 1 to 10 
import java.util.*;
class Q10 {
	public static void main(String[] args){
		// Scanner sc = new Scanner(System.in);
		int n = 10;
		int sum = 1;
		for(int i=1 ;i<=n ;i++){
			sum *= i;
			System.out.println("the factorial of: "+i +" = " + sum);
}

	}
}