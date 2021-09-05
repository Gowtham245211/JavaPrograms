package ArrayList;

import java.util.ArrayList;

public class Colmethods4 {

	public static void main(String[] args) {
		
		ArrayList<String> birds = new ArrayList<String>(1);
		
		birds.add("Crow");
		birds.add("Pigeon");
		birds.add("Hen");
		birds.add("Cock");
		
		System.out.println(birds);
        
		/* returns a void type, used to save memory*/
		birds.trimToSize();
		
		birds.add("Sparrow");
		
		//birds.ensureCapacity(6);
		
		System.out.println(birds);
		
		birds.set(1, "WoodPecker");
		
		System.out.println(birds);
		
		/* size returns the size of the list */
		
		for (int i=0; i<birds.size();i++) {
			
			System.out.println(birds.get(i));
		}
	}

}
