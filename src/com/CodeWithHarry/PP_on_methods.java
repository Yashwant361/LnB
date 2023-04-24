package com.CodeWithHarry;

public class PP_on_methods {
    /*PP1: program of multiplication by java methods
    static void multiplication(int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            //System. out. printf() method can be used to print formatted output in java.
            System.out.format("%d * % d = %d\n ", n, i, n * i);
        }
              //return  n;
    }*/

    // PP2: Print  star pattern

   /*static void pattern1(int n)
    {
     for (int i = 0 ; i<n ; i++){
         for (int j=0 ; j<i+1 ; j++ ){
             System.out.print("*");
         }
         System.out.println();
         }
    }*/

    /*PP3: Calculate the sum of number

    //sum(n) = 1 + 2 + 3 +.....+ n
    //sum(n) = 1 + 2 + 3 +.....+ n-1 + n
    //sum(n) = sum(n-1) + n

    //sum(3) = 3 + sum(2) // Example
    //sum(3) = 3 + 2 + sum(1)
    //sum(3) = 3 + 2 + 1
    static int sumRec(int n){
        // Base condition of recursion
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    } */

    // PP4: print a star pattern
    /*
    static void starptrn(int n){
        for (int i = 1 ; i<=n ; i++) // Row
        {
            for (int j = 1 ; j<=n-i + 1 ; j++) // Col
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    } */

    // Problem 5
   /* static int n1=0,n2=1,n3=0;
    static int  fib(int n) // Initalize a method
    {
       /* if ( n >0)
        {
            n3 = n1 + n2 ;
            n1 = n2;
            n2 = n3;
            System.out.println(" "+n3);
            fib(n -1);
        }*/
        /*if (n==1)
        {
            return 0;

        } else if ( n==2 )
        {
            return 1;
        }*/
       /* if (n==1 || n==2){
            return n-1;
        }
        else
            return fib(n-1) + fib( n-2);
    }*/

    // Problem 6

    /*static double avg(int x , int y)
    {

    /*     return ( x +y)/2;
    }
    static double avg(int x , int y ,int z){

        return ( x + y + z)/2;
    }
    static double avg(int w , int x , int y , int z){

        return (w+ x +y + z)/2;
    }*/

    /*
      // Using varargs methods
  static double avg(int ... a){

   // An array have a property of length
      int n=a.length; //Average Of 'n' numbers

      int  SumOfNumbers = 0;

      for (int i : a) //Calculating sum of numbers
      {
          SumOfNumbers = SumOfNumbers + i;
      }
      return (SumOfNumbers / n);

  }*/
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
            System.out.println( );
    }
}

    public static void main(String[] args) {
       // multiplication(7); // Problem 1

       //   pattern1(4);   //  Problem 2

       /*  // problem 3
         int c = sumRec(4);
         System.out.println(c); */

       // starptrn(4); // problem 4

       // Problem 5
      /*
       /* int count =10;
        System.out.println( n1+" "+n2); //printing 0 and 1
        fib(count -2); //n-2 because 2 numbers are already printed
        // Alternative soln--> 0,1,1,2,3,5,8,13,21,34
        int result = fib(5);
        System.out.println(result); */

     //Problem 6
        /*System.out.println("Average is:"+avg(10, 20));
        System.out.println("Average is:"+avg(10, 20, 30));
        System.out.println("Average is:"+avg(10, 20, 30, 40));*/

        //Problem 7
        pattern1_rec(4);
  /* pattern1_rec(4) // In reverse order
  *  pattern1_rec(3) + 4 times star and new line
  *  pattern1_rec(2) + 3 times star and new line + 4 times star and new line
  *  pattern1_rec(1) + 2 times star and new line + 3 times star and new line + 4 times star and new line
  *  pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line + 4 times star and new line
  * */

    }
}
