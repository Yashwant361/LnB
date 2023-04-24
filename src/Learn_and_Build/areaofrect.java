package Learn_and_Build;

import java.util.Scanner;
public class areaofrect {
    public static void main(String[] args) {
        int length,breadth,area,perimeter;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter length and breadth respectivly");
        length=input.nextInt();
        breadth=input.nextInt();
        area=2*(length+breadth);
        perimeter=length*breadth;

        System.out.println("area is:"+2*(length+breadth)+"\n perimeter is:"+length*breadth);

   /* public static void main(String[] args){
        int x = 5;
        int y = 7;
        System.out.println("Area is "+(5*7)+"\nPerimeter is "+(2*(5+7)));
    */

    }

}
