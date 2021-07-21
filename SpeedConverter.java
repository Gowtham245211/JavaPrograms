package com.payilagam.Programs;
import java.util.Scanner;

public class SpeedConverter {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Kilometers per hour value: ");
		
		double kilometersPerHour = sc.nextDouble();
		
		printConversion(kilometersPerHour);
        
        
        sc.close();    
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		if (kilometersPerHour <= 0) {
			
			return -1;
			
		}else {
			
			
			return Math.round(kilometersPerHour/1.609);
			
		}
		
	}
	
	public static void printConversion(double kilometersPerHour) {
		
		 if (kilometersPerHour < 0)

	        System.out.println("Invalid Value");

	     else

	        System.out.println( kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

    }

}
