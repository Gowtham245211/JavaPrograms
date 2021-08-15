import java.util.Scanner;

public class RightRotate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {1,2,3,4,5};
		
		int temp = 0;
		
		System.out.println("Enter the number of rotations : ");
		
		int num = sc.nextInt();
		
	for (int j = 1; j<=num ;j++) {
		
		for (int i = (arr.length-1); i>0; i--) {
			
			temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;
		}
		
	}
	
	for (int a = 0;a<arr.length;a++) {
		
		System.out.print(arr[a] + " ");
	}
	
	sc.close();
	
	}

}
