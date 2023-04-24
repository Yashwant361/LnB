package Learn_and_Build;

import java.util.Scanner;
public class Quest_2 {
    public static void main(String[] args) {
       int a,b,c,perimeter;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter lengths resp");

        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        perimeter=a+b+c;
        System.out.println("perimeter:"+perimeter);


       /* int x = 2;
        int y = 3;
        int z=5;

        System.out.println("Perimeter is "+(x+y+z));
         */
    }
}
