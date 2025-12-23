// WAP to perform arithmatic ooperations using switch 

import java.util.*;

class  Q15 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter : ");
		int n = sc.nextInt();
		switch(n){
		case 1 :
			System.out.println("Enter : ");
			int a=sc.nextInt();
			switch(a){
			case 1 : 
				System.out.println("Enter 1 : ");
				int g = sc.nextInt();
				System.out.println("Enter 2 : ");
				int h = sc.nextInt();
				System.out.println(g+h);
			break;
		    case 2 :
		        System.out.println("Enter 1 : ");
				int o = sc.nextInt();
				System.out.println("Enter 2 : ");
				int p = sc.nextInt();
				System.out.println("Enter 3 : ");
				int q = sc.nextInt();
				System.out.println(o+q+p);
			break;
		    case 3 :
		        System.out.println("Enter 1 : ");
				int r = sc.nextInt();
				System.out.println("Enter 2 : ");
				int s = sc.nextInt();
				System.out.println("Enter 3 : ");
				int t = sc.nextInt();
				System.out.println("Enter 4 : ");
				int u = sc.nextInt();

				System.out.println(r+s+t+u);
			break;



			}
			break;
		}
	}

}