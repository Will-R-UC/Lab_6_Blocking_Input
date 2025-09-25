import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonalLength = 0.0;
        String badInput = "";
        boolean validInput = false;

        System.out.println("Information About A Rectangle.\n");

        do {
            System.out.print("> Enter the length of your rectangle: ");
            if (consoleIn.hasNextDouble()) {
                length = consoleIn.nextDouble();
                consoleIn.nextLine();
                validInput = true;
            } else {
                badInput = consoleIn.nextLine();
                System.out.println("Invalid side length: " + badInput);
            }
        } while(!validInput);

        validInput = false;

        do {
            System.out.print("> Enter the width of your rectangle: ");
            if (consoleIn.hasNextDouble()) {
                width = consoleIn.nextDouble();
                consoleIn.nextLine();
                validInput = true;
            } else {
                badInput = consoleIn.nextLine();
                System.out.println("Invalid side length: " + badInput);
            }
        } while(!validInput);

        System.out.print("\n");

        area = length * width;
        System.out.println("The area of your rectangle is: " + area);
        perimeter = 2 * length  + 2 * width;
        System.out.println("The perimeter of your rectangle is: " + perimeter);
        diagonalLength = Math.sqrt(length * length + width * width);
        System.out.println("The diagonal of your rectangle is: " + diagonalLength);
    }
}

