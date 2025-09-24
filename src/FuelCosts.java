import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        double gasTankCapacity = 0.0;
        double fuelEfficiencyMPG = 0.0;
        double priceOfGasPerGallon = 0.0;
        double costToDriveOneHundredMiles = 0.0;
        double distanceOnFullTank = 0.0;
        String badInput = "";
        boolean validInput = false;

        do {
            System.out.print("> Enter the capacity of gas (in gallons) for your car's tank: ");
            if (consoleIn.hasNextDouble()) {
                gasTankCapacity = consoleIn.nextDouble();
                if (gasTankCapacity >= 0.0) {
                    validInput = true;
                } else {
                    System.out.println("Number should not be negative: " + gasTankCapacity);
                    gasTankCapacity = 0.0;
                }
                consoleIn.nextLine();
            } else {
                badInput = consoleIn.nextLine();
                System.out.println("Invalid number: " + badInput);
            }
        } while (!validInput);

        validInput = false;

        //TODO: Make this a method so the code stays DRY
        do {
            System.out.print("> Enter the fuel efficiency (in miles per gallon) of your car's tank: ");
            if (consoleIn.hasNextDouble()) {
                fuelEfficiencyMPG = consoleIn.nextDouble();
                if (fuelEfficiencyMPG >= 0.0) {
                    validInput = true;
                } else {
                    System.out.println("Number should not be negative: " + fuelEfficiencyMPG);
                    fuelEfficiencyMPG = 0.0;
                }
                consoleIn.nextLine();
            } else {
                badInput = consoleIn.nextLine();
                System.out.println("Invalid number: " + badInput);
            }
        } while (!validInput);

        validInput = false;

        do {
            System.out.print("> Enter the price (in dollars) of gas per gallon: ");
            if (consoleIn.hasNextDouble()) {
                priceOfGasPerGallon = consoleIn.nextDouble();
                if (priceOfGasPerGallon >= 0.0) {
                    validInput = true;
                } else {
                    System.out.println("Number should not be negative: " + priceOfGasPerGallon);
                    priceOfGasPerGallon = 0.0;
                }
                consoleIn.nextLine();
            } else {
                badInput = consoleIn.nextLine();
                System.out.println("Invalid number: " + badInput);
            }
        } while (!validInput);

        costToDriveOneHundredMiles = (priceOfGasPerGallon / fuelEfficiencyMPG) * 100.0;
        distanceOnFullTank = gasTankCapacity * fuelEfficiencyMPG;

        System.out.println("The cost to drive 100 miles is $" + costToDriveOneHundredMiles + ".");
        System.out.println("The car can go " + distanceOnFullTank + " miles on a full tank of gas.");
    }
}
