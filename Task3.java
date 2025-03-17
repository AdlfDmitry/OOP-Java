package dmitry;

import java.util.Scanner;

public class Task3 {
    private static final int password = 1234;

    public Task3() {
    }

    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter secret password: ");
        int InPass = scan.nextInt();
        if (InPass == 1234) {
            System.out.println("Hello Agent!");
        } else {
            System.out.println("Access denied!");
        }

    }
}
