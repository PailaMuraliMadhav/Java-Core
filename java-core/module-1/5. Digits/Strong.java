// WAP to check if the number is strong of not
/*
145 strong
sum of factorial of each digit is equal to original number
5! +4! +1! = 145
*/
import java.util.*;

class Strong{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
 	System.out.print("Enter a num : ");
 	int n= sc.nextInt();
 	int sum = 0;
 	int org = n;
 	while(n!= 0){
 		int d= n%10;
 		int fact = 1;
 		for(int i=1 ;i<=d;i++){
 			fact *=i;
 		}
 		sum +=fact;
 		 			n/=10;

 	}
 	if(sum == org ){
 		System.out.println("Strong");
 	}
 	else{
 		System.out.println("Not strong");
 	}
 	
 }
	
}