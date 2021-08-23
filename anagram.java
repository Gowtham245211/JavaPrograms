import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String input1 = sc.nextLine();
		
		input1 = input1.toLowerCase();
			
		System.out.println("Enter a String");
			
		String input2 = sc.nextLine();
		
		input2 = input2.toLowerCase();
		
		int length = 0;
		
		boolean flag = true;
		
		if (input1.length() != input2.length()) {
			
			System.out.println("Invalid anagram inputs");
			flag = false;
			
		}
		
		while(flag) {
		
		for (int i = 0; i < input1.length(); i++) {
			
			for (int j = (input2.length() - 1); j>=0; j--) {
				
				if (input1.charAt(i) == input2.charAt(j)) {
					
					length++;
				}
			}
		}
		
		if (input2.length() == length) {
			
			System.out.println("It is an anagram");
		}
		
		else {
			System.out.println("Not an anagram");
		}
		
		flag = false;
		
		}
		
		sc.close();

	}

}
