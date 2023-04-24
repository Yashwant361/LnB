package Assignment.Condit_Statement.Cond;
//6.Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
import java.util.*;
public class Statement6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first input:");
        double x = sc.nextDouble();
        System.out.print("Enter second input:");
        double y = sc.nextDouble();

     // using round function
              x = Math.round(x * 1000) / 1000.0;
              y = Math.round(y * 1000) / 1000.0;
     if (x==y) {
         System.out.println("Both inputs are having same digits");
     }
     else {
         System.out.println("They are different");
     }
    }
}
