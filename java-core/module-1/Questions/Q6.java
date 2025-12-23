// WAP to calculate and display the grade of a student based on marks

import java.util.*;


class Q6 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		int m = sc.nextInt();

		if(m >= 90 ){
			System.out.println("Grade A");
		}
		else if( m>= 75 && m < 90){
			System.out.println("Grade B");
		}
		else if(m >= 60 && m <75){
			System.out.println("Grade C");

		}
		else if(m >=40 && m < 60 ){
			System.out.println("Grade D");

		}
		else if(m < 40 ){
			System.out.println("Fail");

		}
		else{
			System.out.println("Invalid Marks");

		}
	}

}