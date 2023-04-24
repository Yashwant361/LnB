package Learn_and_Build;

/*public class HngMn {
}*/
import java.util.Scanner;

public class HngMn {

    // Function that implements the word guessing game
    public static void guessingWordGame() {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Define the words to be guessed
        String[] words = { "computer", "programming", "algorithm", "variable", "function" };

        // Generate a random index for selecting a word from the list
        int index = (int) (Math.random() * words.length);

        // Get the word to be guessed
        String word = words[index];

        // Given K trials
        int K = 7 ;

        int i;

        System.out.println("Guess the word within " + K + " trials.");

        // Create a StringBuilder with underscores to represent the letters to be guessed
        StringBuilder guessedLetters = new StringBuilder();
        for (int j = 0; j < word.length(); j++) {
            guessedLetters.append("_");
        }

        // Iterate over K Trials
        for (i = 0; i < K; i++) {

            System.out.println("Guess a letter :");

            // Take input for guessing
            String guess = sc.next();

            // If the entire word is guessed
            if (guess.equals(word)) {
                System.out.println("Congratulations! You guessed the word.");
                break;
            }

            // If the guessed letter is in the word
            if (word.contains(guess)) {
                // Replace the underscores with the guessed letter
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == guess.charAt(0)) {
                        guessedLetters.setCharAt(j, guess.charAt(0));
                    }
                }
                System.out.println("Correct! The word now looks like this: " + guessedLetters);
            } else {
                System.out.println("Sorry, the word does not contain the letter " + guess);
            }

            // If the word has been completely guessed
            if (guessedLetters.toString().equals(word)) {
                System.out.println("Congratulations! You guessed the word.");
                break;
            }
        }

        if (i == K) {
            System.out.println("You have exhausted " + K + " trials.");
            System.out.println("The word was " + word);
        }
    }

    // Driver Code
    public static void main(String arg[]) {
        System.out.println("Welcome to Hangman!");
        System.out.println("--------------------");
        // Function Call
        guessingWordGame();
    }
}
