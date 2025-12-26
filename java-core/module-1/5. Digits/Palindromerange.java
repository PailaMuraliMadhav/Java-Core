// WAP to print all palindrome numbers from range 100 to 200
import java.util.*;
class Palindromerange{
public static void main(String[] args){
		for(int i=100;i<=200;i++){
int n= i;
int rev= 0;
while(n!=0){
	int d = n%10;
	rev = rev*10+d;
	n/=10;
}
if(rev == i){
	System.out.println(i);
}
		}


		}
		
}	
