package w3Schools;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
    public static void main(String[] args) {
        List<String> topComp = new ArrayList<>();
        topComp.add("Google");
        topComp.add("Microsoft");
        topComp.add("Apple");
        topComp.add("Facebook");
        topComp.add("Amazon");

        // Check if an ArrayList is empty
        System.out.println(" Is the topComp list empty?: "+topComp.isEmpty());

        // Find the size of an ArrayList
        System.out.println("Here is the top " + topComp.size() + " companies in the world");
        System.out.println(topComp);

        // Retrieve the element at a given index
        String bestComp = topComp.get(0);
        String secondbestComp = topComp.get(1);
        String lastComp = topComp.get(topComp.size()-1);
        System.out.println(" Best Comp " +bestComp);
        System.out.println(" SecondbestComp " +secondbestComp);
        System.out.println(" lastComp "+lastComp);

        // Modify the element at a given index
        topComp.set(4,"Walmart");
        System.out.println("Modified top Companies list " + topComp);

    }
}
