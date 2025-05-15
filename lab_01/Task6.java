package dmitry;

import java.util.Scanner;

public class Task6 {
    public Task6() {
    }

    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter bill size: ");
        double Bill = scan.nextDouble();
        System.out.println("Enter friends amount: ");
        int FriendsQuantity = scan.nextInt();
        if (Bill > (double)0.0F && FriendsQuantity > 0) {
            double IndividualPayment = (Bill * 1.1) / FriendsQuantity;
            System.out.println(IndividualPayment);
        } else {
            System.out.println("Wrong values!");
        }

    }
}
