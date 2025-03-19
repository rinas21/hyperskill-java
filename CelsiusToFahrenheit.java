import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the temperature in Celsius as a double for more precision
        double celsius = scanner.nextDouble();
        
        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = celsius * 1.8 + 32;
        
        // Print the result formatted to two decimal places
        System.out.printf("%.2f\n", fahrenheit);
    }
}
