package com.payilagam.Programs;

public class PascalTriangle {
	
	 public static void main(String [] args) {
		 
		  int a = 1;
		  int count = 0;
		  boolean loop = true;
		  int value = 5;
		  
		  while(loop) {
			  
			  int b = a;
			  
			  for (int column = 1;column<=value;column++) {
	  				 
	  				 System.out.print(" ");
	  				 
	  		  }
			  
			  while (b>0) {
			    	
			     int digit = b % 10;
				 System.out.print(digit+" ");
				 b/=10;
					 
					 
			 }
			    
			     value--;
			     a*=11;
			     
			     count++;
			     
			     if(count==5) {
			     
			    	  loop = false;
			          
			     } 
				 
			     System.out.println("");
	
		  }
		  
	}	 
		  
}
			  
			  
	 

			  
		  
		  
	 


