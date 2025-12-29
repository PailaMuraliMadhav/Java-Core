import java.util.*;
class ProductArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];
		int product = 1;
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter number at index: "+i+ " : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+ " ");
			product*=arr[i];
			}
			System.out.print("\n"+product);
		}
		
	}
	
