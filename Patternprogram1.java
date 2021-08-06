package com.payilagam.Programs;

public class Patternprogram1 {

	public static void main(String[] args) {
		
		for (int row = 5; row>=1;row--) {
			
			for (int column = 1; column<=row; column++) {
				
				System.out.print(column + " ");
				
			}
			
			System.out.println("");
			
		}
		
		System.out.println(" ");
		
        for (int row = 1; row<=5;row++) {
			
			for (int column = 1; column<=row; column++) {
				
				System.out.print(column + " ");
				
			}
			
			System.out.println("");
			
		}
        
        System.out.println(" ");
        
        for (int row = 1; row<=5;row++) {
			
			for (int column = 5; column>=row; column--) {
				
				System.out.print(column + " ");
				
			}
			
			System.out.println("");
			
		}
        
        System.out.println(" ");
        
        for (int row = 1; row<=5;row++) {
			
			for (int column = row; column<=5; column++) {
				
				System.out.print(column + " ");
				
			}
			
			System.out.println("");
			
		}
        
        System.out.println(" ");
        
        for (int row = 1; row<=9;row+=2) {
			
			for (int column = row; column<=9; column++) {
				
				System.out.print(column + " ");
				
			}
			
			System.out.println("");
			
		}
        
        System.out.println(" ");
        
        for (int row = 1; row<=5;row++) {
			
			for (int column = 5; column>=row; column--) {
				
				System.out.print("*" + " ");
				
			}
			
			for (int column = 1; column<=row; column++)
			
			System.out.print(1 + " ");
			
			System.out.println("");
			
		}

        System.out.println(" ");
        
        for (int row = 1; row<=5;row++) {
			
			for (int column = 5; column>=row; column--) {
				
				System.out.print(" ");
				
			}
			
			for (int column = 1; column<=row; column++)
			
			System.out.print(1 + " ");
			
			System.out.println("");
			
		}
	}

}
