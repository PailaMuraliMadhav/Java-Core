// check if char is digit or not 
import java.util.*;

class Q3 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a char : ");

	char c = sc.next().charAt(0);
    if(c >='0' && c <='9'){
         System.out.println(c + " is Digit");

    }
    else{
    	System.out.println(c + " is Not Digit");
    }
}
}