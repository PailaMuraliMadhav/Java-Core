import java.util.*;

class StringQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				String s=sc.nextLine();
	String[] w = s.split(" ");
	for(int i=0;i<w.length;i++){
		if(i%3==0){
			System.out.print(w[i].replaceAll("[AEIOUaeiou]","%")+" ");
		}
		else if(i%3==1){
			System.out.print(w[i].replaceAll("[b-df-hj-np-zB-DF-HJ-NP-Z]","#")+" ");
		}
		else{
			System.out.print(w[i].toUpperCase()+" ");
		}
	}
		
	}
}