
class Account {
    String holder;
    protected double balance;

    Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    void display() {
        System.out.println(holder + " | Balance: Rs." + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String holder, double balance) {
        super(holder, balance);
    }

    void addInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Interest of Rs." + interest + " added at " + rate + "%");
    }
}

class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 5000;

    CurrentAccount(String holder, double balance) {
        super(holder, balance);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (balance - amount < -OVERDRAFT_LIMIT) {
            System.out.println("Withdrawal of Rs." + amount + " \nDenied: Overdraft limit of Rs."
                    + OVERDRAFT_LIMIT + " exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrew Rs." + amount);
        }
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Harsh Raj", 10000);
        s.display();
        s.addInterest(4);
        s.display();

        System.out.println();

        CurrentAccount c = new CurrentAccount("Asha Mehra", 2000);
        c.display();
        c.withdraw(5000);   
        c.display();
        c.withdraw(3000);  
        c.display();
    }
}