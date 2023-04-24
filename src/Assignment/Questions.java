package Assignment;

import java.util.Scanner;

public class Questions
{
    public static void main(String args[])
    {
       /* // problem 3
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while(number > 0)
        {
            digit = number % 10; // for last digit
            sum = sum + digit; // add the last digit
            number = number / 10; // remnoves the last digit
        }

        System.out.println("Sum of Digits: "+sum);

           /* public static void main(String args[])
        {
            int number, digit, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            while(number > 0)
            {
              //finds the last digit of the given number
                digit = number % 10;
              //adds last digit to the variable sum
                sum = sum + digit;
              //removes the last digit from the number
                number = number / 10;
            }
            //prints the result
            System.out.println("Sum of Digits: "+sum);*/


        // problem 4:print  ASCII value of given characte and add them
        /*
                //Define the character
                char ch1 = 'a';
                int ascii1 = ch1;
                char ch2 = 'b';
                int ascii2 = ch1;

              System.out.println("Ascii value is:"+ascii2);
              System.out.println("additon of Ascii value is:"+(ascii1+ascii2));
         */

        double val=Math.sin(Math.toRadians(90.0));
        System.out.println(val);
        }
    }
//}