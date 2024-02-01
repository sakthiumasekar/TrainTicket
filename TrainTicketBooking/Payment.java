import java.io.BufferedReader;
// import java.util.Scanner;
import java.io.IOException;

public class Payment {
    static void pay(BufferedReader br) throws NumberFormatException, IOException {
        int tot = TicketConfirmation.totalAmount;
        System.out.println("amount given");
        int amt = Integer.parseInt(br.readLine());
        if (amt >= tot) {
            int balance = amt - tot;
            System.out.println("Balance amount : " + balance);

        } else {
            System.out.println("No enough amount.");
            System.out.println("1 to proceed to pay, 0 to cancel payment and exit");
            choice(br);
        }
    }

    static void choice(BufferedReader br) throws NumberFormatException, IOException {
        try {
            int choice = Integer.parseInt(br.readLine());
            if (choice == 1)
                Payment.pay(br);
            else if (choice == 0) {
                return;
            } else {
                System.out.println("enter correct choice");
                choice(br);

            }
        } catch (Exception e) {
            System.out.println("Enter valid input");
            Payment.choice(br);
        }
    }
}
