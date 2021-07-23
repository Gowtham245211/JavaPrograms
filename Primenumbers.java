package com.payilagam.Programs;
import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many prime numbers to print :");
		
		int numbers = sc.nextInt();
		
		countprime(numbers);
		
		sc.close();

	}
	
	public static void countprime(int numbers) {
		
	  System.out.println("The prime numbers are:");
	  
	  int count = 0;
		
	  for(int number=1;number<Integer.MAX_VALUE;number++) {
		  
		  int  divisibility = 0;
		  
		  for (int div=1; div<number;div++) {
			  
			  if(number%div==0) {
				  
				   divisibility++;
				   
			  }
		  
		  } if(divisibility==1) {
			  
			  System.out.println(number);
			  count++;
			  
			  if(count==numbers) {
				  
				  break;
			  }
	      }
		  
	   }

   }
}