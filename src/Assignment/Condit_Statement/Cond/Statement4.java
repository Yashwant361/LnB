package Assignment.Condit_Statement.Cond;

import java.util.Scanner;

public class Statement4 {
    public static void main(String[] args) {
        System.out.print("Enter Input:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if ((num > 0) || (num < 1)) {
            System.out.println(num + " +ve small number");
        } else if (num > 1000000) {

            System.out.println(num + " +ve large number");
        } else {
            System.out.println(" +ve number");
        }
        
        /* if (( num > 0) || (Math.abs(num) < 1)){
            System.out.println(num+" -ve small number");

        } else if (Math.abs(num) > 1000000) {
            System.out.println(num+" -ve large number");
        }else
        {
            System.out.println(" -ve number");
        }*/

    }
}
