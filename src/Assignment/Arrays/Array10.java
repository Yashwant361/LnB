package Assignment.Arrays;
//10.Java program to find the maximum and minimum value of an array.
import java.util.Arrays;
/*public class Array10 {
    public static void main(String[] args) {

    // Declare an array of integers with some values.
        int [] arr = {5, 3, 7, 1, 9, 2};
    // Initialize two variables max and min with the first element of the array.
        int max = arr[0];
        int min = arr[0];
   // Loop through the array and compare each element with the current max and min values.
   // The loop starts from the second element of the array (index 1) since we already initialized max and min with the first element (index 0).
        for (int i = 1 ; i< arr.length ; i++)
        {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max value:"+max);
        System.out.println("Min value:"+min);
    }
}*/
public class Array10 {
   ////. Finding Max  element of the array by using Methods
    public static int getMax(int[] arr) { //Method_1
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    //. Finding  Min element of the array by using Methods
    public static int getMin(int[] arr) { //Method_2
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 9, 2};
        int max = getMax(arr);
        int min = getMin(arr);

        System.out.println("Maximum value:" + max);
        System.out.println("Minimum value:" + min);
    }


}
/*
* In this program, we have defined two methods: getMax and getMin. These methods take an array of integers as an argument and return the maximum and minimum value in the array, respectively.

The getMax method works by initializing the max variable with the first element of the array and then comparing each element of the array with the current max value. If an element is greater than max, we update max with that element. Finally, we return the max value.

Similarly, the getMin method works by initializing the min variable with the first element of the array and then comparing each element of the array with the current min value. If an element is smaller than min, we update min with that element. Finally, we return the min value.

In the main method, we call the getMax and getMin methods to get the maximum and minimum value in the array, respectively. Then, we print the maximum and minimum values using System.out.println().*/
