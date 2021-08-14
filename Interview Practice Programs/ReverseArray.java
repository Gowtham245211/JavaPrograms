
public class ReverseArray {

	public static void main(String[] args) {
		
		int [] array = {1, 2, 3, 4, 5};
		
		int [] revarray = new int[array.length];
		
		for (int i = 0;i<array.length;i++) {
			
			 revarray[i] = array[array.length-(i+1)];
			
		}
		
		for (int j = 0;j<array.length;j++) {
			
			System.out.print(revarray[j] + " ");
			
		}

	}

}
