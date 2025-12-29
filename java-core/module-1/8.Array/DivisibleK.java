// WAJP to find count of elements which are divisible by k
import java.util.*;
class DivisibleK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter : "+i+ " : ");
			arr[i]=sc.nextInt();
		}
		int c = 0;
		System.out.print("Enter K : ");
		int k = sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(k%arr[i] == 0){
				c++;
			}

		}
		System.out.println("The count is : "+c);
	}
	
}