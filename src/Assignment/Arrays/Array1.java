package Assignment.Arrays;

//1.Write a Java program to sort a numeric array and a string array.
// Means:- Ascending to decending respectively.

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] numArr = { 5, 1, 6, 2, 4, 3 };
        String[] strArr = { "E", "C", "B", "A", "D" };

        System.out.println("Numeric array before sorting: " + Arrays.toString(numArr));
        Arrays.sort(numArr);
        System.out.println("Numeric array after sorting: " + Arrays.toString(numArr));
        System.out.println("-----------------------");
        System.out.println("String array before sorting: " + Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println("String array after sorting: " + Arrays.toString(strArr));
    }
}
