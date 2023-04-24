
class Const{
    int id;
    String name;
    Const()
    {
        System.out.println("im Constructer");
        System.out.println(id+" "+name);
    }

}
public class Constr {
    public static void main(String[] args) {
        new Constr();
    }
}
