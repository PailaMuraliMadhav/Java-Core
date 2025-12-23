// WAp to check if the number is prime and count the number of values
import java.util.*;
class Q5 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int count = 0;
		if(n <= 1 )return ;
		for(int i=1;i<=n;i++){
			if(n% i == 0){
				count++;
			System.out.print(i+ " ");
			}
		}
		System.out.println();
			System.out.println(count);
			if(count == 2 ){
				System.out.println("Prime");
			}
			else System.out.println("Not prime");
		
	}
}

