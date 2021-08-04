package com.payilagam.Programs;
import java.util.Scanner;


public class Largestprime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int input = sc.nextInt();
		
		sc.nextLine();
		
		int prime = 0;
		
		int divisor = 2;
		
		int count = 0;
		
		
		while(input>divisor) {
			
			if (input%divisor==0) {
				
				int number = 0;
				
				while(number<divisor) {
					
					number++;
					
					if(divisor%number == 0) {
						
						count++;
					}
					
			    }
				
				if(count==2) {
					
					prime = divisor;
					count = 0;
				}
				
				
			}
				
			divisor++;
		}
		
		System.out.println(prime);
		
		sc.close();
		
	}

}
