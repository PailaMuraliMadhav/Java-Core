import java.util.*;
class SecondSmallDigit {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numbere : ");
		int n = sc.nextInt();
		int small = 9;
		int sec = 9;
		while(n!=0){
			int d = n%10;			
			if(d < small){
              sec = small;
              small = d;
			}
			 else if(d > small && d < sec){
			 	sec = d;
			 }
		    n/=10;
		}
		System.out.println(sec);
		
	}
}