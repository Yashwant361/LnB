package w3Schools;

import java.util.Scanner;


public class Excphand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
             System.out.println("Please Enter two number");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int [] arr = {};
            System.out.println(a/b);
            System.out.println(arr[1]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Please Enter non-zero value");
            int b = sc.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
        finally {
            System.out.println("It will Executed");
        }
    }
}

/*
public class Excphand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please Enter two number");
            int a = sc.nextInt();
            int b = sc.nextInt();
//            int a = 1;
//            int b = 0;
//            int[] arr = {1, 2, 3}; // add some elements to the array
//            System.out.println(arr[0]);
            System.out.println(a/b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is empty or index is out of bounds");
        }
    }
} */

/**
 Exceptions
 1.Checked - Compulsory to handle them as they got checked at the time of compliation
             IOException , SQlException ,
 2. Unchecked
 */
/**
  API - Application Programing Interface
  JSON - Data Format
 1. JSONObject - {Key:value , K2:V2 ,K3:V3 , K4:V4}

 2.JSONArray

 Mini Projects Uploaded on git hub
 1.Calculator - Scientific
 2.Login/Regis. System ( with file handing)
 3.Guess the number
 4.Hangman(Guess word )
 5.Wheather report using API

  */