package com.payilagam.Programs;
import java.util.Scanner;

public class Changebintono {
	
	public static void main(String [] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a binary number : ");
		 
		 int input = sc.nextInt();
		 
		 sc.nextLine();
		 
		 int count=0;
		 int total=0;
		 
		 while(input>0) {
			 
			 int digit = input%10;
			 input = input/10;
			 
			 if(digit == 1) {
				 
				 total += (power(2, count));
				 
			 }	 
			 
			 count++;
		 }
		 
		 System.out.println("The actual number is : " + total);
		 
			sc.close();
		 
    }
	
	public static int power(int no, int count) {
		
		int i = no;
		int value = 1;
		int loop = 1;
		
		if (count == 0) {
			
			return 1;
		}
		
		while(loop<=count) {
		
		value *= i;
		loop++;
		
		}
		
		return value;
		
	}
	

}


