public class SortAscDesc {

	public static void main(String[] args) {
		
		int [] arr = {5,2,8,7,1};
		
		for (int i=0; i<arr.length; i++) {
			
			for (int j = i+1;j<arr.length;j++) {
			
			if (arr[i] <= arr[j]) { /*(arr[i] >= arr[j])*/
				
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				
			}
			
			}
		}
		
		for (int a = 0;a<arr.length;a++) {
			
			System.out.print(arr[a] + " ");
		}
	}

}
