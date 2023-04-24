package w3Schools;

// Polymorphism --> by Method OVERLOADING

/*public class Test {
    void show(int a , int b) // Method 1 with two arg with same class
    {
        System.out.println("I am method number one");
    }
    void show(int a) // Method 2 with One arg
    {
        System.out.println("I am method number two");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10,20);
        t.show(10);
    }
// this type of polymorphism is known as "Compile time" Polymorphism,due to Method Overloading.
} */
//----------------------------------------------------//
// Example of polymorphism by seq. of arg
 /*public class Test {

    // Using Seq of arg here
    void show(int a , String b) // Method 1 with two arg  with same class
    {
        System.out.println("I am method number one");
    }
    void show(String a,int b) // Method 2 with One arg
    {
        System.out.println("I am method number two");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10,"Yash");
        t.show("Yassu",10);
    }
} */

//----------------------------------------------------//
// Example of polymorphism by Type of arg
public class Test {

    // Using Type of arg
    void show(int a ) // Method 1 with one arg  with same class
    {
        System.out.println("I am method number one");
    }
    void show(String a) // Method 2 with One arg
    {
        System.out.println("I am method number two");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10);
        t.show("Yassu");
    }
}
