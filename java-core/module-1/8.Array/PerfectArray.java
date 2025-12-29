import java.util.*;
class PerfectArray {
	public static boolean perfect(int n){

		int sum = 0;
		if(n < 1 )return false;
		for(int i=1;i<=n/2;i++){
			if(n%i == 0){
				sum+=i;
			}
	}
				return sum == n ?true:false;


	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i= 0;i<arr.length;i++){
			System.out.print("Enter at i: "+i + " : ");
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			if(perfect(arr[i])){
			System.out.println(arr[i]+" is PErfect");
	}
	else{
		System.out.println(arr[i]+ " Not perfect");
	}
}
}
	
}