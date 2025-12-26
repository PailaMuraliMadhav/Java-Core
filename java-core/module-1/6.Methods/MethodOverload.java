import java.util.*;
 class MethodOverload {
 	//global area
 	public static int power(int a,int b){
 		return a+b;

 	}
 	public static int power(int a,int b,int c){
 		return a*b*c;

 	}
 	public static String power(String a,String b){
 		String c= a+b;
 		return c;
 		 	}

 	public static void main(String[] args){
 		//local area
 		System.out.println("main start");
 		System.out.println(power(2,3,4));
 		System.out.println(power(2,3));
 		System.out.println(power("Murali","PAila"));



 		System.out.println("main end");
 	}

 }