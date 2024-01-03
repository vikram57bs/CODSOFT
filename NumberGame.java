import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 0;
        int number = random.nextInt(100) + 1;
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to the Number Game! Try to guess a number between 1 and 100.");
            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    break;
                } else if (guess > number) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }

                if (attempts >= 7) {
                    System.out.println("Sorry, you've run out of attempts! The correct number was " + number + ".");
                    break;
                }
            }

            score += (7 - attempts);
            attempts = 0;
            number = random.nextInt(100) + 1;

            System.out.println("Your current score is " + score + ".");
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your final score is " + score + ".");
    }
}