package Assignment.Condit_Statement.Cond;

import java.util.Scanner;

//11. Display n terms of natural numbers and their sum
public class Statement11 {
    public static void main(String[] args) {
        int i , n, sum =0 , avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");
        n = sc.nextInt();
        System.out.println("The first n natural numbers are : "+n);

        for ( i = 1 ; i<= n ; i++){
            System.out.println(i);
            sum+=i;
         // sum = sum + 1;
        }
        avg = sum /n;
        System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);
        System.out.println("Average is "+avg);
    }

}
