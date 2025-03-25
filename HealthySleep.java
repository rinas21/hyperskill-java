import java.util.Scanner;

public class HealthySleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int A = scanner.nextInt();  // Minimum recommended sleep hours
        int B = scanner.nextInt();  // Maximum recommended sleep hours
        int H = scanner.nextInt();  // Ann's actual sleep hours
        scanner.close();

        // Determine the sleep condition
        if (H < A) {
            System.out.println("Deficiency");
        } else if (H > B) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}

