import java.util.Scanner;

public class Factorialfinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt(); 

        int result = 1; 


        

        for (int i = 1; i < n + 1; i++) {
            result *= i;
        }

        System.out.println("The factorial of " + n + " is: " + result); 


        sc.close();
    }
}
