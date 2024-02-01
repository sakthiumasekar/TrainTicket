// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booking {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        TicketConfirmation.ticket(input);

    }
}