import java.util.*;
class FiboCheck {
	public static void part(int n,int m){

		int a= 0,b=1;
		for(int i=1;i<=n;i++){
			if(m == a){
				System.out.println(a);
				System.out.println("Number is present");
				break;
			}

			 System.out.print(a+ " ");
			int c = a+b;
			a=b;
			b=c;
		

		}

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		System.out.print("Enter M to find : ");
		int m = sc.nextInt();
		part(n,m);




	}
	
}