import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        double temperatureC = 0;
        double temperatureF = 0;
        String badInput = "";
        boolean validInput = false;

        System.out.println("Convert °C to °F\n");

        do {
            System.out.print("Enter a temperature in °C: ");
            if (consoleIn.hasNextDouble()) {
                temperatureC = consoleIn.nextDouble();
                consoleIn.nextLine();
                validInput = true;
            } else {
                badInput = consoleIn.nextLine();
                System.out.println("Invalid temperature: " + badInput);
            }
        } while (!validInput);

        temperatureF = (temperatureC * 9.0 / 5.0) + 32.0;

        System.out.println(temperatureC + " °C is " + temperatureF + " °F");
    }
}