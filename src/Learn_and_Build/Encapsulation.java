package Learn_and_Build;

class Test{
    private int a;
    private float b;

    public int getA() // to give the values
    {
        return a;
    }

    public void setA(int a) // value initilize
    {
        this.a = a;
    }
    public int getB() // to give the values
    {
        return a;
    }

    public void setB(float b) // value initilize
    {
        this.b = b;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Test a = new Test();
        a.setA(5);
        a.setB(3.3f);
        System.out.println(a.getA());
        System.out.println(a.getA());
    }
}

