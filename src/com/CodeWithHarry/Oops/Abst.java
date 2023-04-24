package com.CodeWithHarry.Oops;

//Abstraction using constructor

/*abstract class testing{

    abstract void show(); // show naam ka teacher

    void display(){
        System.out.println("H / W");
    }
}

public class Abst {

    public static void main(String[] args) {
        testing obj = new testing(){ // teacher ko call ke diya
            @Override
            void show() {
                System.out.println("Hello Yasu");
        };
            testing obj = new testing(){ // teacher ko call ke diya
                @Override
                void show() {
                    System.out.println("Hello Yash");
                };

    }
}
*/

/*
abstract class Animal{
    abstract void animalsound();

}
public class Abst {
    public static void main(String[] args) {
    public void sleep(){
            System.out.println();
        }
    }


}
*/


// Abstraction using Inheritance
/*
abstract class testing{
    abstract void show();
    abstract void display();
}

class Physics extends testing{
      void show(){}
      void display(){}
    //void rain(){}
}
class Python extends testing{
    void show(){}
    void display(){}
    //void rain(){}
}
public class Abst {
}
 */
/*
abstract class testing{
    abstract void show();
    abstract void display();
}

abstract class Physics extends testing{

}
class Python extends testing{
    void show(){}
    void display(){}
    //void rain(){}
}
public class Abst {
}*/
//Type 4 abstraction
/*abstract class testing{
    abstract void show();
    abstract void display();
}

abstract class Physics extends testing{
    abstract void view();
}
class Python extends Physics{
   void show(){
       System.out.println("Hello earth!!");
   }
    void display(){
        System.out.println("i'm from earth 616");
    }
    void view(){
        System.out.println("Good to see you!!");
    }
}
public class Abst {
    public static void main(String[] args) {
        Python obj = new Python();
        obj.show();
        obj.display();
        obj.view();
    }
} */
/*

 * oops
 * class and object
 * inhertiance
 * Encapsulation
 * Abstraction- Hiding the implementation

 Abstract methods--
 1.Which  contains abstract as well as non-abstract methods.
 2.Abstract class cannot be instantiated create its object
 *
 */
/*
abstract class Data{
    Data(){
        System.out.println("Hello Data");
    }
}
class DataMonitoring extends Data{
    DataMonitoring() {
        super();
    }
   /* void show(){
        System.out.println("show");
    }*/
/*}
public class Abst {
    public static void main(String[] args) {
        DataMonitoring obj = new DataMonitoring();

    }
}*/
//Super Method should be call first priority
abstract class vechical{
    abstract void wheels();
}
class Car extends vechical{
    void wheels(){

        System.out.println("4 wheels");
    }
}
class Bike extends vechical{
    void wheels(){

        System.out.println("2 wheels");
    }
}
public class Abst {
    public static void main(String[] args) {
     //  Car obj = new Car();
     //   Bike obj1 = new Bike();
    //    Bike obj1 = new Bike();
        vechical obj1 = new Car();
        vechical obj2 = new Bike();
        obj1.wheels();
        obj2.wheels();
    }
}