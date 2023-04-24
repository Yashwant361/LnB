package w3Schools;

import java.util.ArrayList;
import java.util.Collections;

//L_T_A_L-->Loop Through an ArrayList
/**public class L_T_A_L {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
//        for (int i = 0 ; i <= cars.size() ; i++){
//            System.out.println(cars.get(i));
//        }
        //  loop through an ArrayList with the for-each loop:
        for (String a: cars) {
            System.out.println(a);

        }
    }
} */

/** Example:- Create an ArrayList to store numbers (add elements of type Integer): */
 /**public  class L_T_A_L {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);
        for (Integer n:
             number) {
            System.out.println(n);

        }
    }
} */
 /**Example:- Sort an ArrayList of Strings in alphabetically  */
    /**public class L_T_A_L {
     public static void main(String[] args) {
         ArrayList<String> Cars = new ArrayList<>();
         Cars .add("BMW");
         Cars .add("Ford");
         Cars .add("Mazda");
         Collections.sort(Cars);
         for (String s:
              Cars) {
             System.out.println(s);

          }
        }
    } */
/**Example:- Sort an ArrayList of Strings in numberically  */
public class L_T_A_L {
    public static void main(String[] args){
    ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);
        for (Integer n:
            myNumbers ) {
            System.out.println(n);

        }
    }
}