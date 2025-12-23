// WAP to show use of switchcase
 import java.util.Scanner;


class Q13 {
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ");
		String f = sc.nextLine();
		switch(f.toLowerCase()){
		case "apple" :
			System.out.println("Apples are rich in fibre and vitamin C.");
			break;
		case "bananas" :
			System.out.println("Bananas are great source of protein");
			break;
		case "mangoes" :
			System.out.println("Mangoes are are King of Fruits !");
			break;
		case "oranges" :
			System.out.println("Oranges are packed with Vitamin C.");
			break;
		default :
			 System.out.println("Invalid");


		}



	}
	
}