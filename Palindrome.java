package com.payilagam.Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int number = sc.nextInt();
		
		sc.nextLine();
		 
		number = 121;
		int count = 0;
		int palno = 0;
		int input = number;
		
		while(number>0) {
			
			number = number/10;
			count++;
		}
		
		number = input;
		
        while(number>0) {
			
			int digit =number%10;
			number = number/10;
			palno += (int) (digit*(Math.pow(10,(count-1))));
			count--;
			
		}
        
        if (palno == input) {
        	
        	System.out.println("It is a palindrome number");
        
        }else {
        	
        	System.out.println("It is not a palindrome number");
        }
        
        sc.close();

	}

}
