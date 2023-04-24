/*public class SumNumbers {
    public static void main(String[] args) {
        int sum=1,total;
        for (int i =0;i<=10;i++)
        {
            sum+=i;
            total =sum;
            System.out.println(sum);
        }
    }
}*/
import java.util.Scanner;
class Ans{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<10;i++){
            System.out.println("Enter a number");
            sum = sum+in.nextInt();
            /* To find the avg value of numbers instead of
             using avg formula. We can use "in.nextInt()"*/
        }
        System.out.println("Sum is "+sum);
    }
}