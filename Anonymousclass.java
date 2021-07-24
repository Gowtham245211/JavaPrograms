package com.payilagam.Programs;

abstract class Anonymous{
	
	abstract void eat();
	
}

public class Anonymousclass {
	
	public static void main(String[] args) {
		
		Anonymous P = new Anonymous() {
			
			void eat() {
				
				System.out.println("I'm eating fruits");
			}
		};
		
		P.eat();
		
	}

}
