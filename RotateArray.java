import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] user = {1,2,3,4,5};
			
		System.out.println("How many rotations do you want :");
		
		int num = sc.nextInt();
		
		for (int i=1; i<=num;i++) {
	    	
	    	for (int j=0;j<(user.length-1);j++) {
	    		
	    		    		
	    		int temp = user[j];
	    		user[j] = user[j+1];
	    		user[j+1] = temp;
	    	}
        	
        }
		
		System.out.println("");
		System.out.println("The array elements after rotation");
		System.out.println("");
	    
	    for (int x : user) {
	    	
	    	System.out.print(x + " ");
	    }
        
        sc.close();

    }
	
}
