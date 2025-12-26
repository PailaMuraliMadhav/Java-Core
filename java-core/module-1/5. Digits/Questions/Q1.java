import java.util.*;
class Q1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int odd = 0;
		int even = 0;
		while(n!=0){
			int d = n%10;
			if(d%2 ==0){
			   even += d;
			}
			else{
				odd +=d;
			}
			n = n/10;

		}
		System.out.println("The product of even_sum and odd summ is : "+even*odd);

	}
	
}