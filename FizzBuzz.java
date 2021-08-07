package com.payilagam.Programs;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		int input = sc.nextInt();
		
		sc.nextLine();
		
		if(input%3==0 && input%5==0) {
			
			System.out.println("FizzBuzz");
		}
		
		else if(input%3==0) {
			System.out.println("Fizz");
		}
		else if(input%5==0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(input);
		}
		
		sc.close();
		

	}

}
