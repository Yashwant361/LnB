package Assignment.Condit_Statement.Cond;
//5.Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday
import java.util.Scanner;

public class Statement5 {
    public static void main(String[] args) {
        System.out.println("Enter Number Between 1 to 7 to display a week day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
 /*
    //Create a method to show the day of the week
        //getDayName(day) is a method or function that takes a parameter called day and returns the
        // name of the day of the week corresponding to that day.
        System.out.println(getDayName(day));
    }
      // Get the name for the week
      public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "sunday"; break;
            default:dayName = "Invalid day range";
        }
          return  dayName;

  */
        // PRINT WEEK DAY USING CONDITIONAL LOOPS
        if (day >= 1 && day <=7){
            System.out.println(getDayName(day));
        }
        else {
            System.out.println("Invalid day range");
        }
      }

    public static String getDayName(int day) {
        String [] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return dayOfWeek[day - 1]; //the method calculates the index of the day in the daysOfWeek array by subtracting 1
                                   // from the input number day
    }
}
