package Assignment.Arrays;
//12.Java program to find the duplicate values of an array of integer values.
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array12 {
    public static void main(String[] args) {
        int[] my_array = {3,5,4,3,2,2,1};

                   // BRUTE FORCE METHODS ---> It has high time complexity
      /*  for (int i = 0; i < my_array.length-1; i++) // Yeh loop 0 index se start hoga.
        {
            for (int j = i+1; j < my_array.length; j++) // Aur yeh wla 0 index k baad se means 1 index se.
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        } */

 /*       // SET INTERFACE METHOD
  // Creating a Set refernce denoted by s.
        // Here , HashSet is predefined class  and ,
        // Set is an  INTERFACE and we can't create an Object of it.

        Set<Integer> s = new HashSet<Integer>();

        // Now, puts all the elements inside the set(s). By using "for-each"loop.

        for (int no :my_array)
        {
          if( s.add(no) == false)
          {
              System.out.println(no);
          }
        }
    //   First, the program declares and initializes an integer array my_array with some values that include duplicates.
    //    Then, the program uses the Set interface to store the unique elements of the array. A HashSet is used as the implementation of the Set interface.
    //    The program loops through each element of the array using a "for-each" loop. For each element, it adds the element to the Set using the add() method. If the add() method returns false, it means the element is already present in the Set and is a duplicate, so the program prints it out.
    //    By using the Set interface, we avoid the need for nested loops and reduce the time complexity of the program. The Set interface only stores unique elements, so it automatically eliminates duplicates for us.

  */
    }
}


