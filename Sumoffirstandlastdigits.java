package com.payilagam.Programs;

import java.util.Scanner;

public class Sumoffirstandlastdigits {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int number = sc.nextInt();
		
		sc.nextLine();
		
		int count=0;
		int input = number;
		
        while(number>0) {
			
			number = number/10;
			count++;
		}
        
        int sum = 0;
        number = input;
				
	    int lastdigit = number%10;
		int firstdigit = (number)/((int)(Math.pow(10,(count-1))));
		sum = firstdigit + lastdigit;
		
		
		System.out.println("The sum of first and last digits are " + sum);
		
		sc.close();
	}

}
