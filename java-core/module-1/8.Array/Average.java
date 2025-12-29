import java.util.*;
class Average{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("Etner : "+ i+ ": ");
			arr[i]= sc.nextInt();
		}
		int n = arr.length;
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum +=arr[i];

		}
		System.out.println(sum/n);
		}
	}
