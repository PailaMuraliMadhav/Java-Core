// WAP to check wheather the given number is special number or not
/*
19 is special
1 9
sum is 1+9  = 10
product is 1* 9 = 9
10 + 9 =19 
19 = 19

*/
import java.util.*;

class SpecialNumber {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
     int n =sc.nextInt();
     int org = n;
     int sum = 0;
     int pro = 1;
     while(n!=0){
     	int d = n%10;
     	sum +=d;
     	pro *=d;
     	n/=10;
     }
     int gg= sum+pro;
     if(gg == org){
     	System.out.println(org + " is a Perfect number");
     }
     else{
     	System.out.println("Not a perfect");
     }

}	
}