package String;

import java.util.Scanner;

public class characterinstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input no : ");
		
		int index = sc.nextInt();
		
		sc.nextLine();
		
        System.out.println("Enter the input String : ");
		
		String input = sc.nextLine();
		
		char[] charray = input.toCharArray();
		
		System.out.println("The character at the given index is " + charray[index]);
		
		sc.close();
		
		/* Actually returns the char value */
	    int value = input.charAt(index);
	    /* Returns the unicode */
	    int value1 = input.codePointAt(index);
	    
	    int value2 = input.codePointBefore(index);
	    
	    int value3 = input.codePointCount(0,3);
		
		System.out.println("The unicode value is : " + value);
		System.out.println("The character at the given index is " + (char) value);
		System.out.println("The character at the given index is " + value1);
		System.out.println("The character at the given index is " + value2);
		System.out.println("The character at the given index is " + value3);

	}

}
