
import static javax.swing.JOptionPane.*;

class Book {
    String titel;
    String author;
    int id;
    double price;

    public Book(String titel, String author, int id, double price) {
        this.titel = titel;
        this.author = author;
        if (id > 0) {
            this.id = id;
        }
        if (price > 0) {
            this.price = price;
        }
    }

    public String getTitel() {
        return titel;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String printOut() {
        String out = "The book you have ordered: \n" +
                "Titel: " + titel + "\n" +
                "Author: " + author + "\n" +
                "ID number: " + id + "\n" +
                "Price: " + price;
        return out;
    }
}

public class OrderBook {
    public static void main(String[] args) {
        String titel = showInputDialog("What is the titel of the book you want to order?");
        String author = showInputDialog("Who is the author of the book you want to order?");
        String inID = showInputDialog("What is the Id-number of the book you want to order?");

        String inPrice = showInputDialog("Do you know the price of the book?");


        try {
            int id = Integer.parseInt(inID);
            double price = Double.parseDouble(inPrice);

            Book book1 = new Book(titel, author, id, price);
            String out = book1.printOut();

            if (price > 0 && id > 0 && titel != null && author != null) {
                showMessageDialog(null, out);
            } else {
                showMessageDialog(null, "Something went wrong, please try again!");
            }
        } catch (NumberFormatException e) {
            showMessageDialog(null, "Unsupported operation, please try again!");
        }

    }
}


