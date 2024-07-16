import java.util.Scanner;
import java.util.Random;

public class Module4JavaIIAssignmentDay10 {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int attempts = 5; // Number of attempts allowed

        while (attempts > 0) {
            System.out.print("Guess the number (1-100): ");
            int userGuess = scanner.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("The number is greater.");
            } else if (userGuess > targetNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("Congratulations! You found the number.");
                break; // Exit the loop if the guess is correct
            }

            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
        }

        scanner.close(); // Close the scanner
    }
}
