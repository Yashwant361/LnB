package Assignment.ClassAndObj;

import java.util.Scanner;

public class Complex // first class a class named 'complex'.
{
    double real, imag;

    public Complex(double r, double i)/* Each method takes two Complex objects as parameters and returns a new Complex object that
    represents the result of the operation.*/
    {
        this.real = r;
        this.imag = i;
    }
    static  Complex add(Complex c1 , Complex c2) // Method 1
    {
        double real = c1.real + c2.real;
        double imag = c1.imag + c2.imag;
        return new Complex(real, imag);
    }
    static Complex sub(Complex c1 , Complex c2) // Method 2
    {
        double real = c1.real - c2.real;
        double imag = c1.imag - c2.imag;
        return new Complex(real, imag);
    }
    static Complex pro(Complex c1 , Complex c2) // Method 3
    {
        double real = c1.real * c2.real - c1.imag * c2.imag;
        double imag = c1.real * c2.imag + c1.imag * c2.imag;
        return new Complex(real, imag);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary parts of the first complex number: ");
        double w = sc.nextDouble();
        double x = sc.nextDouble();
        Complex c1 = new Complex(w,x); // define a class,decleared at the top

        System.out.println("Enter the real and imaginary parts of the second complex number: ");
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        Complex c2 = new Complex(x,y); // define a class,,decleared at the top

        Complex sum = add(c1,c2);
        Complex diff = sub(c1,c2);
        Complex product = pro(c1,c2);

        System.out.println("Sum: " + sum.real + " + " + sum.imag + "i");
        System.out.println("Difference: " + diff.real + " + " + diff.imag + "i");
        System.out.println("Product: " + product.real + " + " + product.imag + "i");
    }
}
