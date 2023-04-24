package Assignment.Arrays;

import java.util.Arrays;

//7.Write a Java program to remove a specific element from an array.
public class Array7 {
    public static void main(String[] args) {
        int[] myArray = {25, 14, 24, 65, 44};
        int elementToRemove = 14;
    //The removeElement function creates a new array with a length one less than the original array, to hold the modified array after removing the element.
        int[] newArray = removeElement(myArray, elementToRemove);
        System.out.println("Original Array: " + Arrays.toString(myArray));
        System.out.println("Modified Array: " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] arr, int element) {
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
}
/*Explaination
* Renamed variables to use camelCase naming convention for consistency with Java standards.
  Created a separate function removeElement to handle the removal of the specified element from the array.
  The removeElement function creates a new array with a length one less than the original array, to hold the modified array after removing the element.
  The removeElement function iterates over the original array, and for each element that is not the element to be removed, it adds that element to the new array.
  The removeElement function returns the new array with the specified element removed.
  The main method now calls the removeElement function and stores the modified array in a new array variable. Then, it prints both the original array and the modified array to the console for comparison.
 */