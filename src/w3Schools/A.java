package w3Schools;
// A_n ---> Animal
interface A_n{
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
// Pig "implements" the Animal interface
class Pig implements A_n {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class A {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
