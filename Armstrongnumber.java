package com.payilagam.Programs;
import java.util.Scanner;

public class Armstrongnumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int input=sc.nextInt();
		
		sc.nextLine();
		
		int total=0;
		int testinput=input;
		
		while(testinput>0) {
			
			int digit=testinput%10;
			total+=(digit*digit*digit);
			testinput=testinput/10;
			
		}
		
		if (total==input) {
			
			System.out.println("This is an Armstrong Number");
		
		}else {
			System.out.println("This is not an Armstrong Number");
		}
		
		sc.close();
		
	}

}
