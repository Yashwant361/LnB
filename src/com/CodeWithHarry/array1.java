package com.CodeWithHarry;
//import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
     /* Classroom of 500 students - You have to store marks of these 500 students
     We have 2 options
     1. Create 500 variables
     2.Use Arrays(recommended)
      */
    /* Syntax of array is
        dataType[]  arrayName  */

                   //Type_1.
       /* int    []   marks    = new int[5];
        marks  [0]           =  100;
        marks  [1]           =   60;
        marks  [2]           =   70;
        marks  [3]           =   90;
        marks  [4]           =   86;
        marks  [4]           =   96;*/
      //  marks  [5]         =   86; - throws an error
        /*Note: We can change any array value by over-write
         System.out.println(marks[4]);*/

        //Type_2: we can create by also like this

     /*   int [] marks;       // this is Declearation!
        marks= new int[5]; // this is memory Allocation!
      //  marks  [0]           =  100;
        marks  [1]           =   60;
        marks  [2]           =   70;
        marks  [3]           =   90;
        marks  [4]           =   86;
        System.out.println(marks[4]);
      */

        /*Type_3.we can also create an array like this.Here,
        Declaration, memory allocation and initialization together */

        int[] marks = {100,55,88,45,40};
        System.out.println(marks[4]);
    }
}
