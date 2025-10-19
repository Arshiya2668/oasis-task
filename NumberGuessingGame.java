import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int totalRounds = 3;  // You can change number of rounds
        int score = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("---------------------------------------");

        for (int round = 1; round <= totalRounds; round++) {
            int numberToGuess = rand.nextInt(100) + 1;  // Random number 1–100
            int attempts = 0;
            int maxAttempts = 5;
            boolean hasGuessed = false;

            System.out.println("\nRound " + round + " begins! You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (1–100): ");
                int userGuess = input.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
                    int roundScore = (maxAttempts - attempts + 1) * 10;  // More points for fewer attempts
                    score += roundScore;
                    System.out.println("You earned " + roundScore + " points this round!");
                    hasGuessed = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("📉 Too low! Try again.");
                } else {
                    System.out.println("📈 Too high! Try again.");
                }
            }

            if (!hasGuessed) {
                System.out.println("❌ You’ve used all attempts. The number was: " + numberToGuess);
            }
        }

        System.out.println("\n🏁 Game Over!");
        System.out.println("Your total score: " + score);
        System.out.println("Thanks for playing!");
    }
}
