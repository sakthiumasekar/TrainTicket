// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;

public class TicketConfirmation {
    static int seats;
    static int totalAmount;

    public static void ticket(BufferedReader br) throws NumberFormatException, IOException {
        Trains train = Trains.stationselection(br);
        int amount = train.price;
        System.out.println("Enter number of seats:");
        seats = Integer.parseInt(br.readLine());
        // amount = train.price;

        if (seats <= train.availableTickets) {
            System.out.println(seats);
            totalAmount = seats * amount;
            System.out.println("fare per tickets" + amount + "Total fare is " + totalAmount);
            System.out.println("Type pay to proceed");
            Payment.pay(br);
            train.availableTickets -= seats;
            System.out.println(train.availableTickets);
            new ShowTicket();
            System.out.println("enter 1 to select other train,2  to exit");
            choice(br);
        } else {
            System.out.println("only" + train.availableTickets + " seats available.");
            System.out.println("enter 1 to select other train,2  to exit");
            choice(br);
        }
    }

    static void choice(BufferedReader br) {
        int choice;
        try {
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    TicketConfirmation.ticket(br);
                    break;

                case 2:
                    return;
                default:
                    System.out.println("Enter valid choice!!!");
                    choice(br);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Enter valid input");
            TicketConfirmation.choice(br);
        }
    }
}
