package w3Schools;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class ArrayListIteratorRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);

        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()){
            Integer num = numbersIterator.next();
            if (num % 2 != 0){
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
