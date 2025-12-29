import java.util.*;
class EvenArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter number at index: "+i+ " : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2 ==0){
				System.out.print(arr[i]+ " ");
			}
		}
	}
	
}