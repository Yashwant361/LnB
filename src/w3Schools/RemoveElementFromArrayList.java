package w3Schools;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> PL = new ArrayList<>();
        PL.add("C");
        PL.add("C++");
        PL.add("Java");
        PL.add("kotlin");
        PL.add("Python");
        PL.add("Perl");
        PL.add("Ruby");

        System.out.println("Initial list: " +PL);
        PL.remove(5);
        System.out.println("Update list: " +PL);

  //      Remove the first occurrence of the given element from the ArrayList
//        PL.remove(3);
       boolean isRemoved = PL.remove("Kotlin");
        System.out.println("After Remove: " +PL);

//     Remove all the elements that exist in a given collection.
//        PL.remove("Python");
//        PL.remove("Perl");
//        PL.remove("Ruby");
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        PL.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + PL);

        // Remove all the elements that satisfy the given predicate.
//        PL.removeIf(new Predicate<String>()  /**  Predicate is a functional interface */
//        {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("C");
//            }
//        });
        /** :removeIf() call can also be written using lambda expression */
        PL.removeIf(s -> s.startsWith("C"));
        System.out.println("After Removing all elements that start with \"C\": "+PL);
        
        // Remove all elements from the ArrayList
         PL.clear();
        System.out.println("After clear(): " + PL);

    }
}
