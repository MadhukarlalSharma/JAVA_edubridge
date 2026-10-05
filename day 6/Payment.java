//   Day 6   9th Question   Payment system with an interface

interface Payment {
    double fee(double amt);
    String name();
}

class UPI implements Payment {
    @Override
    public double fee(double amt) {
        return 0;
    }

    @Override
    public String name() {
        return "UPI";
    }
}

class Card implements Payment {
    @Override
    public double fee(double amt) {
        return amt * 0.02;
    }

    @Override
    public String name() {
        return "Card";
    }
}

class NetBanking implements Payment {
    @Override
    public double fee(double amt) {
        return 10;
    }

    @Override
    public String name() {
        return "Net Banking";
    }
}

public class PaymentDemo {
    static void checkout(Payment p, double amount) {
        double fee = p.fee(amount);
        System.out.println("Method : " + p.name());
        System.out.println("Amount : Rs." + amount);
        System.out.println("Fee    : Rs." + fee);
        System.out.println("Total  : Rs." + (amount + fee));
        System.out.println();
    }

    public static void main(String[] args) {
        checkout(new UPI(), 1000);
        checkout(new Card(), 1000);
        checkout(new NetBanking(), 1000);
    }
}