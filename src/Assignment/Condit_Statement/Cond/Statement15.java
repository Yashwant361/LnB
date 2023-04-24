package Assignment.Condit_Statement.Cond;

import java.util.Scanner;

public class Statement15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();
        int sum=0;
        /*for (int i = 1; count < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }//If we use if condition ,we add count value as 0;
         */

        for (int i = 1 ; i<=n ; i++){
            System.out.println("Odd number:"+(2*i-1));
            sum+=2*i-1;
        }

        System.out.println("Their sum is:"+sum);
    }
}
