package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linlistmethods3 {

	public static void main(String[] args) {
		
        LinkedList<String> l1 = new LinkedList<String>();
		
		System.out.println(l1.add("Ape"));
		l1.add("Buffalo");
		l1.add("Cat");
		l1.add("Dog");
		l1.add("Elephant");
		l1.add("Frog");
		
		System.out.println(l1.contains("Frog"));
		
		ArrayList<String> al1 = new ArrayList<String>(l1);
		System.out.println(al1);
		 
		System.out.println("Is the LinkedList empty :" + l1.isEmpty()); 
		 
		System.out.println("The replaced element is " + l1.set(2, "Donkey"));

	}

}
