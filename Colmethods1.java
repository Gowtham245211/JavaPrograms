package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Colmethods1 {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		
		System.out.println("Adding color objects into the ArrayList : ");
		
		/* Returns a boolean value */
	    colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add(0,"Black");
		System.out.println("");
		
		/* Returns the object */
		System.out.println("The color at index is : " + colors.get(1));
		System.out.println("");
		System.out.println("Setting Blue at index 1");
		System.out.println("");
		
		/* Returns the removed object */
		String a = colors.set(1, "Blue");
		System.out.println("The removed object is : " + a);
		
		/* Returns the removed object */
		System.out.println("Removing a color at index 2");
		System.out.println("");
		colors.remove(2);
		
		/* Returns a boolean value */
		System.out.println("Is the color Red in List : " + colors.contains("Red"));
		System.out.println("");
		
		Iterator<String> i = colors.iterator();
		System.out.println("The color objects in the ArrayList are:");
		System.out.println("");
		
		/* Returns a boolean value */
		while(i.hasNext()) {
			
			/* Returns the object */
			System.out.println(i.next());
		}
		System.out.println("");
		
		/* Returns the element previously in the collection */
		colors.set(1, "Yellow");
		
		/* Returns void type */
		Collections.sort(colors);
		
		System.out.println("After sorting the ArrayList");
		System.out.println("");
		
	    for (String x : colors) {
	    	
	    	System.out.println(x);
	    }
		
		
		

	}

}
