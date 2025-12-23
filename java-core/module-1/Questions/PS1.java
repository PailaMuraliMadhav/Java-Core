//Problem Statement : Employee Access & salary Processing system
import java.util.*;

class PS1{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter id :");
	int id = sc.nextInt();
	sc.nextLine();
		System.out.println("Enter Name :");
	String name = sc.nextLine();
		System.out.println("Enter AGe :");
	int age = sc.nextInt();
	System.out.println("Enter 1.IT , 2.HR, 3.Finance");
	int dept = sc.nextInt();
		System.out.println("Enter salary :");
	double sal = sc.nextDouble();
	int r =0;

	if(age < 21 ){
		System.out.println("Employee not eligible to work.");
		return;
	}
	
	else{
		System.out.println("elgible!");
	}
	

	switch(dept){
	case 1 :
		System.out.println("Enter 1.Devloper , 2.Tester");
		 r = sc.nextInt();
		switch(r){
		case 1 :
			System.out.println("Developer");
			break;
		case 2 : 
             System.out.println("Tester");
             break;
        default:
        	System.out.println("Invalid");

		}
		break;
	case 2 :
				System.out.println("Enter 3.Recrutier , 4.Payroll");
		r = sc.nextInt();
		switch(r){
		case 3 :
			System.out.println("recruiter");
			break;
		case 4 : 
             System.out.println("payroll");
             break;
        default:
        	System.out.println("Invalid");

		}
		break;
	case 3 :
		System.out.println("Enter 5.Accountant , 6.auditor");
		 r= sc.nextInt();
		switch(r){
		case 5 :
			System.out.println("Accountant");
			break;
		case 6 : 
             System.out.println("Auditor");
             break;
        default:
        	System.out.println("Invalid");

		}
		break;

        default:
        	System.out.println("Invalid input.");
	}
	double finals = 0;
    // final salary = basic +(basic * 30% /100)
	if(dept == 1 && r == 1 ){
		finals = sal+(sal * 0.30);
		System.out.println("Final Salary : "+finals);
	}
	else if(dept == 1 && r == 2 ){
		 finals = sal+(sal * 0.25);
		System.out.println("Final Salary : "+finals);
	}
	else if(dept == 2 && r == 3 ){
		 finals = sal+(sal * 0.20 );
		System.out.println("Final Salary : "+finals);
	}
	else if(dept == 2 && r == 4 ){
	     finals = sal+(sal * 0.22 );
		System.out.println("Final Salary : "+finals);
	}
	else if(dept == 3 && r == 5 ){
		 finals = sal+(sal * 0.28 );
		System.out.println("Final Salary : "+finals);
	}
	else if(dept == 3 && r == 6 ){
		 finals = sal+(sal * 0.26 );
		System.out.println("Final Salary : "+finals);
	}
	else{
		System.out.println("Invalid");
	}
      

         String access = " ";
     System.out.println(finals);
          if(finals >= 60000 && dept == 1){
     	access = "Admin Access";

     }
     else if(finals >= 60000 && (dept == 2 || dept == 3)){
     	access ="MAnager Access";

     }
     else{
     	access ="Employee Access";
     }

     System.out.println(id);
     System.out.println(name);
     System.out.println(dept);
     
     System.out.println(access);
     System.out.println(sal);




}	
}