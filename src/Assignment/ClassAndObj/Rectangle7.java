package Assignment.ClassAndObj;

import java.util.Scanner;

public class Rectangle7 {
    static int area(int l, int b) {
        System.out.println("Calculating area...");
        return l * b;
    }
    /*  This is when we "take no return"  means void
         static void area(int l, int b) {
         perimeter = 2*(l+b);
            System.out.println("Calculating area..."+perimeter);

        }*/
    static int perimeter(int l, int b) {
        System.out.println("Calculating perimeter...");
        return 2 * (l + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length(l) and breadth(b) :");
        int l = sc.nextInt();
        int b= sc.nextInt();

        /*The variables area and perimeter are declared inside the main method to store the,
         return values of the area and perimeter methods, respectively.*/
        int area = area(l,b);
        System.out.println("Area of a rectangle is "+area);

        int perimeter = perimeter(l,b);
        System.out.println("Area of a rectangle is "+perimeter);
    }
}
