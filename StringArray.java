public class StringArray {

	public static void main(String[] args) {
		
		String s = "Restaurent is in Chennai near Tambaram in India";
		
		String [] arr = {"in","near","is"};
		
		String [] arr1 = s.split(" ", 8);

		
		for (int a = 0; a<arr.length; a++) {
			
			for (int b = 0; b<arr1.length; b++) {
				
		/*
	    Every element in the String array is an object, object
	    can be compared only with .equals method and not arithmetic
	    operators. We are using string methods to replace values.
		*/
			if (arr[a].equals(arr1[b])) {
	                    
	            arr1[b] = arr1[b].replace(arr[a], "");}
			}
		}
		
		System.out.println(String.join("-",arr1));
		
		for (int j = 0;j < arr1.length; j++) {
			
			System.out.print(arr1[j]+" ");
		}

	}

}
