package w3Schools;

// Polymorphism --> by Method OVERRIDDING
/*public class Test_2 {
    void chess(int a ) // Method 1 with ONE arg with same class
    {
        System.out.println("Let's play chess!!!");
    }

}
class Test_3 extends Test_2 {
    void chess(int a, int b) // Method 1 with TWO arg with same class
    {
        System.out.println("I don't  play football");
    }

    public static void main(String[] args) {
        Test_3 t3 = new Test_3();
        t3.chess(10);
        t3.chess(10,20);
    }
 // this type of polymorphism is known as "RUN-TIME" Polymorphism,due to Method Overloading.
} */

//----------------------------------------------------//
// Example of polymorphism by seq. of arg
/*public class Test_2 {
    void chess(int a , String b ) // Method 1 with ONE arg with same class
    {
        System.out.println("Let's play chess!!!");
    }

}
class Test_3 extends Test_2 {
    void chess(String a, int b) // Method 1 with TWO arg with same class
    {
        System.out.println("I don't  play football");
    }

    public static void main(String[] args) {
        Test_3 t3 = new Test_3();
        t3.chess(10 , "Yash");
        t3.chess("Yassu",20);
    }
    // this type of polymorphism is known as "RUN-TIME" Polymorphism,due to Method Overloading.
} */
//----------------------------------------------------//
// Example of polymorphism by Type of arg
public class Test_2 {
    void chess( String b ) // Method 1 with ONE arg with same class
    {
        System.out.println("Let's play chess!!!");
    }

}
class Test_3 extends Test_2 {
    void chess(String a) // Method 1 with ONE arg with same class
    {
        System.out.println("I don't  play football");
    }

    public static void main(String[] args) {
        Test_3 t3 = new Test_3();
        t3.chess( "Yash");
        t3.chess("Yassu");
    }
    // this type of polymorphism is known as "RUN-TIME" Polymorphism,due to Method Overloading.
}