import java.util.Scanner;

public class CelsiusToFahrenheit  {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");

        // Read the input value as a double
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Display the result
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);

        // Close the scanner
        scanner.close();
    }
}
