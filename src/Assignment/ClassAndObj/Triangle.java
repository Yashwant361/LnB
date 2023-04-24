package Assignment.ClassAndObj;

import java.util.Scanner;
   // WITHOUT TAKING USER INPUT---> According to question
/*public class Triangle {
   /* static void area(){
        int h=3,b=4,
        area_of_trainge = (h*b)/2;
        System.out.println("Area_of_trainge is:"+area_of_trainge);
    }
    static void peri(){
        int l=3,b=4,h=5,
        peri_of_triangle = l + h + b;
        System.out.println("Perimeter_of_triangle:"+peri_of_triangle);
    }

    public static void main(String[] args) {
        area();
        peri();

    }*/
   // By user input
  /*  static void area(int h , int b){
            int  area_of_triangle= (h*b)/2;
    }
    static void peri(int l , int b , int h){
            int peri_of_triangle = l + h + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" For area ,enter length 'h' and breadth 'b':");
        int h = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Triangle is: " + area);
        System.out.println("------------");
        System.out.println("For Perimeter , enter 'l' , 'b' and 'h' :");
        int l = sc.nextInt();
        int br = sc.nextInt();
        int ht= sc.nextInt();

        // Creating an object of class area
        Triangle A1= new Triangle();
        System.out.println("Area of Triangle is: " );
    }
}*/
       // BY USER INPUT---> With According to question
import java.util.Scanner;

public class Triangle {
    static int area(int h, int b) {
        return (h * b) / 2;
    }

    static int peri(int l, int b, int h) {
        return l + b + h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Area of Triangle!!!");
        System.out.println("Enter length 'h' and breadth 'b':");
        int h = sc.nextInt();
        int b = sc.nextInt();
        int area = area(h, b);
        System.out.println("Area of Triangle is: " + area);
        System.out.println("------------");
        System.out.println("For Perimeter of Triangle!!!");
        System.out.println("For Perimeter, enter 'l', 'b' and 'h':");
        int l = sc.nextInt();
        int br = sc.nextInt();
        int ht = sc.nextInt();
        int perimeter = peri(l, br, ht);
        System.out.println("Perimeter of Triangle is: " + perimeter);
    }
}


