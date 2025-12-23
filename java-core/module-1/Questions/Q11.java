// WAP to check day of week (if sat or sun -> weekend) else week day or invalid

import java.util.*;

class Q11 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day : ");
		String day = sc.nextLine();
        if(day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")){
        	System.out.println("Weekend");
        }
        else if(day.equalsIgnoreCase("Monday")|| day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") || day.equalsIgnoreCase("Friday")){
        	System.out.println("Weekday");
        }
        else{
        	System.out.println("Invalid input");
        }
	}

}