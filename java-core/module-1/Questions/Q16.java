// switch case for dept and role
import java.util.*;


class Q16 {
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter dept : ");
		String s = sc.nextLine();
		switch(s.toUpperCase()){
		case "IT" :
			System.out.println("Enter role 1.Devloper,2.Tester,3.Devops");
			System.out.println("Enter role : ");
			int r= sc.nextInt();
			switch(r){
			case 1 :
				System.out.println("Devloper");
				break;
			case 2 :
				System.out.println("Tester");
				break;
			case 3 :
				System.out.println("Devops");
				break;
			default : 
				System.out.println("Invalid");
			}
			break;
		case "HR" :
		    System.out.println("Enter role 1.Recruiter,2.HR excecutive,3.Payroll");
			System.out.println("Enter role : ");
			int t= sc.nextInt();
			switch(t){
			case 1 :
				System.out.println("REcruiter");
				break;
			case 2 :
				System.out.println("HR excecutive");
				break;
			case 3 :
				System.out.println("Payroll director");
				break;
			default : 
				System.out.println("Invalid");
			}
            break;
        case "Finance" :
        	System.out.println("Enter role 1.Accountant,2.Financial Analyst,3.auditor");
        	System.out.println("Enter role : ");
			int u= sc.nextInt();
			switch(u){
			case 1 :
				System.out.println("Accountant");
				break;
			case 2 :
				System.out.println("Financial Analyst");
				break;
			case 3 :
				System.out.println("Auditor");
				break;
			default : 
				System.out.println("Invalid");
		}
		break;
		case "Operations" :
			System.out.println("Enter role 1.OperationExcecutive,2.team Lead,3.MAnager");
        	System.out.println("Enter role : ");
			int v= sc.nextInt();
			switch(v){
			case 1 :
				System.out.println("Operation Executive");
				break;
			case 2 :
				System.out.println("Team Lead");
				break;
			case 3 :
				System.out.println("Manager");
				break;
			default : 
				System.out.println("Invalid");
			}
			break;
            default :
            	System.out.println("Invalid input");
	 	}

	}
}