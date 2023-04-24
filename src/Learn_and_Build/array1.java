package Learn_and_Build;

import java.sql.Struct;
import java.util.*;
public class array1 {

    static void min(int arr[]){
        for (int num:arr){
            System.out.println(num);
        }
    }
    static int[] sort(){

           int []arr={10,20,30,50};
           return arr;
    }

    public static void main(String[] args) {
        int [] age={1,2,3,4,5};

         min (age);
         min(new int[]{10,20,30,40});// anonymus array

        int [] marks =new int[10];
        System.out.println("Enter the array values");
        /* marks[0]=10;
         marks[1]=20;*/
         Scanner sc =new Scanner(System.in);
         for (int i=0;i<=marks.length;i++){
             marks[i]= sc.nextInt();
         }
        String name ="Hello world";
         for (int i=0;i<=name.length();i++)
         {
             marks[i]= sc.nextInt();
         }
        /*
        //Initialize array
        int [] arr = new int [] {5, 2, 8, 7, 1};
        int temp = 0;

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } */
    }
}
