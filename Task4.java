package dmitry;

import java.util.Scanner;

public class Task4 {
    public Task4() {
    }

    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of strangers");
        int Amount = scan.nextInt();
        scan.nextLine();
        if (Amount > 0) {
            for(int i = 0; i < Amount; ++i) {
                System.out.println("Enter Name of stranger number " + (i + 1) + ": ");
                String StrName = scan.nextLine();
                System.out.println("Hello, " + StrName);
            }
        } else {
            System.out.println("Wrong amount of strangers!");
        }

    }
}
