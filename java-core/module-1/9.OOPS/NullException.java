import java.util.*;
class NullException{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		System.out.print("Enter a : ");
		String a  ="";
		System.out.print("Enter b: ");
		String b = sc.nextLine();
		// int ans= a/b;
		System.out.println(a);
		System.out.println(b);
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