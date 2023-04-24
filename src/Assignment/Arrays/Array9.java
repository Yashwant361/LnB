package Assignment.Arrays;
//9.Java program to insert an element (specific position) into an array.
import java.util.Arrays;
public class Array9 {
    public static void main(String[] args) {
        int [] my_arr = {10,20,30,40,50};
        // Insert an element in 3rd position of the array (index->2, value->5)
        int indexPosition = 2;
        int newValue = 5;
      //print the original array
        System.out.println("Original array:"+ Arrays.toString(my_arr));

      //Create a "for-loop" to shift the element to the right starting from the end of the array.
        for (int i = my_arr.length-1 ; i > indexPosition ; i--)
        {
            my_arr[i] = my_arr[i-1];
        }
        my_arr[indexPosition] = newValue;
        System.out.println("New Array:"+ Arrays.toString(my_arr));
    }
}
