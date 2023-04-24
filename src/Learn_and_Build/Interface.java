package Learn_and_Build;
/*
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}*/


interface Parent1 {
  /* abstract void show();
   abstract void display();*/
   void view();
}
interface Parent11{
    void view();
}
interface Child1 extends Parent1{
    void show();
}
//class Imp implements Game{

class Imp implements Child1 {
  //  @Override
    public void show(){
        System.out.println("Welcome!!");
    }
  //  @Override
    public void display(){
        System.out.println("To learn and build,");
    }
 //   @Override
    public void view(){
        System.out.println("for bright future");
    }

    public static void main(String[] args) {
        Imp mygame= new Imp();
        mygame.show();
        mygame.display();
        mygame.view();

    }
}