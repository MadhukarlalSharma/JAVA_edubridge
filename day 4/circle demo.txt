//  Day 4   1st  Question   Book Class

class Book {
    String title;
    String author;
    double price;

    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Wings of Fire";
        b1.author = "A. P. J. Abdul Kalam";
        b1.price = 350.0;

        Book b2 = new Book();
        b2.title = "Head First Java";
        b2.author = "Kathy Sierra";
        b2.price = 599.5;

        b1.display();
        System.out.println();
        b2.display();
    }
}