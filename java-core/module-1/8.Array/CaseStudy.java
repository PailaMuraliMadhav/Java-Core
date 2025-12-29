import java.util.*;
class CaseStudy {
	public static void Avg(int[] temp){
		int sum = 0;
		double avg = 0;
		int n = temp.length;
		for(int i=0;i<temp.length;i++){
			sum+=temp[i];
			avg = (double)sum/n;

		}
		System.out.println("the average temp iss: "+avg);
	}
	public static void Avgsales(int[] sales){
		int sum = 0;
		double avg = 0;
		int n = sales.length;
		for(int i=0;i<sales.length;i++){
			sum+=sales[i];
			avg = (double)sum/n;

		}
	System.out.println("the total sales  iss: "+sum);

		System.out.println("the average sales iss: "+avg);
	}
	public static void main(String[] args) {
		int[] sales = new int[7];
		int[] temp = new int[7];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<sales.length;i++){
			System.out.print("Enter  SAles: "+i +" : ");
			sales[i] = sc.nextInt();
		}
		for(int i=0;i<temp.length;i++){
			System.out.print("Enter Temperature : "+i +" : ");
			temp[i] = sc.nextInt();
		}
		// Avg
	Avg(temp);
	int min = temp[0];
	int max= temp[0];
	// Min
	for(int i=0;i<temp.length;i++){
		if(temp[i] < min){
			min= temp[i];
		}
	}
	System.out.println("The min temp : "+min);

	// Max
		for(int i=0;i<temp.length;i++){
		if(temp[i] > max){
			max= temp[i];
		}
	}
			System.out.println("The max temp : "+max);
     // Hot days count
			int c = 0;
		for(int i=0;i<temp.length;i++){
		if(temp[i] > 30){
			c++;
		}
	}
	System.out.println("Number of hot days: "+c);
 // Total and Average Sales
	Avgsales(sales);
	// MAx and min sales
	// Min
	int mi = sales[0];
	int ma = sales[0];
	for(int i=0;i<sales.length;i++){
		if(sales[i] < mi){
			mi= sales[i];
		}
	}
	System.out.println("The min sales is: "+mi);

	// Max
		for(int i=0;i<sales.length;i++){
		if(sales[i] > ma){
			ma= sales[i];
		}
	}
	System.out.println("The max sales is: "+ma);
	// highest grosser
	int count = 0;
		for(int i=0;i<sales.length;i++){
		if(sales[i] > 100){
			count++;
		}
	}
			System.out.println("Sales > 100 is "+count);

	// Finding target
   System.out.print("Etnerb a target : ");
	int target = sc.nextInt();
	for(int i=0;i<sales.length;i++){
		if(sales[i] == target){
			System.out.println(sales[i]+ " fount at DAy: "+i );
		}

}
// update sales
System.out.print("Enter a value to update: ");
  int update = sc.nextInt();
	for(int i=0;i<sales.length;i++){
		if(i== update){
			i=update;
		}
System.out.println(sales[i]+ i);
}


	}
}