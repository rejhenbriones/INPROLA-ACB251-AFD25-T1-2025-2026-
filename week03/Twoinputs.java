import java.util.Scanner;

public class MathOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Ask for second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = 0;

        // Check to avoid division by zero
        if (num2 != 0) {
            quotient = (double) num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);

        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + quotient);
        }

        // Close the scanner
        scanner.close();
    }
}
