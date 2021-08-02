package com.payilagam.Programs;

import java.util.Scanner;

public class Uglynumber {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
			
			System.out.println("How many ugly numbers do you want:");
			
			int input=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Here comes the ugly numbers");
			
			int count=1;
			int no=0;
			
			while(count<=input) {
				
				no++;
				
				if(isugly(no)==1) {
					
					System.out.println(no);
					count++;
				}
				
				
			}
				
			sc.close();
	}
	
	public static int isugly(int no) {
		
		  no=maxDivide(no,2);
		  no=maxDivide(no,3);
		  no=maxDivide(no,5);
		  
		  return (no==1) ? 1 : 0;
		
	}
	
	public static int maxDivide(int a, int b)
    {
        while (a % b == 0)
            a = a / b;
        return a;
    }
	
}


