package Learn_and_Build;

public class constrc2 {
   int age;
   String name;

    //constrc2(int num,String name)
    constrc2(int age,String name)
    {
        System.out.println("Obj created sucessfully");
        /*age= num;
        name= name1;*/

        age=age;
        name= name;

    // Using "this keyword" which is used for the same "class's element".
        this.age=age;
        this.name=name;

    }
   /* constrc2() {
        System.out.println("Object created succesfully");
    }

    constrc2(int a) {
        System.out.println("2nd constructor");
        }
        constrc2(double a){
            System.out.println("3rd constructor");
        }
        public static void main (String[]args){
           /* constrc2 obj = new constrc2();
            constrc2 obj1 = new constrc2(2);
            constrc2 obj2 = new constrc2(2.5);*/
            // new constructor*/
   public static void main(String[] args) {
    constrc2 obj= new constrc2(25,"yash");
          constrc2 obj1= new constrc2(24,"yash");
         System.out.println(obj.age+obj.name);
         System.out.println(obj.age+obj1.name);
   }

    }

//}

/*
 * Multiple constructors java example

class Car {
    String name;
    double price;

    // Constructor with 1 parameter
    public Car(String name) {
        this.name = name;
        System.out.println("1 parameters constructor is called");
        System.out.println("Car name :" + this.name);
    }

    // Constructor with 2 parameters
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("2 parameters constructor is called");
        System.out.println("Car name :" + this.name + ", price:" + this.price);
    }

    // method
    void run() {
        System.out.println(name + " Car is running...");
    }
}

public class Sample {

    public static void main(String[] args) {

        // Create object with 1 parameter Car(String name)
        // constructor will be called automatically.
        Car maruti = new Car("Maruti");
        maruti.run();

        Car honda = new Car("honda");
        honda.run();

        // Test 2 parameters constructor
        Car marutiWithPrice = new Car("Maruti", 400000.00);
        marutiWithPrice.run();

        Car hondaWithPrice = new Car("honda", 700000.00);
        hondaWithPrice.run();

    }

}*/
