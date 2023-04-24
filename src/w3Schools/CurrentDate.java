package w3Schools;

import java.time.LocalDate; // import the LocalTime class
import java.time.LocalTime; // import the LocalDateTime class
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.DayOfWeek;
public class CurrentDate {
    public static void main(String[] args) {

        // Create a date object
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        LocalDateTime mydt = LocalDateTime.now();

        // Display the current date , current time and both
        System.out.println("Todays date:"+mydate);
        System.out.println("Todays time:"+mytime);
        System.out.println("Both time and date:"+mydt);

    }
}
