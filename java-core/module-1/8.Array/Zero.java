import java.util.*;
class Zero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int k = 0;
		for(int i=0;i<n;i++){
			if(arr[i] != 0){
				arr[k] = arr[i];
				k++;
			}
		}
		while(k < n){
			arr[k]  = 0;
			k++; 
		}
		for(int i=0;i<n;i++){
			System.out.print("\n"+arr[i]+" ");
		}
	}
}