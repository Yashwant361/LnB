package Assignment.Condit_Statement.Cond;

import java.util.Scanner;

//9.Java program that takes a year from user and print whether that year is a leap year or not.
//Test Data
//Input the year: 2016
//Expected Output :
//2016 is a leap year
public class Statement9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year= sc.nextInt();


        if (year % 4 != 0) //If the year is not divisible by 4, it is not a leap year.
        {
            System.out.println(year+"not a leap year");

        } else if (year % 100 != 0) //If the year is divisible by 4 but not by 100, it is a leap year.
        {
            System.out.println(year+ "is a leap year");

        } else if (year % 400 !=0)//If the year is divisible by both 4 and 100 but not by 400, it is not a leap year.
        {
            System.out.println(year+ "not a leap year");
        }
        else //If the year is divisible by 400, it is a leap year.
        {
            System.out.println(year+ "is a leap year" );
        }
    }
}
