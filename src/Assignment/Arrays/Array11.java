package Assignment.Arrays;

/*import java.util.Arrays;

//11.Java program to reverse an array of integer values.
public class Array11 {
  public static void main(String[] args) {
 int [] a = {1789, 2035, 1899, 1456, 2013};
   System.out.println("Original Array:"+ Arrays.toString(a));
    for (int i = 0 ; i<a.length / 2 ; i++){
     int temp = a[i];
     a[i] = a[a.length-i-1];
     a[a.length-i-1]=temp;
    }
   System.out.println("Reverse array:"+Arrays.toString(a));
 }

}*/

import java.util.Arrays;

public class Array11 {
 public static void main(String[] args) {
     int[] arr = { 1, 2, 3, 4, 5 };
     System.out.println("Original Array: " + Arrays.toString(arr));
     reverseArray(arr);
     System.out.println("Reversed Array: " + Arrays.toString(arr));
 }

 public static void reverseArray(int[] arr) {
      int start = 0;
      int end = arr.length - 1;
      while (start < end) {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
     }
   }
}

