package w3Schools;
 // An example of code showing the concept of hierarchical inheritance

public class Animals {
   public  void eat()
    {
        System.out.println("eating...");
    }
    static class Dog extends Animals{
        void bark(){
            System.out.println("barking...");
        }
    }
    static class Cat extends Animals{
        void meow(){
            System.out.println("meowing..");
        }
    }
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.meow();
        obj.eat();
        Dog dogObj = new Dog();
        dogObj.bark(); // call bark method from child class

    }
}
