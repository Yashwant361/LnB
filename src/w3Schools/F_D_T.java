package w3Schools;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

// F_D_T--->Formatting Date and Time
public class F_D_T {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting:"+myDateObj);

        // Create a DateTimeFormatter object with a custom format and "ofPattern" is method
        DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("E,dd-MM-yyyy HH:mm:ss");
        // Format the date and time using the formatter
                /*The format() method of the LocalDateTime object is called with the DateTimeFormatter
                 object as an argument to format the date and time according to the custom format.
                     The result is stored in the formattedDate variable.*/
        String formattedDate = myDateObj.format(myformatobj);
        System.out.println("After formatting :"+formattedDate);


    }
}
