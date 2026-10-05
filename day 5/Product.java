//  Day 5   1st  Question   Encapsulated Product

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price: " + price + ". Price cannot be negative.");
        } else {
            this.price = price;
        }
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p = new Product("HP Laptop", 55000);
        System.out.println("Name  : " + p.getName());
        System.out.println("Price : " + p.getPrice());

        p.setPrice(-500);
        System.out.println("Price after invalid update : " + p.getPrice());

        p.setPrice(52000);
        System.out.println("Price after valid update   : " + p.getPrice());
    }
}