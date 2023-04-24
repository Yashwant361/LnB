package Assignment.Condit_Statement.Cond;
//3.Take three numbers from the user and print the greatest number.
import java.util.*;
public class Statement3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 1st number,2nd number and 3rd number ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if ((num1 > num2) && (num1 > num3))
                System.out.println("The greatest: " + num1);
        if ((num2 > num1) && (num2 > num3))
                System.out.println("The greatest: " + num2);
        if ((num3 > num1) && (num3 > num2))
                System.out.println("The greatest: " + num3);
    }
}
