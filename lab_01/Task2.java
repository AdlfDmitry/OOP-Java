package dmitry;

import java.util.Scanner;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int InputSeconds = getInput(scan);
        if (InputSeconds > 0) {
            String formattedTime = calcTime(InputSeconds);
            System.out.println(formattedTime);
        }

    }

    public static int getInput(Scanner scan) {
        int input = scan.nextInt();
        if (input < 0) {
            System.out.println("Wrong value");
            return 0;
        } else {
            return input;
        }
    }

    public static String calcTime(int InputSeconds) {
        int hours = InputSeconds / 3600 % 24;
        int minutes = InputSeconds % 3600 / 60;
        int seconds = InputSeconds % 60;
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}
