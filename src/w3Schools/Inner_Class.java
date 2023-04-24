package w3Schools;
// Example 1
class OuterClass // This is an OuterClass
{
    int x = 10;
    class InnerClass // This is an InnerClass
    {
        int y = 5;
    }
}
public class Inner_Class {
    public static void main(String[] args) {
        // Creating an Object for OuterClass
        OuterClass myOuter = new OuterClass();

// Creating an object of InnerClass using the object of OuterClass
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        // Accessing the values of x and y using their objects
        System.out.println("Total sum is "+(myOuter.x+myInner.y));
    }
}

/* for more visit
* https://www.geeksforgeeks.org/inner-class-java/
*/

/*Private Inner Class
Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:

Example    */
/*class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
*/

 /*   Static Inner Class
        An inner class can also be static, which means that you can access it without creating an object of the outer class: */

 //       Example
/*
class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);
    }
}
*/

//Note: just like static attributes and methods, a static inner class does not have access to members of the outer class.