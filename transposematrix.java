
public class transposematrix {

	public static void main(String[] args) {
		
	    int a[][] = {    
                {1, 2, 3},    
                {4, 5, 6},    
                {7, 8, 9}    
             };   
	    
	    int rows = a.length;
	    int cols = a[0].length;
	    int [][] t = new int [3][3];
	    
	    for(int i = 0; i < rows; i++){    
            for(int j = 0; j < cols; j++){  
            	
            	t[i][j] = a[j][i];
            	System.out.print(t[i][j] + " ");
            	
            }
            System.out.println();
             
	    }
	}

}
