//  Day 4  10th Question  Shopping Cart

class Item {
    String name;
    double price;
    int qty;

    Item(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    double getSubtotal() {
        return price * qty;
    }
}

class Cart {
    private Item[] items = new Item[10];
    private int count = 0;

    boolean addItem(Item item) {
        if (count >= items.length) {
            System.out.println("Cart is full, cannot add " + item.name);
            return false;
        }
        items[count] = item;
        count++;
        return true;
    }

    double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getSubtotal();
        }
        return total;
    }

    void printBill() {
        System.out.println("---------------- BILL ---------------------");
        System.out.printf("%-15s %8s %5s %10s%n", "Item", "Price", "Qty", "Subtotal");
        for (int i = 0; i < count; i++) {
            Item it = items[i];
            System.out.printf("%-15s %8.2f %5d %10.2f%n",
                    it.name, it.price, it.qty, it.getSubtotal());
        }
        System.out.println("--------------------------------------------");
        System.out.printf("%-30s %10.2f%n", "TOTAL", getTotal());
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new Item("Notebook", 45.50, 4));
        cart.addItem(new Item("Pen", 10.00, 10));
        cart.addItem(new Item("Backpack", 899.00, 1));

        cart.printBill();
    }
}