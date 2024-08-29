import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       
        int min = 1;
        int max = 100;

        
        int randomNumber = random.nextInt(max - min + 1) + min;

        
        int maxAttempts = 5;

        
        int attempts = 0;

        
        boolean guessedCorrectly = false;
        while (attempts < maxAttempts && !guessedCorrectly) {
            System.out.println("Guess a number between " + min + " and " + max + ":");
            int userGuess = scanner.nextInt();

            
            attempts++;

            
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                guessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        
        if (!guessedCorrectly) {
            System.out.println("You ran out of attempts! The number was: " + randomNumber);
        }

        
        scanner.close();
    }
}