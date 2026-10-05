//   Day 6  10th Question  Abstraction + interface together

abstract class Notification {
    protected String recipient;

    Notification(String recipient) {
        this.recipient = recipient;
    }

    abstract void send();
}

interface Schedulable {
    void schedule(String time);
}

class EmailNotification extends Notification implements Schedulable {
    EmailNotification(String recipient) {
        super(recipient);
    }

    @Override
    void send() {
        System.out.println("Sending EMAIL to " + recipient);
    }

    @Override
    public void schedule(String time) {
        System.out.println("Email to " + recipient + " scheduled for " + time);
    }
}

class SmsNotification extends Notification {
    SmsNotification(String recipient) {
        super(recipient);
    }

    @Override
    void send() {
        System.out.println("Sending SMS to " + recipient);
    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification("hratwork2025@gmail.com");
        Notification n2 = new SmsNotification("6200662377");

        n1.send();
        n2.send();

        System.out.println();

      
        Schedulable s = new EmailNotification("anita@example.com");
        s.schedule("9:00 AM");

       
        if (n1 instanceof Schedulable) {
            ((Schedulable) n1).schedule("6:30 PM");
        }
        if (n2 instanceof Schedulable) {
            ((Schedulable) n2).schedule("6:30 PM");
        } else {
            System.out.println("SMS notifications cannot be scheduled.");
        }
    }
}