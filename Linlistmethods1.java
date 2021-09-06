package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linlistmethods1 {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList ();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(5);
		l1.add(6);
		l1.add(8);
		
		l1.add(3,4);
		
		/* Adds objects at first and last index and returns a void
		 * Offers objects at first and last but returns a boolean value  
		 * l1.offerFirst();
		 * l1.offerLast();*/
		l1.addFirst(0);
		l1.addLast(9);
		
		LinkedList colors = new LinkedList ();
 		
		colors.add("Pink");
		colors.offerFirst("Red");
		colors.add("Blue");
		
		l1.addAll(3,colors);
		
		System.out.println(l1);
		
		/* Starts to iterate from the specified index */
		Iterator i = l1.listIterator(2);
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		System.out.println("");
		
		/* Returns a void type 
		Collections.reverse(l1);*/
		
		/* Returns iterator in the descending order */
		Iterator b = l1.descendingIterator();
		
		while(b.hasNext()) {
			
			System.out.println(b.next());
		}
		System.out.println("");
		
		/* gets the first and last occurence object in a list */
		System.out.println(colors.getFirst());
		System.out.println(colors.getLast());
		
	}

}
