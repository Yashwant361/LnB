package w3Schools;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

        // Syntax of ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        /* Here,
           integer is-->DataType represents the type of elements that the ArrayList can hold, and arrayListName is
            the name given to the ArrayList.
         */

        // add elements : To use add element we only need to use dot function
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);
        // get elements : get() method to retrieve elements from an ArrayList
       int element = list.get(0);
        System.out.println(element);

        int size = list.size();
        // Print the size of the ArrayList
        System.out.println("The size of the ArrayList is: " + size);

        // add element in between
        list.add(1 , 1);

        System.out.println(list);
        int size1 = list.size();
        // Print the size of the ArrayList
        System.out.println("The size of the ArrayList is: " + size1);

        // set element--> use the set() method to set or replace an element at a specific index.
           list.set(0 , 5);
        System.out.println(list);

        // Delete or Remove element--> delet() method to use remove element from an elements.

         list.remove(3);
        System.out.println(list);
        int size2 = list.size();
        // Print the size of the ArrayList
        System.out.println("Final size of the ArrayList is: " + size2);

        // loops
        for (int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting--> Buble sort , selection sort and insertion sort

        Collections.sort(list);
        System.out.println("Sorted list of ArrayList is :"+list);
    }
}
/* NOTE :    An ArrayList is a resizeable array */