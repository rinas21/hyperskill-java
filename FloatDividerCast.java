import java.util.Scanner;

public class FloatDividerCast {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a float value: ");
        
        // Read float value from user
        float floatValue = scanner.nextFloat();

        // Divide the float value by 2 and round down by casting to int
        int result = (int) (floatValue / 2);

        // Print the result
        System.out.println("Result after dividing and rounding down: " + result);

        // Close the scanner
        scanner.close();
    }
}
