package Learn_and_Build;


import java.util.Scanner;

public class Hangman {
   //Create an array of words.
    private static String[] words = { "apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew" };
    //The word is then hidden by replacing each character with a dash ("-").
    private static String word = words[(int) (Math.random() * words.length)];// Random number generator,This line of code should be executed only once.

    //The word is then hidden by replacing each character with a dash ("-").
    private static String hiddenWord = new String(new char[word.length()]).replace('\0', '-');
    private static int count = 0;//The player has to guess the word by suggesting one letter at a time.
    private static final int MAX_COUNT = 10  ;

    public static void play() {
        Scanner input = new Scanner(System.in);
        for (int count = 0; count < MAX_COUNT && hiddenWord.contains("-"); count++) {
            System.out.println("Guess a  fruit letter:");
            System.out.println(hiddenWord);
            String guess = input.next();
            if (guess.length() != 1) {
                System.out.println("Please guess a single letter.");
                count--;
                continue;
            }
            char guessChar = guess.charAt(0);
            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guessChar) {
                    hiddenWord = hiddenWord.substring(0, i) + guessChar + hiddenWord.substring(i + 1);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Sorry, that letter is not in the word.");
            }
        }
        if (hiddenWord.contains("-")) {
            System.out.println("You lost! The word was " + word);
        } else {
            System.out.println("Congratulations! You won with " + count + " wrong guesses.");
            System.out.println("Your Guess Word is:"+word);
        }
    }
}
/*This is a simple implementation of the Hangman game in Java.

The game starts by selecting a random word from a predefined array of words. The word is then hidden by replacing each character with a dash ("-"). The player has to guess the word by suggesting one letter at a time.

The game loop continues until the player either guesses the word correctly or reaches the maximum number of allowed incorrect guesses (which is set to 6 in this implementation).

In each iteration of the loop, the player is prompted to enter a letter. If the input is not a single letter, the player is prompted again. Otherwise, the letter is checked against the letters in the hidden word. If the letter is found, the corresponding dashes are replaced with the letter. If the letter is not found, the count of incorrect guesses is incremented.

If the player reaches the maximum number of incorrect guesses, the game ends with a message indicating that the player lost and revealing the word. Otherwise, the game ends with a message indicating that the player won and showing the number of incorrect guesses.

Overall, this is a simple implementation of the Hangman game that demonstrates basic string manipulation and control flow constructs in Java.

*/
