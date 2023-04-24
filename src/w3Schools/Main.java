package w3Schools;

import java.util.ArrayList;

//Creating an ArrayList and adding new elements to it
public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals .add("Lion");
        animals .add("Tiger");
        animals .add("Dog");
        animals .add("Fox");

        System.out.println(animals );
        // Replacing an element at a particular index in an ArrayList
        animals.set(2,"Elephant");
        System.out.println(animals);

    }
}
