package Assignment.Condit_Statement.Cond;
import java.util.Scanner;
public class Statement19pattern {
    public static void main(String[] args) {
        int i, j, n,k;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for ( i = 1; i <= n; i++) {
            for ( j = 1; j <= n-i; j++) {
                System.out.print("_");
            }
            for ( k = 1; k <= i; k++) {
                System.out.print(i + "_");
            }
            System.out.println();
        }
    }
}