import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int randomNumber;
	
    public static void main(String[] args) {
       
        // pick a random number(Instansitating the random object)
        Random random = new Random();
        //Created a randomNumber variable and intialized it to have random numbers 
        randomNumber = random.nextInt(100) + 1;
       

        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	   System.out.println( "Can you guess what it is?...");
       

        makeAGuess();
    }


private static void makeAGuess() {
    // Create a Scanner object
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number between 1 and 100: ");

    
    if (scanner.hasNextDouble()) {
        double guess = scanner.nextDouble();

        //If statement to make sure that the user input is within the range
        if (guess < 1 || guess > 100) {
            System.out.println("Please enter a number within 1 to 100.");
            makeAGuess(); 
            return;
        }

        // Compare guess to random number
        if (guess == randomNumber) {
            System.out.println("Correct! You guessed the number!");
        } else if (guess < randomNumber) {
            System.out.println("Too low. Try again.");
            makeAGuess(); 
        } else {
            System.out.println("Too high. Try again.");
            makeAGuess(); 
        }

    } else {
        // Input was not an integer
        System.out.println("That wasn't a valid number.");
        scanner.next();
        makeAGuess(); 
     }
    }

}