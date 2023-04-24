package Assignment.Condit_Statement.Cond;
//10.Display the first 10 natural numbers
import java.util.Scanner;

public class Statement10 {
    public static void main(String[] args) {

        //Display the first 10 natural numbers without user input
       /*
        int n = 10;
        for (int i = 1 ; i<=n ; i++){
            System.out.println(i);
        }*/

       //Display the first 10 natural numbers with user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  starting number: ");
        int n = sc.nextInt();
        int N=0 ;
        for (int i = 1 ; i <= N +10 ; i++){
            System.out.println(i);
        }
    }

}
