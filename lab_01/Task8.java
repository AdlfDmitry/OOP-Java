package dmitry;

import java.util.Scanner;

public class Task8 {
    public Task8() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sequence of numbers (0 to exit)");
        int sum = 0;
        int count = 0;
        int number;
        do {
            number = scanner.nextInt();
            if (number != 0) {
                sum += number;
                ++count;
            }
        }
        while(number != 0);

        int average = sum / count;
        System.out.println("Average value in sequence " + average);
    }
}
