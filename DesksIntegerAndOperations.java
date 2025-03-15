import java.util.Scanner;

public class DesksIntegerAndOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int outputGroup =(group1+group2+group3+1)/2;
        System.out.println(outputGroup);
    }
}
