public class duparray {

	public static void main(String[] args) {
		
		 int arr[] = {10,20,20,30,30,40,50,50};  
		 
		 int n = arr.length;
	       
		 int [] temp = new int[n];
		 
		 int j = 0;
		 
		 for (int i = 0;i<n-1;i++) {
			 
			 if (arr[i] != arr[i+1]) {
				 
				 temp[j++] = arr[i];
			 }
			 
		 }
		 
		 temp[j++] = arr[n-1];
		 
		 System.out.println(j);
		 
		 for (int a = 0; a<j; a++) {
			 
			 arr[a] = temp[a];
		 }
		 
		  for (int b=0; b<j; b++)  
	          
			  System.out.print(arr[b]+" ");  
	      }
    }  
       
 

