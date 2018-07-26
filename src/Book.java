//Create a Book class that allows for Book title, author, description, price and isInStock variables
//
//The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method
//called getDisplayText() which prints the author, title and description.
//
//The application shall also contain getters and setters for each private member variable.

public class Book {
    //private variables
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;
    private int quantity = 0;


    //constructor
    public Book() {
        System.out.println("New book added.");
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //method - which I created. Could have used toString below and then cleaned up the formatting (quicker).

    public String getDisplayText() {
        return "Title:         " + title + "\n" +
                "Author:        " + author + "\n" +
                "Description:   " + description + "\n";
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }

}