package w3Schools;

import java.util.*;

public class LL1 {
    public static void main(String[] args) {
        LinkedList< String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.add("list");
        System.out.println(list);
       System.out.println(list.size());

//        for (String n: list)
        for (int i = 0 ; i <  list.size() ; i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

//        list.removeFirst();
//        System.out.println(list);
//        list.removeLast();
//        System.out.println(list);

        /** Reomve element by searching **/
        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());
//        list.addFirst("h");
//        list.addFirst("s");
//        list.addFirst("a");
//        list.addFirst("y");
//        System.out.println(list);

    }
}
