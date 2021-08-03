package com.payilagam.Programs;


public class HighestCommonFactor {

	public static void main(String[] args) {
		
		int no1 = 13;
		int no2 = 17;
		int small = no1<no2 ? no1: no2;
		int div=2;
		int gcd=-1;
		
		while(div<=small) {
			
			if(no1%div==0 && no2%div==0) {
				
				gcd=div;
			}
			div++;
		}
		if (gcd>0) {
			System.out.println("GCD is " + gcd);
		}else {
			System.out.println("No GCD found");
		}
		

	}

}
