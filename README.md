//Create a number guessing game (using the WHILE LOOP) where:

//A random number between 1 and 100 is generated.
//The user is asked to guess the number.
//If the user's guess is less than the number, print "The number is greater".
//If the user's guess is greater than the number, print "The number is smaller".
//If the user's guess is equal to the number, print "Congratulations! You found the number".
//If the user runs out of attempts, print "Sorry, you've used all your attempts. The number was: [number]".
//Repeat the process 5 times.



import java.util.Scanner;
import java.util.Random;

public class Module4JavaIIAssignmentDay10 {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int attempts = 5;

        while (attempts > 0) {
            System.out.print("Guess the number (1-100): ");
            int userGuess = scanner.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("The number is greater.");
            } else if (userGuess > targetNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("Congratulations! You found the number.");
                break;
            }

            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
        }

        scanner.close();
    }
}
