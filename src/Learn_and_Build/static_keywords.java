package Learn_and_Build;
public class static_keywords {

    int x = 0;
    String name="Yash";

    void sqr(int num) {
        x = num * num;
        int y=0;
    //  name="yash";
    }

    public static void main(String[] args) {
        static_keywords obj = new static_keywords();

        int y=10; // x is instant variable

        System.out.println(obj.x);
        obj.sqr(5);
        System.out.println(obj.x);
        obj.sqr(20);
        System.out.println(obj.x);
        System.out.println(obj.name);

    }
    /* static Keyword--(i) is used to hold its latest values
    *                  (ii) no need to create any object */
}
