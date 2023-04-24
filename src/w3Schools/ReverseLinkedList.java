package w3Schools;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");

        //Print the original list
        System.out.println(list);

        //Reverse the LinkedList
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = list.size() - 1 ; i >=0 ; i--){
            reversedList.add(list.get(i));
        }
          //Print the reversed lsit
        System.out.println("Reversed List: "+reversedList);
    }
}
