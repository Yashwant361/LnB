package com.CodeWithHarry;

public class array2 {
    public static void main(String[] args) {
       int[] marks={1,2,3,4,5,6};
       /* float[] points={1.0f,55.2f,70.5f,7.5f};
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println("Length of marks Array is:"+marks.length);
        System.out.println("Length of points Array is:"+points.length);
        System.out.println("Length of String Array is:"+cars.length);*/

     //Display the array using Loops
       /* System.out.println("Printing using for loop");
        for(int i=0; i <marks.length; i++){
            System.out.println(marks[i]);
        }*/

 // ques1. print the above array in reverse order
        System.out.println("reverse order array");
          for (int i=5; i<marks.length;i--)
        for (int j= marks.length-1;j>=0;j--)
        {

            System.out.println(marks[i]);
        }

    //        FOR EACH LOOP
   // syntax:for(dataType item : array)
       //      for(int element   : marks) {
       //  System.out.println(element);
    // }

    }
}
