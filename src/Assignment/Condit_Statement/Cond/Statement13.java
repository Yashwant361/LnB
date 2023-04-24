package Assignment.Condit_Statement.Cond;

import java.util.Scanner;

public class Statement13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();
        for (int i = 1 ; i<=n ; i++){
            System.out.println("Number is:" +i+"and cube of " +i+"is :"+i*i*i);
        }
    }
}
