// WAP to check if the char is uppercase,lowercase,digit or special character
import java.util.*;

class Q5 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char : ");
		char c = sc.next().charAt(0);
		if(c >= '0' && c <= '9'){
			System.out.println(c +"is a digit ");
		}
		else if(c >='A' && c <= 'Z'){
			System.out.println(c+ "is Uppercase Char");
		}
		else if (c >= 'a' && c <= 'z'){
			System.out.println(c+ "is Lowercase Char");

		}
		
		else{
			System.out.println(c+ "is special char");

		}
	}

}