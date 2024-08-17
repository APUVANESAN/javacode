import java.util.Scanner;
import java.util.Random;

 class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("Guess a number between 1 and 100:");

        while (!win) {
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        System.out.println("Congratulations! You've guessed the correct number in " + numberOfTries + " tries.");
    }
}
