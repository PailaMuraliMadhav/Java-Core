import java.util.*;
class SecondSmallest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];

				for(int i=0;i<arr.length;i++){
			System.out.print("Enter number at index: "+i+ " : ");
			arr[i] = sc.nextInt();
		}
				int min = arr[0];
				int second = arr[0];

		for(int i=0;i<arr.length;i++){
		// System.out.print(arr[i]+ " ");
			if(arr[i] < min){
				 second = min;
				min = arr[i];
			}

			}
						System.out.print("\n"+min);
						System.out.print("\n"+second);

		}
		
	}
	
