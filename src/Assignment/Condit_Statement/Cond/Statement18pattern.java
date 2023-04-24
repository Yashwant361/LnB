package Assignment.Condit_Statement.Cond;

import java.util.Scanner;

public class Statement18pattern {
    public static void main(String[] args) {
        int n,i,j,k=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows:");
         n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k++);
            }
            System.out.println("");
        }
    }
}
