package dmitry;

import java.util.Scanner;

public class Task3 {
    final static int pass = 12345;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the secret password: ");
        int input =  scan.nextInt();
        if (input == pass){
            System.out.println("Hello, Agent");
        }else{
            System.out.println("Access denied");
        }
        scan.close();
    }
}