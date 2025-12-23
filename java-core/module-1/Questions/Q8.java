// WAP to check the given muber is negative ,positive or zero 
import java.util.*;

class Q8 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter : ");
	int n = sc.nextInt();
	if( n > 0 ){
		System.out.println( n+ "is Posittive");
	}else if(n == 0 ){
		System.out.println(n + "is Zero");

	}
	else {
		System.out.println(n + "is Negative");
}
}
}