import java.util.Scanner;

public class AdditionofdigitsinString {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter a sentence with numbers:");
         
         String sentence = sc.nextLine();
                 
         String additionofdigits = "";
                 
         for (int i = 0;i<sentence.length(); i++) {
        	 
    /* 
       The string is sliced into individual characters. And 
       char value is checked whether it falls within certain values
       If it fell the char values are added into String. The whole
       String value is converted into integer using parseInt.
    */
        	  char z = sentence.charAt(i);
        	  
        	  if (z >= '0' && z< '9') {
        		  
        		  additionofdigits += z;
        		  
        	  }
         }
         
         int quo = Integer.parseInt(additionofdigits);
         
         int sum = 0;
         
         while (quo > 0) {
        	 
        	 int rem = quo%10;
        	 quo /= 10;
        	 sum += rem;
         }
         
         System.out.println("The sum of digits is: " + sum);
         
         
         sc.close();
         
         

	}

}
