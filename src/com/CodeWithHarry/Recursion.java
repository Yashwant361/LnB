package com.CodeWithHarry;

/*import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Scanner;

public class Recursion {
        // factorial (0) = 1
        // factorial(n) = n * n-1 *....1
        // General forumla Factorial (n) = n * factorial (n-1)
    static int  factorial(int n){
      if (n==0 || n==1){
          return 1;
      }
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x:");
        int value = sc.nextInt();
        System.out.println("The value of factorial n is: "+ factorial(value));
    }
}*/

// Question : Write a java program to print fibonacci series using recursion
public class Recursion{
     static int n1=0, n2=1 ,n3=0;
     static void Recursion(int count) // Recursion can replace by another name also
     {
         if(count > 0){
             n3 = n1 + n2;
             n1 = n2;
             n2 = n3;
             System.out.println(" "+n3);
             Recursion(count-1);
         }
     }
    public static void main(String[] args) {
         int count = 10;
        System.out.println(n1+" "+n2); //printing 0 and 1
        Recursion(count-2); //n-2 because 2 numbers are already printed

    }
}
