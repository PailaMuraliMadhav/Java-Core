import java.util.*;
class Q3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter :");
		int n = sc.nextInt();
		int outer = n%10;
		int inner = 0;
		n/=10;
		while(n > 10){
			int d = n%10;
			inner = inner +d;
			n/=10;
		}
		outer = outer+n;
		if(outer == inner){
		System.out.println("Xylem(1)");
}
else{
	System.out.println("Phloem(0)");

}
		
			}
	
}