// WAP to count  the number of perfect number from 1 to 100;
import java.util.*;

class Q8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum  =0;
		int org = n;
		int count = 0;
		for(int i=1 ;i< n ;i++){
			if(n%i == 0){
				sum +=i;
                System.out.print(i+ " ");
                count++;
			}

		}
		System.out.println();
        if(sum == org ){
        	System.out.println("!Perfect");
        	System.out.println(count);
        }
        else{
        	System.out.println("Not Perfect!" );

        }
	}
}