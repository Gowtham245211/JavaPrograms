
public class Largestnum3rd {

	public static void main(String[] args) {
	  
		int [] arr={1,2,5,6,3,2};  
		
		for (int i = 0;i<arr.length;i++) {
					
			for (int j = i+1;j<arr.length; j++) {
				
				if(arr[i] < arr[j]) {
				
				    int temp = arr[i];
				    arr[i] =  arr[j];
				    arr[j] = temp;
				
				}
				
				
			}
			
		}
		
		System.out.println("The 3rd largest number is : " + arr[2]);
		
		

	}

}
