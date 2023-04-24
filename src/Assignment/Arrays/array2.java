package Assignment.Arrays;
//2. Write a Java program to sum values of an array.
public class array2 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        int sum =0;
        for (int i: num)
        {
            sum += i; // i is the initialize value
        }
        System.out.println("Sum is :"+sum);
    }
}
