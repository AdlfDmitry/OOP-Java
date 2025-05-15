package dmitry;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();

        if (b >= a){
            System.out.println("Impossible");
            System.exit(0);
        }

        int days = (h - b - 1) / (a - b) + 1;

        System.out.println(days);
        scan.close();
    }
}