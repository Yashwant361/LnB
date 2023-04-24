package Learn_and_Build;

import java.util.Scanner;
public class takeuserinput {
    public static void main(String[] args)
    {
        int sq,cube;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int a=input.nextInt();
         sq=a*a;
         cube=sq*a;
         System.out.println("Sq of the given input is "+sq);
            System.out.println("------------------");
         System.out.println("cube of the given input is "+cube);

    }


}
