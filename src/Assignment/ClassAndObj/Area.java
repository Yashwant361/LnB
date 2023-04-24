package Assignment.ClassAndObj;

import java.util.Scanner;

public class Area {
    // Without User input
  /* Scanner sc = new Scanner(System.in);
     static void setDim(){
         int l=2,b=3,p,peri;
         peri = 2*(l+b);
         System.out.println("perimeter of rect is:"+peri);
     }
    static void getArea(){
        int l=2,b=3,p,Area;
        Area = l * b;
        System.out.println("area of rect is :"+Area);
    }*/

    // With User input
    public static void setDim(int l , int b){
        int peri = 2*(l+b);
        System.out.println("Perimeter of rect:"+peri);
    }
    public static void getArea(int l , int b){
        int area = (l * b);
        System.out.println("Area of rect:"+area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length ' l' and breadth 'b' :");
        int l = sc.nextInt();
        int b = sc.nextInt();
         setDim(l,b);
         getArea(l,b);
    }
}
