package Assignment.Condit_Statement.Cond;

import java.util.Scanner;

public class Statement16Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows:");
        int n = sc.nextInt();

        for (int i = 1 ; i<= n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j);
               // System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/* Using the same for we can generates two kind of patterns such as-
// System.out.print("*");
* Input number of rows:
5
*
**
***
****
*****
-----------
//System.out.print(j);
Input number of rows:
5
1
12
123
1234
12345
 */