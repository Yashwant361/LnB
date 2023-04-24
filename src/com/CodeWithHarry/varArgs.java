package com.CodeWithHarry;

/*Variable Arguments(Varargs)--> A function with can be created in java
                               using the following Syntax:  "OR" The varrags allows the method to accept zero or muliple arguments.
                                Before varargs either we use overloaded method or take an array as the method parameter.
                              Denoted by : ...   */
public class varArgs {
    /*
//    This is Method-overloading concept

//    static int sum(int a, int b ) // Methods1
//    {
//        return a+b;
//    }
//    static int sum(int a, int b , int c ) // Methods2
//    {
//        return a+b+c;
//    }
//    static int sum(int a, int b , int c ,int d) //Methods3
//    {
//        return a+b+c+d;
//    }
           */

//Syntax of varargs--> return_ type method_name(data_type...Variable_Name){ }
    static int sum(int x,int ... arr) // Here " int x " is compulsory
     {
       //Available as  int [] arr;
         int result=x;
         //int result=x;

         for (int element :arr) {
             result += element;
         }
         return result;
     }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of Nothing  is: "+sum(1));
        System.out.println("The sum of 5 and 6 is: "+sum(5,6));
        System.out.println("The sum of 5,6 and 7 is: "+sum(5,6,7));
        System.out.println("The sum of 5,6,7 and 8 is: "+sum(5,6,7,8));
    }
}
