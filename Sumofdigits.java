package com.payilagam.Programs;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int input = sc.nextInt();
		
		sc.nextLine();
		
		int digit=0;
		int total=0;
		
		while(input>0) {
			
			digit = input%10;
			total+=digit;
			input/=10;
			
		}
		
		System.out.println(total);
		
		sc.close();
		
	}

}
