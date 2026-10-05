//  Day 5   2nd Question  Wallet with controled access

class Wallet {
    private double balance;

    void addMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Enter a positive value.");
            return;
        }
        balance += amount;
    }

    boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Enter a positive value.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Payment of " + amount + " Failed: Insufficient Balance!");
            return false;
        }
        balance -= amount;
        return true;
    }

    double getBalance() {
        return balance;
    }
}

public class WalletDemo {
    public static void main(String[] args) {
        Wallet w = new Wallet();

        w.addMoney(500);
        System.out.println("After adding 500 : " + w.getBalance());

        w.pay(200);
        System.out.println("After paying 200 : " + w.getBalance());

        w.pay(1000);
        System.out.println("After paying 1000: " + w.getBalance());

        w.addMoney(-50);
        System.out.println("Final balance    : " + w.getBalance());
    }
}