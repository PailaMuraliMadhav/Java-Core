import java.util.*;
class PrimeArray {
	public static boolean prime(int n){
		if(n  < 2)return false;
		for(int i=2;i<=n/2;i++){
			if(n%i == 0){
				return false;
			}
	}
				return true;


	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i= 0;i<arr.length;i++){
			System.out.print("Enter at i: "+i + " : ");
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			if(prime(arr[i])){
			System.out.print(arr[i]+ " ");
	}
}
}
	
}