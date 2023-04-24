package Assignment.Arrays;
//3.Write a Java program to print the following grid.
//Ans: to print a grid , we use 2-D array methods.
public class Array3 {
    public static void main(String[] args) {
        int [][] grid = new int [10][10];

// DEFINATION:"For Loops"-- executes a block of code until an expression returns false

        for (int i = 0; i < 10; i++)  //THIS IS FOR X-COORINDATES (ROWS)
        {
            for (int j = 0; j < 10; j++) //THIS IS FOR Y-COORINDATES (COLUMNS)
            {
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
