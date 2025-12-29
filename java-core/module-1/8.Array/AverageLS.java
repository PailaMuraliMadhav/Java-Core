import java.util.*;
class AverageLS{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter : "+ i+ ": ");
			arr[i]= sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		int c = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] < min ){
				min = arr[i];
			}
			if(arr[i] > max){
				max= arr[i];
			}
		}
System.out.println(min);
System.out.println(max);

		for(int i=0;i<arr.length;i++){
			if(arr[i] == max){
				c++;
			}
		}
double avg = (min+(max*c))/(c+1);
System.out.println(avg);
		}
	}
