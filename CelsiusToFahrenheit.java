import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float celsius = scanner.nextFloat();
        System.out.println(celsius * 1.8 + 32);

    }

}