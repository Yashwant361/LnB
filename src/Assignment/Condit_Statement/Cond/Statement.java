package Assignment.Condit_Statement.Cond;
//Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // syntax   booleanExpression ? valueIfTrue : valueIfFalse
        System.out.println(num > 0 ? num + " is positive." :
                num < 0 ? num + " is negative." : "The number is zero.");
      /*  {
            if (num > 0 )
            {
                System.out.println(num +" is postive ");
            }
            else if (num < 0)
            {
                System.out.println(num +" is negative");
            }
            else
            {
                System.out.println("Number is Zero");
            }
        }*/
    }
}
