import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class MovieBookingSystem {

    // Representation: 'O' = Available, 'X' = Booked
    private static final int ROWS = 5;
    private static final int COLS = 5;
    private static final char[][] seats = new char[ROWS][COLS];

    // Data structures as requested
    private static final List<Booking> bookings = new ArrayList<>();
    private static final Queue<String> waitingList = new ArrayDeque<>();

    // Booking record
    static class Booking {
        int bookingId;
        String customerName;
        int row;
        int col;

        public Booking(int bookingId, String customerName, int row, int col) {
            this.bookingId = bookingId;
            this.customerName = customerName;
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString() {
            return "ID #" + bookingId + " | " + customerName + " -> Seat [" + (row + 1) + "," + (col + 1) + "]";
        }
    }

    private static int nextBookingId = 101;

    public static void main(String[] args) {
        initializeSeats();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MOVIE TICKET BOOKING SYSTEM ---");
            System.out.println("1. View Seating Chart");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. View All Bookings");
            System.out.println("5. View Waiting List");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> displaySeats();
                case 2 -> handleBooking(sc);
                case 3 -> handleCancellation(sc);
                case 4 -> displayBookings();
                case 5 -> displayWaitingList();
                case 6 -> {
                    System.out.println("Thank you for using the booking system. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please choose between 1 and 6.");
            }
        }
    }

    // Initialize all seats as available ('O')
    private static void initializeSeats() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                seats[r][c] = 'O';
            }
        }
    }

    // Display the 2D seating layout
    private static void displaySeats() {
        System.out.println("\n--- Screen This Way ---");
        System.out.print("    ");
        for (int c = 1; c <= COLS; c++) {
            System.out.print("C" + c + "  ");
        }
        System.out.println();

        for (int r = 0; r < ROWS; r++) {
            System.out.printf("R%d  ", (r + 1));
            for (int c = 0; c < COLS; c++) {
                System.out.print("[" + seats[r][c] + "] ");
            }
            System.out.println();
        }
        System.out.println("(O = Available, X = Reserved)");
    }

    // Check if any seat is free
    private static boolean isHouseFull() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (seats[r][c] == 'O') return false;
            }
        }
        return true;
    }

    // Handle ticket booking
    private static void handleBooking(Scanner sc) {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine().trim();

        if (isHouseFull()) {
            System.out.println("All seats are sold out!");
            waitingList.offer(name);
            System.out.println(name + " has been added to the waiting list (Position: " + waitingList.size() + ").");
            return;
        }

        displaySeats();
        System.out.print("Enter Row (1-" + ROWS + "): ");
        int row = sc.nextInt() - 1;
        System.out.print("Enter Column (1-" + COLS + "): ");
        int col = sc.nextInt() - 1;
        sc.nextLine(); // Consume newline

        if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
            System.out.println("Invalid seat coordinates.");
            return;
        }

        if (seats[row][col] == 'X') {
            System.out.println("Seat is already occupied. Would you like to join the waiting list? (y/n): ");
            String ans = sc.nextLine().trim().toLowerCase();
            if (ans.equals("y")) {
                waitingList.offer(name);
                System.out.println(name + " added to the waiting list.");
            }
            return;
        }

        // Reserve seat and record booking
        seats[row][col] = 'X';
        Booking booking = new Booking(nextBookingId++, name, row, col);
        bookings.add(booking);

        System.out.println("Booking confirmed! " + booking);
    }

    // Handle cancellation and automatically assign released seat to queue head
    private static void handleCancellation(Scanner sc) {
        if (bookings.isEmpty()) {
            System.out.println("No active bookings to cancel.");
            return;
        }

        System.out.print("Enter Booking ID to cancel: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        Booking target = null;
        for (Booking b : bookings) {
            if (b.bookingId == id) {
                target = b;
                break;
            }
        }

        if (target == null) {
            System.out.println("Booking ID not found.");
            return;
        }

        bookings.remove(target);
        System.out.println("Booking #" + id + " for " + target.customerName + " has been cancelled.");

        // Check if someone is on the waiting list to claim this seat
        if (!waitingList.isEmpty()) {
            String nextCustomer = waitingList.poll();
            Booking rebooked = new Booking(nextBookingId++, nextCustomer, target.row, target.col);
            bookings.add(rebooked);
            System.out.println("Seat [" + (target.row + 1) + "," + (target.col + 1) + 
                               "] reassigned to waiting list customer: " + nextCustomer + " (New " + rebooked + ")");
        } else {
            seats[target.row][target.col] = 'O';
            System.out.println("Seat [" + (target.row + 1) + "," + (target.col + 1) + "] is now available.");
        }
    }

    // View active bookings
    private static void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No active bookings.");
            return;
        }
        System.out.println("\n--- Active Bookings ---");
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }

    // View waiting list
    private static void displayWaitingList() {
        if (waitingList.isEmpty()) {
            System.out.println("Waiting list is empty.");
            return;
        }
        System.out.println("\n--- Current Waiting List ---");
        int pos = 1;
        for (String name : waitingList) {
            System.out.println(pos++ + ". " + name);
        }
    }
}
package mp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Moviebookingsystem {

    // Representation: 'O' = Available, 'X' = Booked
    private static final int ROWS = 5;
    private static final int COLS = 5;
    private static final char[][] seats = new char[ROWS][COLS];

    // Data structures as requested
    private static final List<Booking> bookings = new ArrayList<>();
    private static final Queue<String> waitingList = new ArrayDeque<>();

    // Booking record
    static class Booking {
        int bookingId;
        String customerName;
        int row;
        int col;

        public Booking(int bookingId, String customerName, int row, int col) {
            this.bookingId = bookingId;
            this.customerName = customerName;
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString() {
            return "ID #" + bookingId + " | " + customerName + " -> Seat [" + (row + 1) + "," + (col + 1) + "]";
        }
    }

    private static int nextBookingId = 101;

    public static void main(String[] args) {
        initializeSeats();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MOVIE TICKET BOOKING SYSTEM ---");
            System.out.println("1. View Seating Chart");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. View All Bookings");
            System.out.println("5. View Waiting List");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> displaySeats();
                case 2 -> handleBooking(sc);
                case 3 -> handleCancellation(sc);
                case 4 -> displayBookings();
                case 5 -> displayWaitingList();
                case 6 -> {
                    System.out.println("Thank you for using the booking system. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please choose between 1 and 6.");
            }
        }
    }

    private static void initializeSeats() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                seats[r][c] = 'O';
            }
        }
    }

    private static void displaySeats() {
        System.out.println("\n--- Screen This Way ---");
        System.out.print("    ");
        for (int c = 1; c <= COLS; c++) {
            System.out.print("C" + c + "  ");
        }
        System.out.println();

        for (int r = 0; r < ROWS; r++) {
            System.out.printf("R%d  ", (r + 1));
            for (int c = 0; c < COLS; c++) {
                System.out.print("[" + seats[r][c] + "] ");
            }
            System.out.println();
        }
        System.out.println("(O = Available, X = Reserved)");
    }

    private static boolean isHouseFull() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (seats[r][c] == 'O') return false;
            }
        }
        return true;
    }

    private static void handleBooking(Scanner sc) {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine().trim();

        if (isHouseFull()) {
            System.out.println("All seats are sold out!");
            waitingList.offer(name);
            System.out.println(name + " has been added to the waiting list (Position: " + waitingList.size() + ").");
            return;
        }

        displaySeats();
        System.out.print("Enter Row (1-" + ROWS + "): ");
        int row = sc.nextInt() - 1;
        System.out.print("Enter Column (1-" + COLS + "): ");
        int col = sc.nextInt() - 1;
        sc.nextLine();

        if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
            System.out.println("Invalid seat coordinates.");
            return;
        }

        if (seats[row][col] == 'X') {
            System.out.println("Seat is already occupied. Would you like to join the waiting list? (y/n): ");
            String ans = sc.nextLine().trim().toLowerCase();
            if (ans.equals("y")) {
                waitingList.offer(name);
                System.out.println(name + " added to the waiting list.");
            }
            return;
        }

        seats[row][col] = 'X';
        Booking booking = new Booking(nextBookingId++, name, row, col);
        bookings.add(booking);

        System.out.println("Booking confirmed! " + booking);
    }

    private static void handleCancellation(Scanner sc) {
        if (bookings.isEmpty()) {
            System.out.println("No active bookings to cancel.");
            return;
        }

        System.out.print("Enter Booking ID to cancel: ");
        int id = sc.nextInt();
        sc.nextLine();

        Booking target = null;
        for (Booking b : bookings) {
            if (b.bookingId == id) {
                target = b;
                break;
            }
        }

        if (target == null) {
            System.out.println("Booking ID not found.");
            return;
        }

        bookings.remove(target);
        System.out.println("Booking #" + id + " for " + target.customerName + " has been cancelled.");

        if (!waitingList.isEmpty()) {
            String nextCustomer = waitingList.poll();
            Booking rebooked = new Booking(nextBookingId++, nextCustomer, target.row, target.col);
            bookings.add(rebooked);
            System.out.println("Seat [" + (target.row + 1) + "," + (target.col + 1) + 
                               "] reassigned to waiting list customer: " + nextCustomer + " (New " + rebooked + ")");
        } else {
            seats[target.row][target.col] = 'O';
            System.out.println("Seat [" + (target.row + 1) + "," + (target.col + 1) + "] is now available.");
        }
    }

    private static void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No active bookings.");
            return;
        }
        System.out.println("\n--- Active Bookings ---");
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }

    private static void displayWaitingList() {
        if (waitingList.isEmpty()) {
            System.out.println("Waiting list is empty.");
            return;
        }
        System.out.println("\n--- Current Waiting List ---");
        int pos = 1;
        for (String name : waitingList) {
            System.out.println(pos++ + ". " + name);
        }
    }
}