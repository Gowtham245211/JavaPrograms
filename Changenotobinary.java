package com.payilagam.Programs;

import java.util.Scanner;

public class Changenotobinary {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int input = sc.nextInt();
		
		//sc.nextLine();
		
		String bin="";
		
		do {
			
			int rem = input%2;
			bin =  rem + bin;
			input = input/2;
			
			
		}while (input>0);
		
		System.out.println(bin);
		
		sc.close();
		
		
		
		
	}

}
