// WAP to find the factorail of all  odd numbers ranging from 10 to 1 
import java.util.*;
class Q11 {
	public static void main(String[] args){
		// Scanner sc = new Scanner(System.in);
		int n = 10;
		for(int i=n ;i>=1 ;i--){
			if(i%2 != 0){
				int sum = 1;
			
			for(int j=1 ;j<=i;j++){
			sum *= j;
		}
			System.out.println("the factorial of: "+i +" = " + sum);

}
}
	}
}