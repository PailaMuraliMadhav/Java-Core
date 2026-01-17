import java.util.*;
class NotEligibleException extends Exception{
	public NotEligibleException(String msg){
		System.out.println(msg);
	}
}

class ThrowsExcep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age :");
		int age = sc.nextInt();
		try{
			eligibleForVoting(age);
		}
		catch(NotEligibleException e){
			e.printStackTrace();
		}
		System.out.println("main end");
		
	}
	public static void eligibleForVoting(int age) throws NotEligibleException {
		if(age >=18){
			System.out.println("you are eligible");
		}
		else{
			throw new NotEligibleException("your age is below 18");
		}
	}
}