package com.payilagam.Programs;
import java.util.Scanner;

public class Arraymarks {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	String [] students = new String[3];
	
	for (int a = 0; a<students.length; a++) {
		
		System.out.println("Enter student's name");
		
		students[a] = sc.nextLine();
		//sc.nextLine();
	}
	
	int[] marks1 = new int[3];
	int[] marks2 = new int[3];
	int[] marks3 = new int[3];
	int[] totalarray = new int[3];
	int[] percentagearray = new int[3];
	
	
	int [][] marksarray = {marks1,marks2,marks3};
	
	for (int i = 0; i<marksarray.length; i++) {
		
		int [] d = {};
		
		if (i == 0) {
			
			d = marks1;
			
		}
		
		else if (i == 1) {
			
			d = marks2;
			
		}
        
        else if (i == 2) {
			
			d = marks3;
			
		}
		
			
		int total = 0;
		int percentage = 0;
		
		System.out.println("Enter 5 marks");
		
		   for (int b = 0;b < d.length; b++) {
			   
			   System.out.println("Mark "+(b+1));
			
			    d[b] = sc.nextInt();  
			    total += d[b];
			
		   }
		   
		   totalarray[i] += total;
		   
		   percentage = (total/d.length);
		   
		   percentagearray[i] += percentage;
		   
		 
		
	}
	
	System.out.println(" ");
	
	for (int e = 0;e < 3; e++) {
	
	System.out.println(students[e] + "'s total is "+totalarray[e]+" and percentage is "
	+percentagearray[e]+" %.");
	System.out.println(" ");
	
	}
	    
	sc.close();
		 
	}
	
} 


