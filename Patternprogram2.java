package com.payilagam.Programs;

public class Patternprogram2 {

	public static void main(String[] args) {
		
		for (int row = 1;row <=5; row++) {
			
			for (int column = 5;column>=row; column--) {
				
				System.out.print("  ");
			}
			
			for(int value = 1; value<=row; value++) {
			
               System.out.print(value + " ");
            
			}
			
			System.out.println();
		}
		
		System.out.println(" ");
		
        for (int row = 1;row <=5; row++) {
			
			for (int column = 5;column>=row; column--) {
				
				System.out.print(" ");
			}
			
			for(int value = 1; value<=row; value++) {
			
               System.out.print(value + " ");
            
			}
			
			System.out.println();
		}
       
        System.out.println(" ");
        
        int a = 1;
		
        for (int row = 1;row <=5; row++) {
			
			for (int column = 5;column>=row; column--) {
				
				System.out.print(" ");
			}
			
			
			for(int value = row; value<=a; value++) {
				
			    System.out.print(value + " ");
					
			}
			
			a+=2;
			
			System.out.println();
		}
        
        System.out.println(" ");
        
       
		
        for (int row = 1;row <=5; row++) {
			
			for (int column = 5;column>=row; column--) {
				
				System.out.print(" ");
			}
			
			
			for(int value = row; value>=1; value--) {
				
			    System.out.print(value + " ");
					
			}
			
			
			
			System.out.println();
		}
        
        System.out.println(" ");
        
        for (int row = 1;row <=5; row++) {
			
			for (int column = 5;column>=row; column--) {
				
				System.out.print("  ");
			}
			
			
			for(int value = row; value>=1; value--) {
				
			    System.out.print(value + " ");
					
			}
			
			System.out.println();
		}
        
        System.out.println(" ");
        
        int b = 1;
		
        for (int row = 1;row <=5; row++) {
			
			for (int column = 5;column>=row; column--) {
				
				System.out.print("  ");
			}
			
			
			for(int value = row; value<=b; value++) {
				
			    System.out.print(value + " ");
					
			}
			
			b+=2;
			
			System.out.println();
		}
        
        System.out.println(" ");

	}
	
}


