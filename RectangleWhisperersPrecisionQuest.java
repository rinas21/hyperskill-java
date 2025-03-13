import java.util.Scanner;

public class RectangleWhisperersPrecisionQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read length and width
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        double area=length*width;

	System.out.printf("%.2f%n", area);
	// Print result rounded to two decimal places

        scanner.close();
    }
}

