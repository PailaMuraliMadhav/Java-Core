// WAP to check the given char is uppercase vowel,uppercase consonant, lowercase vowel or lowercase consonant
import java.util.*;

class Q7 {

public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter : ");
	char c = sc.next().charAt(0);
	if(c >= 'A' && c <= 'Z'){
	if( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
		System.out.println("Uppercase vowel");
	}else {
		System.out.println("Uppercase consonant");
	}
}
else{
	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
		System.out.println("Lowercase vowel");
	}
	else{
		System.out.println("Lowercase consonant");
	}
}
}
}
