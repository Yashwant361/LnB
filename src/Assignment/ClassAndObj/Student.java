package Assignment.ClassAndObj;

import java.util.Scanner;

public class Student {
  // Not According to Question
   /* String name="John";
    int roll_no =2;

    public static void main(String[] args) {
        Student n = new Student();
        Student rn = new Student();
        System.out.println("Name of the student is :"+(n.name));
        System.out.println("Roll no is :"+(rn.roll_no));*/

    // According to Question
    String name;
    int roll_no;

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
                    // By user input
        System.out.println("Enter Name and Roll no of a Student");
        String name = sc.next();
        int roll_no = sc.nextInt();*/

        Student n = new Student(); // Define Class Here
        n.name="John"; // Object 1
        n.roll_no = 2; // Object 2
        System.out.println("Name of the student is :"+(n.name));
        System.out.println("Roll no is :"+(n.roll_no));

    }
}
