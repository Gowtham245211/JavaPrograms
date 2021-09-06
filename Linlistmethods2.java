package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Linlistmethods2 {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.add("Ape");
		l1.add("Buffalo");
		l1.add("Cat");
		l1.add("Dog");
		l1.add("Elephant");
		l1.add("Frog");
		
		l1.remove("Ape");
		
		for(int i = 0; i<l1.size();i++) {
			
			System.out.println("The object is "+l1.get(i) + " and its position is "
					+ i);
		}
		
        l1.addFirst("Ant");
        
        /* Removes the first element and returns the removed element */
        System.out.println("The removed element is " + l1.removeFirst());
        l1.removeLast();
        
        System.out.println("The newly formed linked list is " + l1);
        
        /* To remove all the objects in the list and returns void type*/
        //l1.clear();
        
        //returns a void type
        Collections.swap(l1, 0, 1);
        
        Collections.shuffle(l1);
        
        System.out.println(l1);
        
        LinkedList l2 = new LinkedList();
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(5);
		
		/*Returns a boolean showing whether elements are added or not*/
		//System.out.println(Collections.addAll(l1, l2));
		System.out.println(l1.addAll(l2));
		
		System.out.println("The new list is " + l1);
		
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        
        l3 = (LinkedList)l2.clone();
        
        System.out.println(l3);
        System.out.println(l1);
        
        //l3.pop() removes the first element
        System.out.println("The removed first element of l3 is " + l3.removeFirst());
        
        System.out.println("The retrieved first element of l3 is " + l3.getFirst());
        
        System.out.println("The retrieved last element of l1 is " + l1.getLast());
        
        
	}

}
