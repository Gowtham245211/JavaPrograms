import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEg {

    public static void main(String [] args) {

        ArrayList<String> Animals = new ArrayList<String>();

        Animals.add("Ape");
        Animals.add("Buffalo");
        Animals.add("Cat");
        Animals.add("Deer");

        System.out.println("The animal list contains " + Animals);

        System.out.println(Animals.get(2));

        Animals.set(3, "Elephant");

        Animals.remove(1);

        System.out.println("Updated array list contains " + Animals);

        Animals.add(1, "Bison");

        System.out.println("Updated array list contains " + Animals);

        System.out.println("The size of arraylist " + Animals.size());

        // To print arraylist in a order

        System.out.println("Arraylist elements printed in order");

        for (int i = 0; i < Animals.size(); i++) {

            System.out.println(Animals.get(i));

        }

        System.out.println("Another method to print elements in order");

        for (String i : Animals) {

            System.out.println(i);

        }

        ArrayList<Integer> IntArray = new ArrayList<Integer>();

        IntArray.add(30);
        IntArray.add(20);
        IntArray.add(10);

        System.out.println("Integer array elements are");

        for (int i : IntArray) {

            System.out.println(i);
        }

        Collections.sort(IntArray);

        System.out.println("Sorted IntArray elements");

        for (int i : IntArray) {

            System.out.println(i);
        }

    }
}
