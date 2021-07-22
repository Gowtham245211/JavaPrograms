package com.payilagam.Programs;

import java.util.Scanner;

class LeapYearCalculator{
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year :");
		
		int year = sc.nextInt();
		
		if (isleapyear(year)) {
			
			System.out.println("This is a leap year.");
		
		}else {
			
			System.out.println("This is not a leap year.");
		}
		
		sc.close();
		
	}
	
	public static boolean isleapyear(int year) {
		
		if (year<=1 || year>=9999) {
			
			System.out.println("Invalid Value");
			
			return false;
		
		} else {
			
			if (year%4==0 && year%100==0 && year%400==0) {
				
				return true;
			
			} else {
				
				return false;
			}
		}
		
	}
	
}
