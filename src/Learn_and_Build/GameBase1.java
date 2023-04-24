package Learn_and_Build;

import java.util.Random;
import java.util.Scanner;

// Guess the Words
public class GameBase1 {
    static String [] Movies = {"jab we met","JohnWick 4" , "Martian" , "Iron man"};

    static String gen_Word(){
        Random random = new Random();
        int index = random.nextInt(5);
       // System.out.println(Movies[index]);
        return Movies[index];
    }
    static void guessWord(){
        Scanner sc = new Scanner(System.in);
        String movie = gen_Word();
        System.out.println("Guess the movies :" +movie.length()+" Words:" + gen_Word() );
        String guess = sc.next();

        if (guess.equalsIgnoreCase(movie)){
            System.out.println("You guess the correct Movie Name");
        }
        else {
            System.out.println("You Loose");
        }
    }

}
// take character
// till the saturday
// also check the index