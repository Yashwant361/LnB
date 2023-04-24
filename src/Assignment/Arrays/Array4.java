package Assignment.Arrays;

//4.Write a Java program to calculate the average value of array elements
public class Array4 {
    public static void main(String[] args) {
        int [] num = {5,4,3,2,1};
        int sum = 0;

        for (int i:num)
        {
            sum = sum + i;
        }
    //FORMULA: Sum of all numbers / Total number
            double avg = sum / num.length;
        System.out.println("Avg value is:"+avg);
    }
}
