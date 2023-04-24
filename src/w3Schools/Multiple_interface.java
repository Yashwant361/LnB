package w3Schools;

interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

abstract class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }

    // No implementation of myOtherMethod() is provided here
}

class SubClass extends DemoClass {
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class Multiple_inheritance{
    public static void main(String[] args) {
        SubClass myObj = new SubClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
