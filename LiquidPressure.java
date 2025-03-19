import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the inputs
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        
        // Gravitational constant
        double gra = 9.8;
        
        // Calculate pressure
        double pressure = density * height * gra;
        
        // Print the formatted pressure
        System.out.printf("%.2f\n", pressure);
    }
}
