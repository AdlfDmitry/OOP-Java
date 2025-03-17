package dmitry;

import java.util.Scanner;

public class Task5 {
    public Task5() {
    }

    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter snail up speed: ");
        int UsrSpeedUp = scan.nextInt();
        System.out.println("Enter snail down speed: ");
        int UsrSpeedDown = scan.nextInt();
        System.out.println("Enter tree height: ");
        int UsrTreeHeight = scan.nextInt();
        CalcTime(UsrSpeedUp, UsrSpeedDown, UsrTreeHeight);
    }

    public static void CalcTime(int UsrSpeedUp, int UsrSpeedDown, int UsrTreeHeight) {
        if (UsrSpeedUp > 0 && UsrSpeedDown > 0 && UsrTreeHeight > 0) {
            if (UsrSpeedUp == UsrSpeedDown) {
                System.out.println("Snail can not climb up!");
            } else {
                int Time = UsrTreeHeight / (UsrSpeedUp - UsrSpeedDown);
                if (Time > 0) {
                    System.out.println("Snail is gonna climb up in " + Time + " days!");
                } else {
                    System.out.println("Impossible!");
                }
            }
        } else {
            System.out.println("All parameters should be greater than 0!");
        }

    }
}