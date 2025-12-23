// WAP using switchcase for grade and its abbrevation
import java.util.Scanner;

class Q14 {
      public static void main(String[] args){
      	Scanner sc=new Scanner(System.in);
      	char c = sc.next().charAt(0);
      	switch(Character.toUpperCase(c)){
      	case 'A' :
      		System.out.println("Excellent !");
      		break;
      	case 'B' :
      		System.out.println("Good");
      		break;
      	case 'C' :
      		System.out.println("Fair");
      		break;
      	case 'D' :
      		System.out.println("Pass");
      		break;
      	case 'F' :
      		System.out.println("Fail");
      		break;
      	default :
      		  System.out.println("Invalid");
      		

      	}

      }	
}