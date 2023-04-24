import java.util.Random;
import java.util.Scanner;
public class GameLogic {
 static int gen_number(){

        Random random = new Random();
        int num = random.nextInt(10);
        return num;

      }
   static void guessNumber(){
      Scanner sc = new Scanner(System.in);
       int i=0; // number of trials that the user has to guess the number
       int gen = gen_number();
       // TO check if the user has guessed the number
       boolean correct = false;
      while ( i < 5) {

           System.out.println("Enter your input number And Remember You Have only 5 Trials");
           int guess = sc.nextInt();

          // if the user guesses correctly, print the congratulation message and exit the program
           if (guess == gen) {
               System.out.println("You guessed it correctly , You Won!!");
               break;
           } else if (guess > gen){
               System.out.println("You guess is wrong ," + (5-i) +"Trials left.");
               i--;
           } else if (guess < gen) {

          System.out.println("You enter smaller number,"+ (5-i) +"Trials left.");
               i--;
           }

           i++;
           if (correct==false){
               System.out.println("You Failed");
           }
       }
    }
}

