import java.util.*;
class Large{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("Etner : "+ i+ ": ");
			arr[i]= sc.nextInt();
		}
		int n = arr.length;
		int g = arr[n-1];
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] > arr[i+1] && arr[i] > arr[i+2]){
				System.out.print(arr[i]+ " ");

			}
			System.out.print(g);

		}
	}
	}
	// *****
	// Incomeplte 
