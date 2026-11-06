import java.util.*;

public class GuessNumberGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();

            int number = rand.nextInt(100);
            int guess;
            int attempts = 0;

            System.out.println("Guess the Number Game!");
            System.out.println("Guess a number between 1 and 100.");

            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too high! Try again.");
                } 
                else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } 
                else {
                    System.out.format("Congratulations! You guessed it.It was " + number);
                    System.out.println("Number of attempts: " + attempts);
                }

            } while (guess != number);
        }
    }
}
