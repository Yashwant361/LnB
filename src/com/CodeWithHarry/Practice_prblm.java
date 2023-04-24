package com.CodeWithHarry;

public class Practice_prblm {
    public static void main(String[] args) {
        /*          Practice problem 1
        float [] floats={10.0f,55.5f,44.5f,33.f,34.5f};
        float sum=0; // create a variable intially stores Zero"0"

    // Using 'for-each loop'
    for (float element:floats) {
        sum = sum + element;
    }
        System.out.println("The value of sum is:"+sum);*/

  /*P.P2- program to find an integer wheather a given integer is present in an array or not

        int [] marks={55,44,50,56,99,63};
        int num=51; // we have to find this integer in an array
        boolean isInarray= false;

        for (int element:marks)
        {
            if (num == element)
            {
                isInarray = true;
                break;
            }
        }
        if (isInarray){
                System.out.println("The value is present in an array");
            }
            else
                System.out.println("The value is not present in an array");*/

   /*P.P3: Calculate the arrray marks from an array containing marks of all students in physics using for each loop

        float [] marks={10.0f,55.5f,44.5f,33.f,34.5f};
        float sum=0; // create a variable intially stores Zero"0"

        // Using 'for-each loop'
        for (float element:marks) {
            sum = sum + element;
        }
        System.out.println("The value of avg marks is:"+sum/marks.length);*/


/*P.P4:Create a java program to add two matrices of size 2x3
public class Practice_prblm {

      public static void main(String[] args) {
          //creating two matrices
          int[][] mat1 = {{1, 3, 4},
                  {2, 4, 3}};
          int[][] mat2 = {{1, 3, 4},
                  {2, 4, 3}};

//creating another matrix to store the sum of two matrices
          int[][] sum = new int[2][3];  //3 rows and 3 columns

//adding and printing addition of 2 matrices
          for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 3; j++) {
          sum[i][j] = mat1[i][j] + mat2[i][j];// formula to cal. matrix addition .Use - for subtraction
                  System.out.print(sum[i][j] + " ");
              }
              System.out.println();//new line
          }
      }
  }
*/

  /*P.P5: Create a java program to reverse an array
        int [] arr = {1,2,3,4,5,6} ;
        for (int i=arr.length-1;i>=0;i--) {
        //    System.out.println(arr[i]);
       //  }

       int n = Math.floorDiv(arr.length,2);//floorDiv-->used to find the largest integer value that is less than or equal to the algebraic quotient.

        int temp;      // Create a temp file for swapping a number

        for (int i=0; i<=n;i++)// where n is "Math.floorDiv(arr.length,2);"
        {
              // swap arr[i] and arr[l-i-1]
            temp                =      arr[i];
            arr[i]              =      arr[arr.length-i-1];// Where arr.length = 6
            arr[arr.length-i-1] =      temp;
        }
        for (int element:arr) {
            System.out.print(element+" ");
        } */

    /*P.P6:Write a java program to find the maximum element in an array

        int [] arr= new int[]{1,2,3,4,5,6} ;
        int  max = 0;

        // Using for each loop
        for (int element:arr) {
            if (element<max)
            {
                max=element;
            }
        }
        System.out.println("Maximum element is "+max);*/

   /*P.P7: Java program to find the minimum element in a java array

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56};

        //Initialize min with first element of array.

        int min = arr[0];

        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min) //Compare elements of array with min
                min = arr[i];
        }
        System.out.println("Minimum element present in given array: " + min);*/

    /*P.P7: Java program to show that array is sorted or not  */

       // int [] arr = new int [] {25, 11, 7, 75, 56}; 
        int [] arr = new int [] {1,2,3,4,5};
        boolean isSorted = true;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                isSorted=false;
            }
        }
        if (isSorted){
            System.out.println("Array is sorted");
        }
        else
            System.out.println("Array is not sorted");
    }

}

