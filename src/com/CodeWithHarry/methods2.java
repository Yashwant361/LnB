package com.CodeWithHarry;

/* Methods Overloading--> Two or more methods can have same name but different parameters.
                           Such methods are called Overloaded Methods*/
public class methods2 {
    static void foo() // Methods 1
    {
        System.out.println("Good Morining Golu!!!");
    }
    static void foo(int a) // Methods 2
    {
        System.out.println("Gud Morning "+ a + " Golu");
    }
    static void foo(int a , int b) // Methods 3 , Here a & b is a parameter
    {
        System.out.println("Gud Morning "+ a + " Golu");
        System.out.println("Gud Morning "+ b + " Golu");
    }
    /*static void telljokes(){
        System.out.println("I inverted the word!\n"+"plagiarism!");
    }*/

    // Main fucntion or " Drive Code "
    public static void main(String[] args) {
        //telljokes();

   // Methods overLoading
        foo(); // Here no argument
        foo(3000); // Here 3000 is an argument
        foo(300,500); // Here 3000 , 40000 is an argument
    //Argument are actual!

    }
}
