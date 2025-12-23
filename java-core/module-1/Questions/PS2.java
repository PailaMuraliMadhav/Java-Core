// Travel ticket booking   & fare processing system

import java.util.Scanner;


class PS2 {
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter ID :");
	int id = sc.nextInt();
	System.out.println("Enter Name :");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.print("Enter age :");
	int age = sc.nextInt();
	System.out.print("Enter 1.Bus, 2.Train 3.Flight :");
	int type = sc.nextInt();
	System.out.print("Enter Base Fare :");
	double fare = sc.nextDouble();
	System.out.print("Enter  is he GOvt Emp ?true or false :");
	boolean govt = sc.nextBoolean();

	if(age <5 ){
		System.out.println("Freeeeeee");
		return;
	}
	else if(age > 80){
		System.out.println("Medical Required!!");
		return ;
	}
	else{
		System.out.println("Continue Booking");
	}
    int t = 0;
    double total = 0;
	switch(type){
	case 1 : 
		System.out.println("1.sleeper 2.Seater");
        t = sc.nextInt();
        switch(t){
        case 1 : 
        	System.out.println("Sleeper");
        	total = fare*1.2;
        	break;
        case 2 :
        	System.out.println("Seater");
        	total = fare*1.0;
        	break;
        default :
        	System.out.println("invalid");

        }
        break;
       case 2 :
       	System.out.println("1.General 2.Sleeper 3.Ac");
        t = sc.nextInt();
        switch(t){
        case 1 : 
        	System.out.println("General");
        	total = fare*1.0;
        	break;
        case 2 :
        	System.out.println("Sleeper");
        	total = fare*1.3;
        	break;
        case 3 :
        	System.out.println("AC");
        	total = fare*1.6;
        	break;
        	        default :
        	System.out.println("invalid");

        }
        break;
    case 3:
        System.out.println("1.Economy 2.Business");
        t = sc.nextInt();
        switch(t){
        case 1 : 
        	System.out.println("Economy");
        	total = fare*2.5;

        	break;
        case 2 :
        	System.out.println("Business");
        	total = fare*3.5;
        	break;
        default :
        	System.out.println("invalid");

        }
        break;
	}
	double dis = 0;
	if(age >= 60){
		dis =  total*0.30;
		total = total- dis;
		System.out.println("Total after discount for Tatha : "+ total);

	}else if(age >= 5 && age <= 12){
		dis =  total*0.50;
		total = total- dis;
		System.out.println("Total after discount  Pillodu: "+ total);

	}
	else if(govt = true){
		dis = total*0.15;
		total = total-dis;
		System.out.println("total after discount for govt :"+ total);
	}
	else{
		System.out.println("NO Discount!");
	}


	System.out.println("Id is : "+id);
	System.out.println("Name is : "+name);
	System.out.println("Type of travel : "+type);
	System.out.println("Base Fare: "+fare);
	System.out.println("Final Fare : "+total);
	System.out.println("Total Discount : "+dis);
    	if(total >= 10000){
		if(type == 3){
			System.out.println("Status : Confirmed");
		}
		else{
			System.out.println("Status: Wating list");
		}
	}
	else{
		System.out.println("Status: Confirmed");
	}
	




}	
}