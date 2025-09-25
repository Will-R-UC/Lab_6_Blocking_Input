import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        Random rand = new Random();
        int randomNumberToGuess = rand.nextInt(10) + 1;
        int userGuess = 0;
        String badInput = "";
        boolean validGuess = false;

        System.out.println("I have randomly generated an integer between 1 and 10. Try to guess it!");

        do {
            System.out.print("> Guess: ");
            if (consoleIn.hasNextInt()) {
                userGuess = consoleIn.nextInt();
                if (1 <= userGuess && userGuess <= 10) {
                    validGuess = true;
                } else {
                    System.out.println("Your guess must be between 1 and 10, not: " + userGuess);
                    userGuess = 0;
                }
                consoleIn.nextLine();
            } else {
                badInput = consoleIn.nextLine();
                System.out.println("You  guessed " + badInput + ", not an integer between 1 and 10. Try again.");
            }
        } while(!validGuess);

        System.out.print("\n");

        if (userGuess == randomNumberToGuess) {
            System.out.println("The number was: " + randomNumberToGuess + ". Your guess was on the money!");
        }
        else if (userGuess > randomNumberToGuess) {
            System.out.println("The number was: " + randomNumberToGuess + ". Your guess was high!");
        } else {
            System.out.println("The number was: " + randomNumberToGuess + ". Your guess was low!");
        }
    }
}
