import java.util.Scanner;

public class GratuityCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the subtotal
        System.out.print("Enter the subtotal: ");
        double subtotal = scanner.nextDouble();

        // Prompt the user to enter the gratuity rate
        System.out.print("Enter the gratuity rate (as a percentage): ");
        double gratuityRate = scanner.nextDouble();

        // Calculate the gratuity
        double gratuity = (gratuityRate / 100) * subtotal;

        // Calculate the total
        double total = subtotal + gratuity;

        // Display the results
        System.out.printf("Gratuity: $%.2f\n", gratuity);
        System.out.printf("Total: $%.2f\n", total);

        // Close the scanner
        scanner.close();
    }
}
