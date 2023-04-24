package w3Schools;

//  An example of multi-level inheritance

 class Method_A // Method 1
 {
    public void method_X()
    {
        System.out.println("Class X method");
    }
    static class Method_B extends Method_A
    {
       public void method_Y()
       {
           System.out.println("Class Y method");
       }
    }
    static  class Method_C extends Method_B
    {
        public void method_Z()
        {
            System.out.println("Class Z method");
        }
    }
    public static void main(String[] args) {
        Method_C obj = new Method_C();
        obj.method_X();
        obj.method_Y();
        obj.method_Z();
    }
}
