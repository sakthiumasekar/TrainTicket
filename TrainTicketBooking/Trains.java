import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.Scanner;

public class Trains {
    public static String from;
    public static String to;
    public String trainName;
    public int availableTickets;
    public int price;

    static Trains t1 = new Trains();
    static Trains t2 = new Trains();
    static Trains t3 = new Trains();
    static Trains t4 = new Trains();
    static Trains t5 = new Trains();
    static Trains t6 = new Trains();

    static {
        // t1:A--->B
        t1.availableTickets = 61;
        t1.price = 15;
        t1.trainName = "A1";

        // t2:A--->C
        t2.availableTickets = 20;
        t2.price = 20;
        t2.trainName = "A2";

        // t3:B--->A
        t3.availableTickets = 55;
        t3.price = 10;
        t3.trainName = "A3";

        // t3:B--->C
        t4.availableTickets = 44;
        t4.price = 100;
        t4.trainName = "A4";

        // t3:C--->A
        t5.availableTickets = 40;
        t5.price = 50;
        t5.trainName = "A5";

        // t3:C--->B
        t6.availableTickets = 5;
        t6.price = 5;
        t6.trainName = "A6";

    }

    public static Trains stationselection(BufferedReader br) {

        try {
            System.out.println("From Station (A,B,C)");
            from = br.readLine().toUpperCase();
            System.out.println("To Station (A,B,C)");
            to = br.readLine().toUpperCase();

        } catch (Exception e) {
            System.out.println("Input error");
        }

        if (from.equals("A") && to.equals("B"))
            return t1;
        else if (from.equals("A") && to.equals("C"))
            return t2;
        else if (from.equals("B") && to.equals("A"))
            return t3;
        else if (from.equals("B") && to.equals("C"))
            return t4;
        else if (from.equals("C") && to.equals("A"))
            return t5;
        else
            return t6;
    }
}
