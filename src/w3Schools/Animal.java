package w3Schools;

// 1. SINGLE INHERITANCE
/*public class Animal  // Parent Class
{
    void eat()
    {
        System.out.println("I am eating");
    }

}
class Dog extends Animal{
    public static void main(String[] args) {
        Dog d = new Dog(); // Create an object
        d.eat();
    }
}*/
//2.SINGLE INHERITANCE example 2
public class Animal{
  public void cow()
    {
        System.out.println("cow gives a milk");
    }

    public static class bird extends Animal {
    public  void bird(){
            System.out.println(" bird gives egg");
        }
    }
    public static void main(String[] args) {
       /* Animal a = new Animal();
        a.cow(); */
        bird obj = new bird();
        obj.cow();  // call cow method from parent class
        obj.bird(); // call bird method from child class
    }

}

//