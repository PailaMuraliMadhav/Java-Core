// WAP to check if the number is Niven number.
/*
24 is niven
sumof digit = 6
24 % 6 == 0
true

*/
import java.util.*;
class NivenNumber {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        int org = n;
        while(n != 0){
        	int d = n%10;
        	sum += d;
        	n/=10;
        }
        if(org%sum == 0){
        	System.out.println("True");
        }
        else{
        	System.out.println("False");
        }


	}

 }