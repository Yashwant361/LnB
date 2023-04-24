package w3Schools;


//A_O_C_F_I_C-->Access Outer Class From Inner Class
class Outer_Class {
    int x = 10;
    String y = "I love you";

    class InnerClass {
        public void myInnerMethod() {
            System.out.print(x +"\n" + y);
        }
    }
}

public class A_O_C_F_I_C {
    public static void main(String[] args) {
        Outer_Class myOuter = new Outer_Class();
        Outer_Class.InnerClass myInner = myOuter.new InnerClass();
        myInner.myInnerMethod(); // outputting both values using System.out.println
    }
}

/*
class OuterClass {
  int x = 10;

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class A_O_C_F_I_C{
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}
*/