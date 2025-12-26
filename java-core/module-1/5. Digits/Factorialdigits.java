 // WAP to Write FActorail of all digits
import java.util.*;
 class Factorialdigits{
 	public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
 	System.out.print("Enter a num : ");
 	int n= sc.nextInt();
 	
 	while(n!= 0){
 		int d= n%10;
 		int fact = 1;
 		for(int i=1 ;i<=d;i++){
 			fact *=i;
 		}
 		
 		 			System.out.println(fact);
 		 			n/=10;

 	}
 	
 }
}