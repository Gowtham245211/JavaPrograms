package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Colmethods2 {

	public static void main(String[] args) {
		
        ArrayList<String> colors = new ArrayList<String>();
		
        /* returns boolean */
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add(0,"Black");
		
		
		ArrayList<String> copycolors = new ArrayList<String>();
		
		/* Adding all objects in a collection from another collection */ 
		
		System.out.println("The copied elements are : ");
		System.out.println("");
		/* Returns boolean */
		copycolors.addAll(colors);
		/* Collections.copy(copycolors,colors);
		 * The second list objects gets copied into first collection
		 */
		
		Iterator<String> i = copycolors.iterator();
		
		//To shuffle a collection
		/* returns void type */
		Collections.shuffle(copycolors);
		// To reverse a collection
		/* returns void type */
		Collections.reverse(copycolors);
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		/* A view of specified range within the list */
		List<String> Sublist = copycolors.subList(0, 2);
		System.out.println("");
		System.out.println("The sublist of objects are : " + Sublist);
		
		

	}

}
