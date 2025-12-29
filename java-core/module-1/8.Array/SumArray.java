import java.util.*;
class SumArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter number at index: "+i+ " : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+ " ");
			sum+=arr[i];
			}
			System.out.print("\n"+sum);
		}
		
	}
	
