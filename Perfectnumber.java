package com.payilagam.Programs;

import java.util.Scanner;

public class Perfectnumber {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int input=sc.nextInt();
		
		sc.nextLine();
		
		int divisor=0;
		
		int total=0;
		
		 
			while(divisor<input) {
				
			   divisor++;
				
				if (divisor==input) {
					
					break;
				}
			
			   if(input%divisor==0) {
				
				  total+=divisor;
				
			   }
			
			}
			
	    if (total==input) {
			
			System.out.println("It is a perfect number");
		
	    }else {
			
			System.out.println("It is not a perfect number");
		}
		
		
		sc.close();
		

	}

}
