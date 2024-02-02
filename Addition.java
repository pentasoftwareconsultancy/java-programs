// import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Ask the user to input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check which number is greater
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal");
        }

        // Perform addition
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
