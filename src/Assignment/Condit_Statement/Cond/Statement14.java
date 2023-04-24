package Assignment.Condit_Statement.Cond;

import java.util.Scanner;

public class Statement14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int n = sc.nextInt();
       // int n=5;
        for (int i = 1 ; i<=10 ; i++){
            System.out.println(+n+"X"+i+ "="+(n*i));
        }
    }
}
