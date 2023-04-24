package Assignment.ClassAndObj;

public class Average {
    //average of three numbers not entered by user !!!!
    static void calculateavg(int a , int b , int c){
        int sum=0 , avg;
        sum= a+b+c;
        avg= sum/3;
        System.out.println("Avg of given input  is :"+avg);
    }


    public static void main(String[] args) {
        calculateavg(1,2,3);
    }
}

 //average of three numbers entered by user !!!!

/*import java.util.*;
public class Average {
    static double Average(double a,double b,double c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers respectively");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double avg = Average(a,b,c);//formula
        System.out.println("Average of "+a+","+b+","+c + "is "+ avg);

    }
}*/
