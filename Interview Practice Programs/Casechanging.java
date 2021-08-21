import java.util.Scanner;

public class Casechanging {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter your name in small letters : ");
         
         String smallname = sc.nextLine();
         
         System.out.println("Enter your name in capital letters : ");
         
         String capname = sc.nextLine();
         
         char [] arr = smallname.toCharArray();
         
         int n = 0;
         String s = "";
         
         for (int i = 0;i<smallname.length();i++) {
        	 
        /* 
           What kind of addition done is decided by dataype 
           The integer value is converted to char value and
           added into char array
        */
        	 
        	 n = arr[i] - 32;
        	 arr[i] = (char) n;
        	 
         }
         
         s = String.valueOf(arr);
         
         System.out.print(s);
         
         System.out.println(" ");
         
         char [] arr1 = capname.toCharArray();
         
         int m = 0;
         
         String z = "";
         
         for (int i = 0;i<capname.length();i++) {
        	 
        	 m = arr1[i] + 32;
        	 arr1[i] = (char) m;
         }
         
         // We are converting char array to String
         
         z = String.valueOf(arr1);
         
         System.out.println(z);
         
         
         
         sc.close();
         

	}

}
