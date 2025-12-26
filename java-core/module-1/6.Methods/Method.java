import java.util.*;
 class Method {
 	//global area
 	public static void power(){
 		System.out.println("screen on");
 		System.out.println("screen off");

 	}
 	public static void volume(){
 		System.out.println("increase");
 		System.out.println("decrease");

 	}
 	public static void add(int a,int b){
 		
 		int add = a+b;
 		System.out.println(add);
 		 	}

 	public static void main(String[] args){
 		//local area
 		Scanner sc = new Scanner(System.in);

 		System.out.println("main start");
 		add(10,20);
 		add(25,25);



 		System.out.println("main end");
 	}

 }