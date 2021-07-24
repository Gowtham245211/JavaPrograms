package com.payilagam.Programs;

public class Outer {
	
	private int data = 30;
	
	class Inner{
		
		void msg() {
			
			System.out.println("data is " + data);
		}
	}

	public static void main(String[] args) {
		
		Outer A = new Outer();
		
		Outer.Inner B = A.new Inner();
		
		B.msg();

	}

}
