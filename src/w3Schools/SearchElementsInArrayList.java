package w3Schools;

import java.util.ArrayList;

public class SearchElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        System.out.println(names);
        System.out.println();
// Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : " +  names.contains("Bob"));

//        Find the index of the first occurrence of an element in an ArrayList
        System.out.println("Index of \"Bob\" : " + names.indexOf("Bob"));
        System.out.println("Index of \"Steve\" : " + names.indexOf("Steve"));
        System.out.println();
//        Find the index of the last occurrence of an element in an ArrayList
        System.out.println("LastIndex of \"Steve\" : " + names.lastIndexOf("Steve"));
        System.out.println("LastIndexOf \"John\" : " + names.lastIndexOf("John"));
        System.out.println("LastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));
    }
    }

