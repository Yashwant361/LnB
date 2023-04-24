package com.CodeWithHarry;
// MultiDimensional array:It is an array of arrays.

public class array3 {
    public static void main(String[] args) {

   /*syntax of 2-D array:*/
  /*DataType[1st Dimension][2nd Dimension]....[Nth Dimension] arrayName;*/
       int [][] flats;// 2-D array example
        flats= new int[2][3];
        flats[0][0]  =1001;
        flats[0][1]=1002;
        flats[0][2]=1003;
        flats[1][0]=2001;
        flats[1][1]=2002;
        flats[1][2]=2003;

    //Displaying the 2-D Array (for-loop)
        System.out.println("Printing a 2-D array using for loop");
        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.println(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
