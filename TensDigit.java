import java.util.Scanner;

public class TensDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  // Read the input as a string

        if (Math.abs(number) < 10) { // If it's a single digit, no second last digit
            System.out.println("No second last digit exists.");
        } else {
            int secondLastDigit = (number / 10) % 10;  // Divide by 10, then find remainder of 10
            System.out.println(secondLastDigit);
        }
    }
}
