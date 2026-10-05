//  Day 4   6th Question   Auto-Genearated IDs

class Ticket {
    private static int counter = 100;

    private String id;
    private String passengerName;

    Ticket(String passengerName) {
        counter++;
        this.id = "T" + counter;
        this.passengerName = passengerName;
    }

    void display() {
        System.out.println("Ticket ID  : " + id);
        System.out.println("Passenger  : " + passengerName);
    }
}

public class TicketDemo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("Harsh Raj");
        Ticket t2 = new Ticket("Mohammed Mujeeb");
        Ticket t3 = new Ticket("Aradhana Pradhan");

        t1.display();
        System.out.println();
        t2.display();
        System.out.println();
        t3.display();
    }
}