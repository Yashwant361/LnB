package Assignment.Arrays;
//6. Write a Java program to find the index of an array element.
/*
public class Array6 {
    public static void findIndex (String[] args) {

        // Declare and initialize an array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Define the element to search for
        int elementToFind = 300;

        // Loop through the array and check each element
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToFind) {
                System.out.println("Element found at index " + i);
                // Exit the loop once the element is found
                break;
            }
        }
    }

} */

/*
import java.util.Arrays;
public class ArrayIndexExample {
  public static void main(String[] args) {
    // Define an array of integers
    int[] arr = { 10, 20, 30, 40, 50 };

    // Define the element to search for
    int element = 30;

    // Use the Arrays class to search for the element
    int index = Arrays.binarySearch(arr, element);

    // Display the result
    if (index >= 0) {
      System.out.println("Element found at index " + index);
    } else {
      System.out.println("Element not found in the array");
    }
  }
}    */

public class Array6 {
    public static int findIndex(int[] my_array, int t) {
        // Check if the array is null
        if (my_array == null) {
            return -1;
        }

        // Initialize variables
        int len = my_array.length;
        int i = 0;

        // Search the array for the given value
        while (i < len) {
            if (my_array[i] == t) {
                return i;
            } else {
                i++;
            }
        }

        // Return -1 if the value is not found
        return -1;
    }

    public static void main(String[] args) {
        // Initialize an array
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // Call the findIndex function to find the index of values in the array
        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
    }
}

/* An explaination of above code.


The findIndex function takes two arguments: an integer array my_array and an integer value t to search for. The function first checks if the array is null, and returns -1 if it is. It then initializes two variables: len to hold the length of the array, and i to use as a loop counter.

The function then enters a while loop that searches the array for the given value. For each element in the array, the function checks if it is equal to the given value. If it is, the function returns the index of the element. If it is not, the loop continues to the next element. If the value is not found in the array, the function returns -1.

In the main function, we initialize an integer array my_array with some values. We then call the findIndex function twice to find the index of the values 25 and 77 in the array. We print the results to the console using System.out.println.

I hope this explanation helps you understand the code! Let me know if you have any further questions.
*/
