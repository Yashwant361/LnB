package Assignment.Condit_Statement.Cond;

import java.util.Scanner;

public class Statement12 {
    public static void main(String[] args) {
        int i ,sum = 0 ;
        double avg;
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input  5 numbers");

        for ( i = 0; i < 5; i++) {
            double number = sc.nextDouble();
            sum += number;
        }
        double average = sum / 5;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        sc.close();
    }
}
