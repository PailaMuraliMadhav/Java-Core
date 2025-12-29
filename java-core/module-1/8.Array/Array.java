import java.util.*;
class Array {
	 public static void main(String[] args) {
	 		 	Scanner sc= new Scanner(System.in);
	 	int[] arr = {1,2,3,4,5};
	 	System.out.println(arr.length);
	 	System.out.println(arr[0]);
	 	// System.out.println(arr[5]);  .ArrayIndexOutOfBoundsException
	 	for(int i=0;i<arr.length;i++){
	 		System.out.print(arr[i]+ " ");
	 	}
	 	System.out.println();
	 	int[] arr2 = new int[5];
	 	for(int i=0;i<arr2.length;i++){
	 		System.out.print("enter value at : "+i+ " : ");
	 		arr2[i]= sc.nextInt();
	 	}
	 		 	for(int i=0;i<arr2.length;i++){
	 		System.out.print(arr2[i]+ " ");
	 	}




	 	
	 }
}