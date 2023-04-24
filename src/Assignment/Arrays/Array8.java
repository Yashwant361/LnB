package Assignment.Arrays;
//8.Java program to copy an array by iterating the array.
import java.util.*;
public class Array8 {
    public static void main(String[] args) {
                               // ogininal  array
        int [] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int[] new_array = new int[my_array.length]; // Declare new array with same size

        System.out.println("Origianl Array:"+ Arrays.toString(my_array));

        for (int i = 0 ; i< my_array.length ; i++){
            new_array[i] = my_array[i]; // Copy element from original to new array
        }
        System.out.println("New Array:"+Arrays.toString(new_array));
    }
}
