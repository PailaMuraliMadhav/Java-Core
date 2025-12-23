import java.util.*;

class IFDMS {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");

		int a = sc.nextInt();
		if(a%2==0){
			System.out.println("Even");
		}
		if(a%2!=0){
			System.out.println("Odd");
		}

	}
}