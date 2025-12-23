// WAP to check if the number is divisible by 3 and 5 or not
import java.util.*;


class Q4 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number: ");

	int a = sc.nextInt();
	if( a % 3 == 0 && a % 5 ==0 ){
		System.out.println("Divisible by 3 and 5 ");

	}
	else {
       System.out.println("Not divisible by 3 and 5 ");
	}

}
}