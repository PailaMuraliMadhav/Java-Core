import java.util.*;
class SecondLargest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];

				for(int i=0;i<arr.length;i++){
			System.out.print("Enter number at index: "+i+ " : ");
			arr[i] = sc.nextInt();
		}
				int max = arr[0];
				int second = arr[0];

		for(int i=0;i<arr.length;i++){
		// System.out.print(arr[i]+ " ");
			if(arr[i] > max){
				 second = max;
				max = arr[i];
			}

			}
						System.out.print("\n"+max);
						System.out.print("\n"+second);

		}
		
	}

