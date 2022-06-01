package com.Revature.Prasanth;
import java.util.Scanner;
import java.sql.*;
public class Services {
	public static void main(String[] args) throws SQLException {
	String p="y";
	String s = "y";
	String usern,passw;
	outer: while (p.equals("y")) {

	Scanner sc1 = new Scanner(System.in);
	System.out.println("........ WELCOME TO HOME TECHNICIAN AND SERVICES............");
	

	System.out.println("Please Enter The Login Details:");

	System.out.println("Enter Admin name: ");
	usern = sc1.nextLine();
	System.out.println("Enter Admin password: ");
	passw = sc1.nextLine();

	if(usern.equals("Prasanth") && passw.equals("Prasanth@143"))
	{
	System.out.println("your authentication is succefull");



	while (s.equals("y")) {
	System.out.println("SERVICES PROVIDED BY US");
	System.out.println("press 1 to choose CAR_WASHING");
	System.out.println("press 2 to choose ELECTRICIAN");
	System.out.println("press 3 to choose TV_REPAIR");
	System.out.println("press 4 to choose EXIT");

	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();

	book bb = new book();

	switch (i) {
	case 1: 
		bb.car_washing();
	    break;
	case 2:
		bb.electrician();
	    break;
	case 3: 
		bb.Tv_repair();
	    break;
	case 4:
		System.exit(0);
	default : 
		System.out.println("Wrong Choice");
		
	    break;
}
	System.out.println("Do you want to continue then press y/n");
	s = sc.next();
	if (s.equals("n"))
	{
	    
		System.out.println("******Session closed*******");

	    break outer ;
	}
	}
}
	else {
	System.out.println("INVALID. Please Enter Correct Details: ");
 	 p = sc1.next();
	 }
	}
  }
}


	
