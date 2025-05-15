package dmitry;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Result: " + root1 + " " + root2);
        }
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Result: " + root);
        }
        else {
            System.out.println("No roots");
        }
    }
}