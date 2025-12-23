// accenture 2024 Question
import java.util.*;
class Q3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++){
            
			if(i% 3 == 0 && i% 5 == 0){

				System.out.println("fizzBuzz");
			}
			else if(i%3 == 0 && i%5 !=0){
				System.out.println("Fizz");
			}
			else if(i%3 != 0 && i% 5 == 0){
                System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}

}