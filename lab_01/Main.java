package dmitry;

import java.util.Scanner;

class Task1 {
    Task1() {
    }

    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        String usrStr = scan.nextLine();
        System.out.print(usrStr);
        scan.close();
    }
}
