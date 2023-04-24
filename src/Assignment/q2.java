package Assignment;

import java.util.Scanner;

public class q2 {
    public static void main (String[]args)
    {

        int  sum = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value n : ");

      n = scanner.nextInt();
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
                sum = sum + i;
        }
        if (sum == n)
            System.out.println (n + " Is a perfect number");
        else
            System.out.println (n + " Is not a perfect number");
    }
}
