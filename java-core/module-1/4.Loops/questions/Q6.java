// WAP to return the number of prime numbers that are striclty less than n 
import java.util.*;
class Q6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		if(n <= 2 )return;

		for(int i =2;i<n;i++){
			if(n%i == 0 ){
				System.out.print(i + " ");
				c++;
			}
		}
		System.out.println(c);

	}

}