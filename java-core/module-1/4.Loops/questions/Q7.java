import java.util.*;

class Q7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum  =0;
		int org = n;
		for(int i=1 ;i< n ;i++){
			if(n%i == 0){
				sum +=i;
                System.out.print(i+ " ");
			}

		}
		System.out.println();
        if(sum == org ){
        	System.out.println("!Perfect");
        }
        else{
        	System.out.println("Not Perfect!" );

        }
	}
}