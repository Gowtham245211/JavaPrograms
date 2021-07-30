package com.payilagam.Programs;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int input=sc.nextInt();
		
		sc.nextLine();
		
		int total=0;
		
		int testinput=input;
		int sqrvalue=(testinput*testinput);
		
		while(sqrvalue>0) {
			
			int digit=sqrvalue%10;
			total+=digit;
			
			sqrvalue=sqrvalue/10;
			
		}
		
		if (total==input) {
			
			System.out.println("This is a Neon Number");
		
		}else {
			System.out.println("This is not a Neon Number");
		}
		
		sc.close();
		

	}

}
