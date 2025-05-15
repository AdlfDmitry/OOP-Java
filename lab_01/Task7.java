package dmitry;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sequence of numbers (0 to exit)");
        int max = Integer.MIN_VALUE;
        int number;
        do {
            number = scanner.nextInt();
            if (number != 0 && number > max) {
                max = number;
            }
        }
        while (number != 0);
        if (max == Integer.MIN_VALUE) {
            System.out.println("Sequence contains only zero values! ");
        }
        else {
            System.out.println("Maximal element of sequence is : " + max);
        }
    }
}
