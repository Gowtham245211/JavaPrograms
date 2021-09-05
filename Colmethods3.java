package ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class Colmethods3 {

	public static void main(String[] args) {
		
		  ArrayList<Integer> list1 = new ArrayList<Integer>();
		  ArrayList<Integer> list2 = new ArrayList<Integer>();
		  
		  list1.add(1);
		  list1.add(2);
		  list1.add(3);
		  
		  list2.add(3);
		  list2.add(2);
		  list2.add(1);
		  
		  /* Returns a void type */
		  Collections.sort(list1);
		  Collections.sort(list2);
		  
		  System.out.println(list1);
		  System.out.println(list2);
		  
		  for (int i : list1) {
			  
			  /* Returns a boolean value */
			  System.out.println(list2.contains(i));
			 
	      }
		  
		  /* returns a void type */
		  Collections.swap(list1,0,2);
		  
		  for (int i : list1) {
			  
			  System.out.println(i);
		  }
		  
		  // Joining two ArrayListj
		  ArrayList<Integer> list3 = new ArrayList<Integer>();
		  list3.addAll(list1);
		  list3.addAll(list2);
		  
		  System.out.println(list3);
		  
		  ArrayList<Integer> list4 = new ArrayList<Integer>();
		  /* clone method returns an object class object */
		  list4 = (ArrayList<Integer>)list3.clone();
		  
		  System.out.println(list4);
		  
		  Object s = list4.clone();
		  System.out.println(s);
		  
		  /* Removes all the objects in the ArrayList and return a boolean 
		   * value if call is done correctly
		   */
		  list4.removeAll(list4);
		  
		  /* Returns a boolean to show whether list is empty or not */
		  System.out.println(list4.isEmpty());
		  
		  

     }

}