import java.util.Scanner;
class ExceptionBasic{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		System.out.print("Enter a : ");
		int a  =sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		int ans= a/b;
		System.out.println("ans : "+ans);
}
catch(Exception e ){   
	e.printStackTrace();
	System.out.println("Handled");
	}
	finally{
		System.out.println("Final block excecuted");
		sc.close();
	}

}
}