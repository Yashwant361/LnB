package Assignment.ClassAndObj;

import java.util.Scanner;

public class Students {
    static void Student1(){
        int roll_no = 01;
        long phone_num = 9862351475L;
        String name = "John";
        System.out.println("Name:"+name+"\nPhone number:"+phone_num+ "  \nRoll no is:"+roll_no);
        System.out.println("\n");
    }
    static  void Studnet2(){
        int roll_no = 02;
        long phone_num = 7652148634L;
        String name = "Sam";
        System.out.println("Name:"+name+"\nPhone number:"+phone_num+ "  \nRoll no is:"+roll_no);
    }

    public static void main(String[] args) {
        Student1();
        Studnet2();
    }
}
