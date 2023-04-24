package w3Schools;

//Practice questions on subclass
 class Pclass1{
    void pmethod(){
        System.out.println("This is parent class");
    }
}
class Cclass extends Pclass1{
    void cmethod(){
        System.out.println("This is child class");
    }
}
public class Pclass {
    public static void main(String[] args) {
        Cclass myclass = new Cclass();
        myclass.cmethod();

        Pclass1 mycls = new Pclass1();
        mycls.pmethod();
        // Callling method of parent class by object of child class
        myclass.pmethod();
    }
}
