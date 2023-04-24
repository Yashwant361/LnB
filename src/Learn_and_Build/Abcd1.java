package Learn_and_Build;//import java.util.Scanner;

public class Abcd1
    //Date: 08/03/2023 (Single argument
    // find avg of n number by variable arguments

// methods  are used for code use-ability
    {
     //  static int square ( int num)
         static  int add(int a,int b,int c,int d,int e){
          //  System.out.println(num*num);
             System.out.println(a+b+c+d+e);
            return 0;
    }

        public static void main(String[] args) {
           /* square(25 );
            square(25 );
            square(25 );*/
            add(1,1,1,1,1);
        }
    }
/*import java.util.Scanner;
public class Abcd1 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}*/



