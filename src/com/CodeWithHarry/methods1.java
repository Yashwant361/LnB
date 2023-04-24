package com.CodeWithHarry;

class methods1 {

    // create a method
   static int logic(int x , int y){
    //    int logic(int x , int y){
       int z;
       if (x>y){
           z=x+y;
       }
       else {
           z=(x+y)*5;
       }
       x=566;
       return z;
   }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
         //Method invocation using object creation
        // methods1 obj=new methods1 ();
       //  c=obj.logic(a,b);
        c=logic(a,b);
        int a1=2;
        int b1=1;
        int c1;
       // c1=obj.logic(a1,b1);
        c1=logic(a1,b1);
        System.out.println(a+" "+b);
        System.out.println(c);
        System.out.println(c1);
    }
}
